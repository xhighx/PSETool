package com.xhighx.psetool.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.xhighx.psetool.model.Item;

public class ProjectItemSpinnerAdapter extends ArrayAdapter<Item> {

	public ProjectItemSpinnerAdapter(Context context, int textViewResourceId,
			ArrayList<Item> objects) {
		super(context, textViewResourceId, objects);
		context = this.context;
		objects = this.objects;

	}

	private Context context;
	private ArrayList<Item> objects;

}
