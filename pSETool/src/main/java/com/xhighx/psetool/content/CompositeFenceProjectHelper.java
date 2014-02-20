package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class CompositeFenceProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

  

	public ItemAssortment GeneralFenceAccessoriesAssortment(){
        ArrayList<Item> generalproductchildlist = new ArrayList<Item>();
        ItemAssortment generalproductgroup = new ItemAssortment();
        generalproductgroup.setName("Product - General Fence Accessories");
        generalproductchildlist.add(new Item("80lb Concrete", 3.48, "10385"));
        generalproductchildlist.add(new Item("2x4x12 Cedar", 14.00, "210"));
        generalproductchildlist.add(new Item("Gate Latch(PM)", 14.97, "272000"));
        generalproductchildlist.add(new Item("8\" Gate Latch(2)", 13.97, "77958"));
        generalproductchildlist.add(new Item("2 3/8\" Post Tie", 1.96, "63488"));
        generalproductchildlist.add(new Item("2 3/8\" Corner Tie", 3.96, "402040"));
        generalproductchildlist.add(new Item("8' Steel Post", 13.94, "92177"));
        generalproductchildlist.add(new Item("Post Cap", 1.88, "92186"));
        generalproductchildlist.add(new Item("Lag Screw", .21, "61966"));
        generalproductgroup.setItems(generalproductchildlist);
        return generalproductgroup;
	}
	
	public ItemAssortment CompositeFencePicketAssortment(){
        ArrayList<Item> compositeproductchildlist = new ArrayList<Item>();
        ItemAssortment compositeproductgroup = new ItemAssortment();
        compositeproductgroup.setName("Product - Woodshades Picket");
        compositeproductchildlist.add(new Item("6\"x6' DE Cedar", 4.97, "290932"));
        compositeproductchildlist.add(new Item("6\"x6' DE Barnwood", 4.97, "290931"));
        compositeproductchildlist.add(new Item("6\"x6' DE Redwood", 4.97, "290930"));
        compositeproductchildlist.add(new Item("4\"x39\" Gothic Cedar", 2.29, "142336"));
        compositeproductchildlist.add(new Item("4\"x39\" Gothic Barnwood", 2.29, "142346"));
        compositeproductchildlist.add(new Item("4\"x39\" Gothic Redwood", 2.29, "142338"));
        compositeproductgroup.setItems(compositeproductchildlist);
        return compositeproductgroup;
	}
	
	public ItemAssortment CompositeFenceLaborAssortment(){
		
        ItemAssortment laborgroup = new ItemAssortment();
        ArrayList<Item> laborchildlist = new ArrayList<Item>();
        laborgroup.setName("Labor - Composite Fence");
        laborchildlist.add(new Item("Composite 72\"(Lf)", 9, 6.85, "228161"));
        laborchildlist.add(new Item("Composite +72\"(Lf)", 12, 8.65, "228162"));
        laborchildlist.add(new Item("Walk Gate(Ea)", 81, 64.80, "228176"));
        laborchildlist.add(new Item("Drive Gate(Ea)", 150, 45, "228184"));
        laborchildlist.add(new Item("Minimum Labor", 400, 300, "40325"));
        laborchildlist.add(new Item("Removal Existing Fence(Lf)", 3, 2, "73945"));
        laborchildlist.add(new Item("Fence Line Clearing(Lf)", 3, 2, "73706"));
        laborchildlist.add(new Item("Punch Thru Concrete(Ea)", 50, 40, "68221"));
        laborchildlist.add(new Item("Tension Wire(Lf)", .60, .45, "228191"));
        laborchildlist.add(new Item("Mileage(Ea)", 2, 2, "154376"));
        laborchildlist.add(new Item("Custom Labor", 1, 1, "228185"));
        laborgroup.setItems(laborchildlist);
        return laborgroup;
    }

    public ItemAssortment PseCompositeFenceAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Composite Fence");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Dogear-Privacy", 40.48));
        list.add(new Item("Dogear-Shadow Box", 43.17));
        list.add(new Item("Dogear-Board on Board", 43.17));
        list.add(new Item("Dogear-Walk Gate", 597.66));
        list.add(new Item("Dogear-Drive Gate", 1183.31));
        list.add(new Item("Post and Rail", 18.30));
        list.add(new Item("Gothic-Spaced Picket", 24.49));
        list.add(new Item("Labor-Removal Existing Fence", 3));
        list.add(new Item("Labor-Fence Line Clearing", 3));
        list.add(new Item("Labor-Punch Thru Concrete", 50));
        list.add(new Item("Labor-Mileage", 2));
        list.add(new Item("Labor-Custom Work", 1));
        Group.setItems(list);
        return Group;
    }

  

    
	
	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseCompositeFenceAssortment());
		list.add(this.CompositeFencePicketAssortment());
		list.add(this.CompositeFenceLaborAssortment());
		list.add(this.GeneralFenceAccessoriesAssortment());
		return list;
	}

}
