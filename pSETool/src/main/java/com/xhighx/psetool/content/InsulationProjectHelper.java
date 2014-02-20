package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class InsulationProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    public InsulationProjectHelper() {

    }

    

    
    public ItemAssortment PseCategoryContent() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Insulation");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Mileage", 2, 2, "331488"));
        Group.setItems(list);
        return Group;
    }

   
	








	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(PseCategoryContent());
		
		return list;
	}

}
