package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class GutterProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    public GutterProjectHelper() {

    }

    

    
    public ItemAssortment PseCategoryContent() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Gutter");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("5\" Seamless Gutter", 6.00, 4.5, "318476"));
        list.add(new Item("6\" Seamless Gutter", 7.25, 6, "318552"));
        list.add(new Item("5\" Seamless Gutter w/ Full Screen", 12, 9, "318546"));
        list.add(new Item("6\" Seamless Gutter w/ Full Screen", 14.50, 12, "318554"));
        list.add(new Item("Second Story Upcharge", 1.5, 1, "362217"));
        list.add(new Item("One Story Downspout", 65, 50, "362217"));
        list.add(new Item("Two Story Downspout", 120, 90, "362218"));
        list.add(new Item("Three Story Downspout", 180, 135, "362220"));
        list.add(new Item("Splash Block", 9, 6, "318566"));
        list.add(new Item("Field Cut Miter", 12.5, 8.5, "154176"));
        list.add(new Item("Fascia Replacement", 11.5, 8, "318575"));
        list.add(new Item("Cap Fascia", 7.65, 6.5, "318578"));
        list.add(new Item("Angled Fascia", 1.25, 1, "318578"));
        list.add(new Item("Cut Back Roof", 1.25, 1, "318578"));
        list.add(new Item("Mileage", 2, 2, "331488"));
        Group.setItems(list);
        return Group;
    }

   
	








	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseCategoryContent());
		return list;
	}

}
