package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;

public class DeckProjectHelper extends ProjectHelper implements
		ProjectAssortmentProvider {

	public DeckProjectHelper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(super.ACQTrimBoardAssortment());
		list.add(super.DimensionalPineLumber());
		return list;
	}

}
