package com.xhighx.psetool.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

import com.xhighx.psetool.R;

public class ProjectCategoryFragment extends Fragment implements OnMenuItemClickListener, OnClickListener{
	ImageButton windowbutton;
	ImageButton sidingbutton;
	ImageButton roofbutton;
	ImageButton gutterbutton;
	ImageButton doorbutton;
	ImageButton fencebutton;
	public interface onCategorySelectedListener{
		public void OnSelectSidingProject(int key);
		public void OnSelectWindowProject();
		public void OnSelectRoofProject();
		public void OnSelectFenceProject(int key);
		public void OnSelectGutterProject();
		public void OnSelectDoorProject();
	}
	public void showFenceCategoryPopupMenu(View v){
		PopupMenu popup = new PopupMenu(getActivity(), v);
		MenuInflater inflater = popup.getMenuInflater();
		inflater.inflate(R.menu.fence_category_list, popup.getMenu());
		popup.show();		
	}
	
	public void showSidingCategoryPopupMenu(View v){
		PopupMenu popup = new PopupMenu(getActivity(), v);
		MenuInflater inflater = popup.getMenuInflater();
		inflater.inflate(R.menu.siding_category_list, popup.getMenu());
		popup.show();		
	}
	onCategorySelectedListener mSelectedCategoryListener;
	
	public static ProjectCategoryFragment newInstance(){
		ProjectCategoryFragment fragment = new ProjectCategoryFragment();
		return fragment;  
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tiles_project_category,container,false);
		
		windowbutton = (ImageButton) view.findViewById(R.id.project_category_window_imgbtn);
		windowbutton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		roofbutton = (ImageButton) view.findViewById(R.id.project_category_roof_imgbtn);
		fencebutton = (ImageButton) view.findViewById(R.id.project_category_fencing_imgbtn);
		sidingbutton = (ImageButton) view.findViewById(R.id.project_category_siding_imgbtn);
		doorbutton = (ImageButton) view.findViewById(R.id.project_category_door_imgbtn);
		gutterbutton = (ImageButton) view.findViewById(R.id.project_category_gutter_imgbtn);
		return view;
	}

	 @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		return super.onOptionsItemSelected(item);
	}

	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {
		switch(item.getItemId()){
		
		}
		return false;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.project_category_door_imgbtn:
			mSelectedCategoryListener.OnSelectDoorProject();
			return;
		case R.id.project_category_fencing_imgbtn:
			showFenceCategoryPopupMenu(v);
			return;
		case R.id.project_category_gutter_imgbtn:
			mSelectedCategoryListener.OnSelectGutterProject();
			return;	
		case R.id.project_category_window_imgbtn:
			mSelectedCategoryListener.OnSelectWindowProject();
			return;
		case R.id.project_category_siding_imgbtn:
			showSidingCategoryPopupMenu(v);
			return;
		case R.id.project_category_roof_imgbtn:
			mSelectedCategoryListener.OnSelectRoofProject();
			return;	
		
		
		}
		
	}

}
