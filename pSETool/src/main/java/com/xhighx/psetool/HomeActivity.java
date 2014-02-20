package com.xhighx.psetool;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener;
import com.xhighx.psetool.content.CementSidingProjectHelper;
import com.xhighx.psetool.content.ChainlinkFenceProjectHelper;
import com.xhighx.psetool.content.CompositeFenceProjectHelper;
import com.xhighx.psetool.content.DeckProjectHelper;
import com.xhighx.psetool.content.DoorProjectHelper;
import com.xhighx.psetool.content.GutterProjectHelper;
import com.xhighx.psetool.content.InsulationProjectHelper;
import com.xhighx.psetool.content.MetalFenceProjectHelper;
import com.xhighx.psetool.content.ProjectHelper;
import com.xhighx.psetool.content.RoofProjectHelper;
import com.xhighx.psetool.content.VinylFenceProjectHelper;
import com.xhighx.psetool.content.VinylSidingProjectHelper;
import com.xhighx.psetool.content.WindowProjectHelper;
import com.xhighx.psetool.content.WoodFenceProjectHelper;
import com.xhighx.psetool.dialog.AboutDialogFragment;
import com.xhighx.psetool.dialog.MinMarginDialogFragment;
import com.xhighx.psetool.model.Cart;
import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class HomeActivity extends FragmentActivity {
	
	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
	
	ShoppingCartAdapter mShoppingCartAdapter;
	ArrayAdapter<ItemAssortment> mAssortmentSpinnerAdapter;
	ArrayAdapter<Item> mAssortmentListAdapter;
	
	ActionBar mActionBar;
	ActionBarDrawerToggle mDrawerToggle;
	
	
	CartView cartView;
	DrawerLayout mDrawerLayout;
	SlidingUpPanelLayout mSlidingLayout;
	Boolean isCartPanelShown = null;
	
	ListView mShoppingCartListView;
	ListView mAssortmentListView;
    CheckBox mSelectAllItemInAssortment;
	ListView mDrawerListView;
	Spinner mAssortmentSpinner;
	CharSequence mDrawerTitle;
	CharSequence mTitle;
	
	List<ItemAssortment> mCategoryAssortments;
	List<Item> mSelectedAssortment;
	ProjectHelper mProjectAssortmentProvider;
	
	String mCategory;
	String[] mProjectCategories;
	
	Cart mCart;
	
	public void setCheckedItems(ListView v){
		v.clearChoices();
		for(int i = 0; i < v.getCount(); i++){
			if(mShoppingCartAdapter.contains((Item) v.getAdapter().getItem(i))){
				v.setItemChecked(i, true);
			}else{
				v.setItemChecked(i, false);
			}
		}
		
	}

    public ProjectAssortmentProvider getCategoryProvider(int res){
        switch (res){
            case R.string.ARG_CATEGORY_CEMENT_SIDING:
                mProjectAssortmentProvider = new CementSidingProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_CHAINLINK_FENCE:
                mProjectAssortmentProvider = new ChainlinkFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_COMPOSITE_FENCE:
                mProjectAssortmentProvider = new CompositeFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_DOOR:
                mProjectAssortmentProvider = new DoorProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_GUTTER:
                mProjectAssortmentProvider = new GutterProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_METAL_FENCE:
                mProjectAssortmentProvider = new MetalFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_VINYL_FENCE:
                mProjectAssortmentProvider = new VinylFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_VINYL_SIDING:
                mProjectAssortmentProvider = new VinylSidingProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_WINDOW:
                mProjectAssortmentProvider = new WindowProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_SHINGLE_ROOF:
                mProjectAssortmentProvider = new RoofProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_METAL_ROOF:
                mProjectAssortmentProvider = new RoofProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_WOOD_FENCE:
                mProjectAssortmentProvider = new WoodFenceProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_INSULATION:
                mProjectAssortmentProvider = new InsulationProjectHelper();
                return mProjectAssortmentProvider;
            case R.string.ARG_CATEGORY_DECKING:
                mProjectAssortmentProvider = new DeckProjectHelper();
                return mProjectAssortmentProvider;
        }
        return null;
    }
	
	public void setCategory(int res){
		switch (res){
		case R.string.ARG_CATEGORY_CEMENT_SIDING:
			mProjectAssortmentProvider = new CementSidingProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_CHAINLINK_FENCE:
			mProjectAssortmentProvider = new ChainlinkFenceProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_COMPOSITE_FENCE:
			mProjectAssortmentProvider = new CompositeFenceProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_DOOR:
			mProjectAssortmentProvider = new DoorProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			mAssortmentSpinnerAdapter.notifyDataSetInvalidated();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_GUTTER:
			mProjectAssortmentProvider = new GutterProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_METAL_FENCE:
			mProjectAssortmentProvider = new MetalFenceProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_VINYL_FENCE:
			mProjectAssortmentProvider = new VinylFenceProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_VINYL_SIDING:
			mProjectAssortmentProvider = new VinylSidingProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_WINDOW:
			mProjectAssortmentProvider = new WindowProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_SHINGLE_ROOF:
			mProjectAssortmentProvider = new RoofProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_METAL_ROOF:
			mProjectAssortmentProvider = new RoofProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_WOOD_FENCE:
			mProjectAssortmentProvider = new WoodFenceProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_INSULATION:
			mProjectAssortmentProvider = new InsulationProjectHelper();
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			return;
		case R.string.ARG_CATEGORY_DECKING:
			mProjectAssortmentProvider = new DeckProjectHelper();	
			mCategoryAssortments = mProjectAssortmentProvider.getProjectAssortments();
			resetCategory(mCategoryAssortments);
			
			return;
		}
	}
	
	public void resetCategory(List<ItemAssortment> categoryAssortments){
		mAssortmentSpinnerAdapter.notifyDataSetInvalidated();
		mAssortmentSpinnerAdapter.clear();
		mAssortmentSpinnerAdapter.addAll(categoryAssortments);
		mAssortmentSpinnerAdapter.notifyDataSetChanged();
		setCheckedItems(mAssortmentListView);
		mAssortmentListAdapter.notifyDataSetChanged();
	}
	
	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_project_category, menu);
        return super.onCreateOptionsMenu(menu);
	}
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project);
		mCategoryAssortments = new ArrayList<ItemAssortment>();
		mSelectedAssortment = new ArrayList<Item>();
		
  		mActionBar = getActionBar();
  		mActionBar.setDisplayHomeAsUpEnabled(true);
		mActionBar.setHomeButtonEnabled(true);
		
  		mProjectCategories = getResources().getStringArray(R.array.project_categories);
 		mCart = new Cart();
 		cartView = new CartView();
 		cartView.cartHeader = (LinearLayout)findViewById(R.layout.cart_header);
		cartView.cartTotaltv = (TextView) findViewById(R.id.cart_total);
		cartView.cartCounttv = (TextView) findViewById(R.id.cart_item_quantity);
		cartView.cartSubtotaltv = (TextView) findViewById(R.id.cart_subtotal);
		cartView.cartTaxtv = (TextView) findViewById(R.id.cart_tax);
        cartView.cartListView = (ListView)findViewById(R.id.cart_listview);

        cartView.cartOptionsimgbtn = (ImageButton) findViewById(R.id.cart_options_imgbtn);
        cartView.cartOptionsimgbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                showCartOptionMenu(view);
            }
        });



		cartView.cartToggledCheckBox = (CheckBox) findViewById(R.id.cart_toggled_checkbox);

		cartView.cartToggledCheckBox.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
                boolean checked = ((CheckBox)v).isChecked();

                if(!checked){
                    mSlidingLayout.collapsePane();
                }else{
                    mSlidingLayout.expandPane();
                }
			}
			
		});
		

  		
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerListView =  (ListView) findViewById(R.id.project_categories_drawer_list);
		mDrawerListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, mProjectCategories));
		mDrawerListView.setOnItemClickListener(new DrawerItemClickListener());
		if(savedInstanceState == null){
			mDrawerListView.setSelection(0);
		}
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		mDrawerToggle = new ActionBarDrawerToggle(this, 
				mDrawerLayout, 
				R.drawable.ic_drawer, 
				R.string.drawer_open, 
				R.string.drawer_close){
			
			@Override
			public void onDrawerClosed(View view){
				getActionBar().setTitle(mTitle);
				invalidateOptionsMenu();
			}
			
			@Override
			public void onDrawerOpened(View drawerView){
				getActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu();
			}
		};
		 		
		mSlidingLayout = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout_panel);
		mSlidingLayout.setShadowDrawable(getResources().getDrawable(com.sothree.slidinguppanel.library.R.drawable.above_shadow));
		mSlidingLayout.setDragView(cartView.cartHeader);
		mSlidingLayout.setSlidingEnabled(false);
		mSlidingLayout.setPanelSlideListener(new PanelSlideListener(){

			@Override
			public void onPanelSlide(View panel, float slideOffset) {
				
			}

			@Override
			public void onPanelCollapsed(View panel) {
				isCartPanelShown = false;
				
			}

			@Override
			public void onPanelExpanded(View panel) {
				isCartPanelShown = true;
				
			}
			
		});
		mShoppingCartAdapter = new ShoppingCartAdapter(this, mCart);
		
		cartView.cartListView.setAdapter(mShoppingCartAdapter); 
		mShoppingCartAdapter.registerDataSetObserver(new DataSetObserver(){

			@Override
			public void onChanged() {
				super.onChanged();
				cartView.cartCounttv.setText("( " + String.valueOf(mShoppingCartAdapter.getCount()) + " )");
				cartView.cartTotaltv.setText(currencyFormatter.format(mShoppingCartAdapter.cart.getCartTotal()));
				cartView.cartSubtotaltv.setText(currencyFormatter.format(mShoppingCartAdapter.cart.getCartSubtotal()));
				cartView.cartTaxtv.setText(currencyFormatter.format(mShoppingCartAdapter.cart.getCartTax()));
				setCheckedItems(mAssortmentListView);
			}
			
		});
		
		mAssortmentListView = (ListView) findViewById(R.id.assortment_listView);
		//mAssortmentListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
		mAssortmentListAdapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_multiple_choice, mSelectedAssortment);
		mAssortmentListView.setAdapter(mAssortmentListAdapter);
		mAssortmentListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		mAssortmentListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int pos,
					long id) {
				Item item = mAssortmentListAdapter.getItem(pos);
				if(!mShoppingCartAdapter.contains(item)){
					mShoppingCartAdapter.addItem(mAssortmentListAdapter.getItem(pos));
					mShoppingCartAdapter.notifyDataSetChanged();
				}else if(mShoppingCartAdapter.contains(item)){
					mShoppingCartAdapter.deleteItem(item);
				}
			}
			
		});

		mSelectAllItemInAssortment = (CheckBox)findViewById(R.id.assortment_add_all_checkbox);
		
		
		mAssortmentSpinner = (Spinner) findViewById(R.id.assortment_selection_spinner);
		mAssortmentSpinnerAdapter = new ArrayAdapter<ItemAssortment>(this, android.R.layout.simple_spinner_item, mCategoryAssortments );
		mAssortmentSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mAssortmentSpinner.setAdapter(mAssortmentSpinnerAdapter);
		
		mAssortmentSpinner.setOnItemSelectedListener(new OnItemSelectedListener(){
					
			@Override
			public void onItemSelected(AdapterView<?> parent, View v,
					int pos, long id) {		
				mSelectedAssortment =  mCategoryAssortments.get(pos).getItems();
				mAssortmentListAdapter.clear();
				mAssortmentListAdapter.addAll(mSelectedAssortment);
				setCheckedItems(mAssortmentListView);
				mAssortmentListAdapter.notifyDataSetChanged();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
			}
			
		});
		
	}
	
	public class ShoppingCartAdapter extends BaseAdapter{
		
		private Context context;
		private Cart cart;
		
		
		public ShoppingCartAdapter(Context context, Cart cart) {
			super();
			this.context = context;
			this.cart = cart;
		}
		
		
		
		public boolean contains(Item item){
			boolean contains = false;
			if(cart.getItems().contains(item)){
				contains = true; 
			}
			return contains;
		}
		public void deleteItem(Item item){
			if(cart.getItems().contains(item)){
				cart.getItems().remove(item);
				notifyDataSetChanged();
			}
		}
		public void clearQuantities(){
			for(int i = 0; i < getCount(); i++ ){
				cart.getItems().get(i).setQuantity(0);
			}
			notifyDataSetChanged();
		}
		public void deleteItem(int position){
			cart.getItems().remove(position);
			notifyDataSetChanged();
		}
		public void deleteAll(){
			cart.getItems().clear();
			notifyDataSetChanged();
		}
		public void addItems(List<Item> selectedItems) {
			cart.getItems().addAll(selectedItems);
			notifyDataSetChanged();
		}
		public void addItem(Item item) {
			cart.getItems().add(item);
			notifyDataSetChanged();
		}
		
		
		
		
		@Override
		public int getCount() {
			return cart.getItemCount();
		}

		@Override
		public Item getItem(int position) {
			return cart.getItems().get(position);
		}

		@Override
		public long getItemId(int position) {
			return cart.getItems().get(position).hashCode();
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			final ViewItem item;
			NumberFormat currencyformatter = NumberFormat.getCurrencyInstance();	
	        if (convertView == null) {
	            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            convertView = inflater.inflate(R.layout._cart_item_view, null);
	            item = new ViewItem();
	            item.itemName = (TextView) convertView.findViewById(R.id.fragment_cartitem_descriptiontv);
	            item.itemSku = (TextView) convertView.findViewById(R.id.fragment_cartitem_skutv);
                item.itemModel = (TextView) convertView.findViewById(R.id.fragment_cartitem_modeltv);
                item.itemCost = (TextView) convertView.findViewById(R.id.fragment_cartitem_costtv);
                item.itemCostTotal = (TextView) convertView.findViewById(R.id.fragment_cartitem_totalcosttv);
	            item.itemPrice = (TextView) convertView.findViewById(R.id.fragment_cartitem_pricetv);
	            item.itemPriceTotal = (TextView) convertView.findViewById(R.id.fragment_cartitem_totalpricetv);
	            item.itemQuantity = (EditText) convertView.findViewById(R.id.fragment_cartitem_quantity_etv);
	            item.itemDecreaseButton = (ImageButton) convertView.findViewById(R.id.fragment_cartitem_minusbtn);
	            item.itemIncreaseButton = (ImageButton) convertView.findViewById(R.id.fragment_cartitem_plusbtn);
	            item.itemDeleteButton = (ImageButton) convertView.findViewById(R.id.fragment_cartitem_deletebtn);
                item.itemInfoButton = (ImageButton) convertView.findViewById(R.id.fragment_cartitem_infobtn);
                item.itemCostContainer = (LinearLayout) convertView.findViewById(R.id.fragment_cartitem_cost_container);
                item.itemPriceContainer = (LinearLayout) convertView.findViewById(R.id.fragment_cartitem_price_container);
	            convertView.setTag(item);
	        } else {
	            item = (ViewItem) convertView.getTag();
	        }

	        Item curItem = (Item) getItem(position);
	        item.itemName.setText(curItem.getName());
	        if (curItem.getId() != null) {
	            item.itemSku.setText("#" + curItem.getId());
	        }

            if(curItem.getCost() != 0){

            }
            item.itemCost.setText(currencyformatter.format(curItem.getCost()));
	        item.itemPrice.setText(currencyformatter.format(curItem.getPrice()));
	        item.itemDecreaseButton.setTag(curItem);
	        item.itemDecreaseButton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View v) {
	                Item mItem = (Item) v.getTag();
	                if (mItem.getQuantity() > 0) {
	                    mItem.setQuantity(mItem.getQuantity() - 1);
	                    notifyDataSetChanged();
	                }

	            }

	        });

	        item.itemIncreaseButton.setTag(curItem);
	        item.itemIncreaseButton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View v) {
	                Item item = (Item) v.getTag();
	                item.setQuantity(item.getQuantity() + 1);
	                notifyDataSetChanged();
	            }

	        });
	        if (curItem.getQuantity() != 0) {
	            item.itemQuantity.setText(String.valueOf(curItem.getQuantity()));
	        } else {
	            item.itemQuantity.setText("");
	        }
	        item.itemQuantity.setTag(curItem);
	        //item.itemQuantity.setSelectAllOnFocus(true);
	        item.itemQuantity.setOnEditorActionListener(new OnEditorActionListener() {

	            @Override
	            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
	                if (actionId == EditorInfo.IME_ACTION_DONE ||
	                        actionId == EditorInfo.IME_ACTION_NEXT ||
	                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER
	                        ) {

	                    String qty = v.getText().toString().trim();
	                    int quantity = qty.equals("") ? 0 : Integer.valueOf(qty);
	                  EditText qtyView = (EditText) v.findViewById(R.id.fragment_cartitem_quantity_etv);
	                    Item item = (Item) qtyView.getTag();

	                    item.setQuantity(quantity);
	               /*     if (item.getQuantity() != 0) {

	                        qtyView.setText(String.valueOf(item.getQuantity()));
	                    } else {
	                       qtyView.setText("");
	                    }
	                    */
	                    notifyDataSetChanged();


	                    return true;
	                }

	                return false;
	            }

	        });
            item.itemCostTotal.setText(currencyformatter.format(curItem.getTotalCost()));
            item.itemCostTotal.setTag(curItem);

	        item.itemPriceTotal.setText(currencyformatter.format(curItem.getTotal()));
	        item.itemPriceTotal.setTag(curItem);
	        
	        item.itemDeleteButton.setTag(curItem);
	        item.itemDeleteButton.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					deleteItem(position);
					
				}
	        	
	        });

            item.itemInfoButton.setTag(curItem);
            item.itemInfoButton.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View v) {

                }

            });
	        return convertView;
	    }

	    private class ViewItem {
	        TextView itemName;
	        TextView itemSku;
            TextView itemModel;
            EditText itemQuantity;
	        TextView itemCost;
	        TextView itemCostTotal;
	        ImageButton itemIncreaseButton;
            TextView itemPrice;
            TextView itemPriceTotal;
            ImageButton itemDecreaseButton;
	        ImageButton itemDeleteButton;
            ImageButton itemInfoButton;
            LinearLayout itemCostContainer;
            LinearLayout itemPriceContainer;
	    }


	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {  
		if(mDrawerToggle.onOptionsItemSelected(item)){ 
			return true;
		}

        switch (item.getItemId()) {

            case R.id.menu_about:
                AboutDialogFragment aboutfrag = new AboutDialogFragment();
                aboutfrag.show(getSupportFragmentManager(), "");
                return true;
            case R.id.menu_margin_minimum:
                MinMarginDialogFragment minmarginfrag = new MinMarginDialogFragment();
                minmarginfrag.show(getSupportFragmentManager(), "");
                return true;
            case R.id.menu_cement_siding:

            case R.id.menu_chainlink_fence:

            case R.id.menu_composite_fence:

            case R.id.menu_door:

            case R.id.menu_window:

            case R.id.menu_wood_fence:
            case R.id.menu_metal_fence:
            case R.id.menu_vinyl_fence:
            case R.id.menu_vinyl_siding:
            case R.id.menu_gutter:
            case R.id.menu_shingle_roof:
            case R.id.menu_insulation:
            case R.id.menu_metal_roof:
            default:
            return super.onOptionsItemSelected(item);
		}

	}
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}
	
	private class DrawerItemClickListener implements OnItemClickListener{

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int pos,
				long id) {
			
				mCategory = mProjectCategories[pos];
				mDrawerListView.setItemChecked(pos, true);
            switch(pos){
				case 0://door
					Toast.makeText(HomeActivity.this, "Door", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_DOOR);
					setTitle(mProjectCategories[pos]);
					mDrawerLayout.closeDrawer(mDrawerListView);
					
					return;
				case 1://window
					Toast.makeText(HomeActivity.this, "Window", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_WINDOW);
					setTitle(mProjectCategories[pos]);
					mDrawerLayout.closeDrawer(mDrawerListView);
					return;
				case 2://roof
					showRoofCategoryMenu(view);
					return;
				case 3://insulation
					Toast.makeText(HomeActivity.this, "Insulation", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_INSULATION);
					setTitle(mProjectCategories[pos]);
					mDrawerLayout.closeDrawer(mDrawerListView);
					return;
				case 4://fencing
					showFenceCategoryMenu(view);
					return;
				case 5://decking
					Toast.makeText(HomeActivity.this, "Deck", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_DECKING);
					setTitle(mProjectCategories[pos]);
					mDrawerLayout.closeDrawer(mDrawerListView);
					return;
				case 6://siding
					showSidingCategoryMenu(view); 
					return;
				case 7://gutter
					Toast.makeText(HomeActivity.this, "Gutter", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_GUTTER);
					setTitle(mProjectCategories[pos]);
					mDrawerLayout.closeDrawer(mDrawerListView);
					return;
				default:
					return;
				}
			
			
			
		}
		 
	}
	
	void showRoofCategoryMenu(View v){
		PopupMenu popup = new PopupMenu(this, v);
		popup.setOnMenuItemClickListener(new OnMenuItemClickListener(){

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				switch(item.getItemId()){
				
				case R.id.menu_metal_roof:
					Toast.makeText(HomeActivity.this, "Metal Roof", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_METAL_ROOF);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_shingle_roof:
					Toast.makeText(HomeActivity.this, "Shingle Roof", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_SHINGLE_ROOF);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				default:
					return false;
				}
			}
			
		});
		popup.inflate(R.menu.roof_category_list);
		popup.show();	
	}
	void showFenceCategoryMenu(View v){
		PopupMenu popup = new PopupMenu(this, v);
		popup.setOnMenuItemClickListener(new OnMenuItemClickListener(){

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				switch(item.getItemId()){
				
				case R.id.menu_chainlink_fence:
					Toast.makeText(HomeActivity.this, "Chainlink Fence", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_CHAINLINK_FENCE);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_composite_fence:
					Toast.makeText(HomeActivity.this, "Composite Fence", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_COMPOSITE_FENCE);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_vinyl_fence:
					Toast.makeText(HomeActivity.this, "Vinyl Fence", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_VINYL_FENCE);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_metal_fence:
					Toast.makeText(HomeActivity.this, "Metal Fence", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_METAL_FENCE);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_wood_fence:
					Toast.makeText(HomeActivity.this, "Wood Fence", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_WOOD_FENCE);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				default:
					return false;
				}
			}
			
		});
		popup.inflate(R.menu.fence_category_list);
		popup.show();
			
	}
	
	void showSidingCategoryMenu(View v){
		PopupMenu popup = new PopupMenu(this, v);
		popup.inflate(R.menu.siding_category_list);
		popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				switch(item.getItemId()){
				
				case R.id.menu_vinyl_siding:
					Toast.makeText(HomeActivity.this, "Vinyl Siding", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_VINYL_SIDING);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				case R.id.menu_cement_siding:
					Toast.makeText(HomeActivity.this, "Cement Siding", Toast.LENGTH_SHORT).show();
					setCategory(R.string.ARG_CATEGORY_CEMENT_SIDING);
					setTitle(item.getTitle());
					mDrawerLayout.closeDrawer(mDrawerListView);
					return true;
				default:
					return false;
				}
			}
			
		});
		popup.show();		
	}

    void showCartOptionMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.inflate(R.menu.cart_context_menu);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.cart_menu_reset_all:
                        mShoppingCartAdapter.clearQuantities();
                        return true;
                    case R.id.cart_menu_delete_all:
                        mShoppingCartAdapter.deleteAll();
                        return true;
                    default:
                        return false;
                }
            }

        });
        popup.show();
    }
	private class CartView{
		TextView cartSubtotaltv;
		TextView cartTaxtv;
		TextView cartTotaltv;
		TextView cartCounttv;
		ListView cartListView;
		LinearLayout cartHeader;
		CheckBox cartToggledCheckBox;
        ImageButton cartOptionsimgbtn;
	}
	
	public class AssortmentProvider{

    }
	

}
