package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class WindowProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    
   


	

    
    public ItemAssortment WindowLaborAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("Labor - Window");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Labor-Basic Window", 99, 70, "59841"));
        list.add(new Item("Labor-Oversized Window", 145, 105, "60177"));
        list.add(new Item("Labor-Garden Window", 321, 268, "61878"));
        list.add(new Item("Labor-Bow/Bay Window", 490, 321, "60301"));
        list.add(new Item("Labor-Full Frame Removal", 30, 20, "325941"));
        list.add(new Item("Labor-Exterior Trim/Brickmould", 40, 28, "67810"));
        list.add(new Item("Labor-Sill Replacement", 30, 21, "125472"));
        list.add(new Item("Labor-2nd Story Upcharge", 30, 21, "125472"));
        list.add(new Item("Labor-Disposal", 10, 7, "235636"));
        list.add(new Item("Labor-Mileage", 2, 2, "154660"));
        list.add(new Item("Labor-French Patio Door", 399, 267, "229017"));
        list.add(new Item("Labor-Sliding Patio Door", 350, 248, "229016"));
        list.add(new Item("Labor-EPA Lead Safe Practices", 46, 46, "242908"));
        list.add(new Item("Labor-EPA Lead Test", 16, 16, "242761"));
        list.add(new Item("Labor-Custom Work", 1, 1, "105451"));
        Group.setItems(list);
        return Group;
    }


	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(WindowLaborAssortment());
		list.add(super.PrimedMouldingAssortment());
		list.add(super.ClearPineTrimBoardAssortment());
		list.add(super.WWTrimBoardAssortment());
		list.add(super.CedarTrimBoardAssortment());
		list.add(super.ACQTrimBoardAssortment());
		list.add(super.ArmorWoodAssortment());
		list.add(super.PVCTrimBoardAssortment());
		list.add(super.PoplarTrimAssortment());
		list.add(super.RedOakTrimAssortment());
		list.add(super.SYPTrimBoardAssortment());
		list.add(super.DimensionalPineLumber());
		list.add(super.FurringStrip());
		list.add(super.Plywood());
		list.add(super.DimensionalPineLumber());
		return list;
	}

   


}
