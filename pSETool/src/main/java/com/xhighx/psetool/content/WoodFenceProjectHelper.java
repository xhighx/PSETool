package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class WoodFenceProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    public WoodFenceProjectHelper() {
        // TODO Auto-generated constructor stub
    }

    
public ItemAssortment CedarFenceAssortment(){
	
        ArrayList<Item> cedarfencechildlist = new ArrayList<Item>();
        ItemAssortment cedarfencegroup = new ItemAssortment();
        cedarfencegroup.setName("Product - Cedar");
        cedarfencechildlist.add(new Item("5/8\"x6\"x6' DE Picket", 2.38, "5447", ItemType.Material));
        cedarfencechildlist.add(new Item("5/8\"x6\"x8' DE Picket(Bundle 416)", 3.25, 2.45, "111484", ItemType.Material));
        cedarfencechildlist.add(new Item("2x4x8 Cedar S4S", 7.98, "58755", ItemType.Material));
        cedarfencechildlist.add(new Item("2x4x12 Cedar S4S", 14.28, "111484", ItemType.Material));
        cedarfencechildlist.add(new Item("4x4x8 Rough Cedar", 15.28, "4247", ItemType.Material));
        cedarfencegroup.setItems(cedarfencechildlist);
        return cedarfencegroup;
}
public ItemAssortment ACQFenceAssortment(){

        ArrayList<Item> acqfencechildlist = new ArrayList<Item>();
        ItemAssortment acqfencegroup = new ItemAssortment();
        acqfencegroup.setName("Product - ACQ");
        acqfencechildlist.add(new Item("6\"x6' ACQ DE Picket", 1.44, "202922", ItemType.Material));
        acqfencechildlist.add(new Item("2x4x8 ACQ", 4.27, "46905", ItemType.Material));
        acqfencechildlist.add(new Item("4x4x8 ACQ", 7.97, "201596", ItemType.Material));

        acqfencegroup.setItems(acqfencechildlist);
       return acqfencegroup;
}
public ItemAssortment WWFenceAssortment(){

        ArrayList<Item> wwproductchildlist = new ArrayList<Item>();
        ItemAssortment wwproductgroup = new ItemAssortment();
        wwproductgroup.setName("Product - Whitewood");
        wwproductchildlist.add(new Item("4\"x6' WW Gothic Picket", 1.29, "98036", ItemType.Material));
        wwproductchildlist.add(new Item("4\"x6' WW DE Picket", 1.29, "98037", ItemType.Material));
        wwproductchildlist.add(new Item("2x4x8 WW Stud", 2.99, "6005", ItemType.Material));
        wwproductchildlist.add(new Item("4x4x8 Douglas-Fir", 9.95, "4023", ItemType.Material));
        wwproductgroup.setItems(wwproductchildlist);
        return wwproductgroup;
}
public ItemAssortment FenceAccessoriesAssortment(){
	
    ArrayList<Item> cedarfencechildlist = new ArrayList<Item>();
    ItemAssortment cedarfencegroup = new ItemAssortment();
    cedarfencegroup.setName("Product - Accessories");
    cedarfencechildlist.add(new Item("80lb Concrete", 3.68, "10385", ItemType.Material));
    cedarfencechildlist.add(new Item("Gate Latch", 14.97, "272000", ItemType.Material));
    cedarfencechildlist.add(new Item("8\" Gate Latch(Pair)", 13.97, "77958", ItemType.Material));
    cedarfencechildlist.add(new Item("2 3/8\" Post Tie", 3.96, "63488", ItemType.Material));
    cedarfencechildlist.add(new Item("Drop Pin", 12.94, "75967", ItemType.Material));
    cedarfencechildlist.add(new Item("2 3/8\" Corner Tie", 7.96, "402040", ItemType.Material));
    cedarfencechildlist.add(new Item("2 3/8\" x 8' Steel Post", 12.94, "75967", ItemType.Material));
    cedarfencechildlist.add(new Item("2 3/8\" Post Cap", 1.88, "92186", ItemType.Material));
    cedarfencechildlist.add(new Item("Drop Pin", 12.94, "75967", ItemType.Material));
    cedarfencechildlist.add(new Item("Lag Screw", .21, "61966", ItemType.Material));
    cedarfencegroup.setItems(cedarfencechildlist);
    return cedarfencegroup;
}
      public ItemAssortment WoodFenceLaborAssortment(){
        	ArrayList<Item> laborfencechildlist = new ArrayList<Item>();
        ItemAssortment laborfencegroup = new ItemAssortment();
        laborfencegroup.setName("Labor - Wood Fence");
        laborfencechildlist.add(new Item("Labor-Privacy/Spaced 72\"(Lf)", 8, 6, "325935"));
        laborfencechildlist.add(new Item("Labor-Privacy/Spaced +72\"(Lf)", 11, 8, "325938"));
        laborfencechildlist.add(new Item("Labor-Board on Board 72\"(Lf)", 9, 7, "325936"));
        laborfencechildlist.add(new Item("Labor-Board on Board +72\"(Lf)", 12, 9, "325939"));
        laborfencechildlist.add(new Item("Labor-Shadowbox 72\"(Lf)", 9, 7, "325937"));
        laborfencechildlist.add(new Item("Labor-Shadowbox +72\"(Lf)", 12, 9, "325940"));
        laborfencechildlist.add(new Item("Labor-Split Rail(Lf)", 12, 4.60, "67795"));
        laborfencechildlist.add(new Item("Labor-Post & Rail(Lf)", 12, 4.6, "69774"));
        laborfencechildlist.add(new Item("Labor-Walk Gate(Ea)", 62.25, 49.8, "228175"));
        laborfencechildlist.add(new Item("Labor-Drive Gate(Ea)", 89, 60, "228182"));
        laborfencechildlist.add(new Item("Labor-Minimum Labor", 400, 300, "40297"));
        laborfencechildlist.add(new Item("Labor-Removal Existing Fence(Lf)", 3, 2, "73945"));
        laborfencechildlist.add(new Item("Labor-Fence Line Clearing(Lf)", 3, 2, "73706"));
        laborfencechildlist.add(new Item("Labor-Punch Thru Concrete(Ea)", 50, 40, "68221"));
        laborfencechildlist.add(new Item("Labor-Scallop/Concave Top(Lf)", 50, 2, "325934"));
        laborfencechildlist.add(new Item("Labor-Mileage(Ea)", 2, 2, "154376"));
        laborfencegroup.setItems(laborfencechildlist);
        return laborfencegroup;
    }
        
    

    
    public ItemAssortment PseWoodFenceAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Wood Fence");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("ACQ-Spaced", 14.31));
        list.add(new Item("ACQ-Privacy", 15.38));
        list.add(new Item("ACQ-Board on Board", 17.57));
        list.add(new Item("ACQ-Shadowbox", 17.57));
        list.add(new Item("ACQ-Walk Gate", 145.66));
        list.add(new Item("ACQ-8' Drive Gate", 249.31));
        list.add(new Item("ACQ-10' Drive Gate", 256.31));
        list.add(new Item("ACQ-12' Drive Gate", 263.31));
        list.add(new Item("Cedar-Spaced", 19.31));
        list.add(new Item("Cedar-Privacy", 21.75));
        list.add(new Item("Cedar-Board on Board", 23.57));
        list.add(new Item("Cedar-Shadowbox", 23.57));
        list.add(new Item("Cedar-Walk Gate", 248.66));
        list.add(new Item("Cedar-8' Drive Gate", 528.31));
        list.add(new Item("Cedar-10' Drive Gate", 535.31));
        list.add(new Item("Cedar-12' Drive Gate", 555.31));
        list.add(new Item("Labor-Removal Existing Fence", 3));
        list.add(new Item("Labor-Fence Line Clearing", 3));
        list.add(new Item("Labor-Punch Thru Concrete", 50));
        list.add(new Item("Labor-Scallop/Concave Top", 3));
        list.add(new Item("Labor-Mileage", 2));
        list.add(new Item("Labor-Custom Work", 1));
        Group.setItems(list);
        return Group;
    }

   

    
    





	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseWoodFenceAssortment());
		list.add(this.CedarFenceAssortment());
		list.add(this.ACQFenceAssortment());
		list.add(this.WWFenceAssortment());
		list.add(this.FenceAccessoriesAssortment());
		list.add(this.WoodFenceLaborAssortment());
		return list;
	}

}
