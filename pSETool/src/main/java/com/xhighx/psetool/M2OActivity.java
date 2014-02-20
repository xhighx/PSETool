package com.xhighx.psetool;

import java.util.List;

import com.xhighx.psetool.wizard.M2OWizardModel;

import model.AbstractWizardModel;
import model.ModelCallbacks;
import model.Page;
import view.PageFragmentCallbacks;
import view.ReviewFragment;
import view.ReviewFragment.Callbacks;
import view.StepPagerStrip;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class M2OActivity extends FragmentActivity implements PageFragmentCallbacks, ReviewFragment.Callbacks, ModelCallbacks{

	private ViewPager mPager;
	private M2OItemPagerAdapter mPagerAdapter;
	
	private boolean mEditingAfterReview;
	
	private AbstractWizardModel mWizardModel = new M2OWizardModel(this);
	
	private boolean mConsumePageSelectedEvent;
	
	private Button mNextButton;
	private Button mPrevButton;
	
	private List<Page> mCurrentPageSequence;
	private PagerTitleStrip mPagerTitleStrip;
	
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_m2o);
        
        if(savedInstanceState != null){
        	mWizardModel.load(savedInstanceState.getBundle("model"));
        }
        
        mWizardModel.registerListener(this);

        mPagerAdapter = new M2OItemPagerAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mPagerAdapter);
        mPagerTitleStrip = (PagerTitleStrip) findViewById(R.id.pager_title_strip);
      /*  mPagerTitleStrip
                        .setOnPageSelectedListener(new StepPagerStrip.OnPageSelectedListener() {
                                @Override
                                public void onPageStripSelected(int position) {
                                        position = Math.min(mPagerAdapter.getCount() - 1,
                                                        position);
                                        if (mPager.getCurrentItem() != position) {
                                                mPager.setCurrentItem(position);
                                        }
                                }
                        });
*/
        mNextButton = (Button) findViewById(R.id.next_button);
        mPrevButton = (Button) findViewById(R.id.prev_button);

        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                @Override
                public void onPageSelected(int position) {
                      //  mStepPagerStrip.setCurrentPage(position);

                        if (mConsumePageSelectedEvent) {
                                mConsumePageSelectedEvent = false;
                                return;
                        }

                        mEditingAfterReview = false;
                        updateBottomBar();
                }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        if (mPager.getCurrentItem() == mCurrentPageSequence.size()) {
                                DialogFragment dg = new DialogFragment() {
                                        @Override
                                        public Dialog onCreateDialog(Bundle savedInstanceState) {
                                                return new AlertDialog.Builder(getActivity())
                                                                .setMessage(R.string.submit_confirm_message)
                                                                .setPositiveButton(
                                                                                R.string.submit_confirm_button,
                                                                                null)
                                                                .setNegativeButton(android.R.string.cancel,
                                                                                null).create();
                                        }
                                };
                                dg.show(getSupportFragmentManager(), "place_order_dialog");
                        } else {
                                if (mEditingAfterReview) {
                                        mPager.setCurrentItem(mPagerAdapter.getCount() - 1);
                                } else {
                                        mPager.setCurrentItem(mPager.getCurrentItem() + 1);
                                }
                        }
                }
        });

        mPrevButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        mPager.setCurrentItem(mPager.getCurrentItem() - 1);
                }
        });

        onPageTreeChanged();
        updateBottomBar();
        
        
        
        
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_project_category, menu);
        return true;
    }

	@Override
	public void onPageDataChanged(Page page) {
		 if (page.isRequired()) {
             if (recalculateCutOffPage()) {
                     mPagerAdapter.notifyDataSetChanged();
                     updateBottomBar();
             }
     }
		
	}

	@Override
	public void onPageTreeChanged() {
		 mCurrentPageSequence = mWizardModel.getCurrentPageSequence();
         recalculateCutOffPage();
      //   mStepPagerStrip.setPageCount(mCurrentPageSequence.size() + 1); // + 1 =
         mPagerAdapter.notifyDataSetChanged();
         updateBottomBar();
		
	}

	@Override
	public Page onGetPage(String key) {
		
		return mWizardModel.findByKey(key);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
        outState.putBundle("model", mWizardModel.save());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
        mWizardModel.unregisterListener(this);
	}

	@Override
	public void startActivityForResult(Intent intent, int requestCode) {
		super.startActivityForResult(intent, requestCode);
	}


	@Override
	public AbstractWizardModel onGetModel() {
		return mWizardModel;
	}

	@Override
	public void onEditScreenAfterReview(String pageKey) {
		 for (int i = mCurrentPageSequence.size() - 1; i >= 0; i--) {
             if (mCurrentPageSequence.get(i).getKey().equals(pageKey)) {
                     mConsumePageSelectedEvent = true;
                     mEditingAfterReview = true;
                     mPager.setCurrentItem(i);
                     updateBottomBar();
                     break;
             }
     }
	}
	private boolean recalculateCutOffPage() {
          // Cut off the pager adapter at first required page that isn't completed
          int cutOffPage = mCurrentPageSequence.size() + 1;
          for (int i = 0; i < mCurrentPageSequence.size(); i++) {
                  Page page = mCurrentPageSequence.get(i);
                  if (page.isRequired() && !page.isCompleted()) {
                          cutOffPage = i;
                          break;
                  }
          }

          if (mPagerAdapter.getCutOffPage() != cutOffPage) {
                  mPagerAdapter.setCutOffPage(cutOffPage);
                  return true;
          }

          return false;
  }
	private void updateBottomBar() {
        int position = mPager.getCurrentItem();
        if (position == mCurrentPageSequence.size()) {
                mNextButton.setText(R.string.complete);
                mNextButton.setBackgroundResource(R.drawable.finish_background);
                mNextButton.setTextAppearance(this, R.style.TextAppearanceFinish);
        } else {
                mNextButton.setText(mEditingAfterReview ? R.string.review
                                : R.string.next);
                mNextButton
                                .setBackgroundResource(android.R.drawable.list_selector_background);
                TypedValue v = new TypedValue();
                getTheme().resolveAttribute(android.R.attr.textAppearanceMedium, v,
                                true);
                mNextButton.setTextAppearance(this, v.resourceId);
                mNextButton.setEnabled(position != mPagerAdapter.getCutOffPage());
        }

        mPrevButton.setVisibility(position <= 0 ? View.INVISIBLE : View.VISIBLE);
}

	public class M2OItemPagerAdapter extends FragmentStatePagerAdapter{

		private int mCutOffPage;
		private Fragment mPrimaryItem;
		
		public M2OItemPagerAdapter(FragmentManager fm) {
			super(fm);
			
		}

		@Override
		public Fragment getItem(int i) {
			if(i>= mCurrentPageSequence.size()){
				return new ReviewFragment();
			}
			return mCurrentPageSequence.get(i).createFragment();
		}

		@Override
		public int getCount() {
			if(mCurrentPageSequence == null){
				return 0;
			}
			return Math.min(mCutOffPage + 1, mCurrentPageSequence.size() + 1);
		}

		@Override
		public void setPrimaryItem(ViewGroup container, int position,
				Object object) {
			super.setPrimaryItem(container, position, object);
			mPrimaryItem = (Fragment) object;
		}

		@Override
		public int getItemPosition(Object object) {
			if(object == mPrimaryItem){
				return POSITION_UNCHANGED;
			}
			return POSITION_NONE;
		}


		/**
		 * @return the mCutOffPage
		 */
		public int getCutOffPage() {
			return mCutOffPage;
		}

		/**
		 * @param CutOffPage the Cut Off Page to set
		 */
		public void setCutOffPage(int CutOffPage) {
			if(CutOffPage < 0){
				CutOffPage = Integer.MAX_VALUE;
			}
			
			this.mCutOffPage = CutOffPage;
		}
		
	}
}
