package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class VinylFenceProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

   
    public ArrayList<ItemAssortment> InstallGroupCategoryContent() {
        ArrayList<ItemAssortment> grouplist = new ArrayList<ItemAssortment>();


        ArrayList<Item> laborchildlist = new ArrayList<Item>();

        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor");
        laborchildlist.add(new Item("Vinyl(Lf)", 8, 5.75, "228157"));
        laborchildlist.add(new Item("Walk Gate(Ea)", 62.25, 49.80, "228174"));
        laborchildlist.add(new Item("Drive Gate(Ea)", 112.5, 90, "228181"));
        laborchildlist.add(new Item("Minimum Labor", 400, 300, "40146"));
        laborchildlist.add(new Item("Removal Existing Fence(Lf)", 3, 2, "73945"));
        laborchildlist.add(new Item("Fence Line Clearing(Lf)", 3, 2, "73706"));
        laborchildlist.add(new Item("Punch Thru Concrete(Ea)", 50, 40, "68221"));
        laborchildlist.add(new Item("Mileage(Ea)", 2, 2, "154376"));
        laborchildlist.add(new Item("Custom Labor", 1, 1, "228185"));
        laborgroup.setItems(laborchildlist);
        grouplist.add(laborgroup);

        ArrayList<Item> generalproductchildlist = new ArrayList<Item>();
        ItemAssortment generalproductgroup = new ItemAssortment();
        generalproductgroup.setName("General Accessories");
        generalproductchildlist.add(new Item("80lb Concrete", 3.48, "10385"));
        generalproductchildlist.add(new Item("Lag Screw", .21, "61966"));
        generalproductchildlist.add(new Item("4x4x8 ACQ", 7.97, "201596"));
        generalproductchildlist.add(new Item("4x4x8 Douglas-Fir", 9.95, "4023"));
        generalproductgroup.setItems(generalproductchildlist);
        grouplist.add(generalproductgroup);


        return grouplist;
    }

   
    public ItemAssortment PseVinylFenceAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Vinyl Fence");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Emblem-Privacy(W)", 30.93));
        list.add(new Item("Emblem-Walk Gate(W)", 327.93));
        list.add(new Item("Emblem-Drive Gate(W)", 671.93));
        list.add(new Item("Emblem-Picket(S))", 26.93));
        list.add(new Item("Emblem-Walk Gate(S)", 327.93));
        list.add(new Item("Emblem-Drive Gate(S)", 353.55));
        list.add(new Item("Arborley-Privacy(W)", 32.93));
        list.add(new Item("Arborley-Walk Gate(W)", 333.93));
        list.add(new Item("Arborley-Drive Gate(W)", 642.93));
        list.add(new Item("Arborley-Privacy(DS)", 26.93));
        list.add(new Item("Arborley-Walk Gate(DS)", 350.93));
        list.add(new Item("Arborley-Drive Gate(DS)", 676.55));
        list.add(new Item("Arborley-Lattice Top(W)", 33.81));
        list.add(new Item("Arborley-3' Picket(W)", 26.81));
        list.add(new Item("Arborley-4' Alternating Picket(W)", 26.81));
        list.add(new Item("All American-Privacy(W)", 32.93));
        list.add(new Item("All American-Privacy(DS)", 39.93));
        list.add(new Item("All American-Walk Gate(W)", 345.93));
        list.add(new Item("All American-Drive Gate(W)", 605.93));
        list.add(new Item("All American-Walk Gate(S)", 350.93));
        list.add(new Item("All American-Drive Gate(S)", 615.93));
        list.add(new Item("All American-Walk Gate(B)", 382.93));
        list.add(new Item("All American-Drive Gate(B)", 678.93));
        list.add(new Item("Princeton-Privacy(W)", 36.93));
        list.add(new Item("Princeton-Privacy(S)", 40.93));
        list.add(new Item("Princeton-Walk Gate(W)", 345.93));
        list.add(new Item("Princeton-Drive Gate(W)", 605.93));
        list.add(new Item("Princeton-Walk Gate(S)", 350.93));
        list.add(new Item("Princeton-Drive Gate(S)", 615.93));
        list.add(new Item("Princeton-Walk Gate(B)", 382.93));
        list.add(new Item("Princeton-Drive Gate(B)", 678.93));
        list.add(new Item("Lattice Top-Privacy(W)", 37.93));
        list.add(new Item("Lattice Top-Privacy(DS)", 43.93));
        list.add(new Item("Lattice Top-Walk Gate(W)", 345.93));
        list.add(new Item("Lattice Top-Drive Gate(W)", 605.93));
        list.add(new Item("Lattice Top-Walk Gate(S)", 350.93));
        list.add(new Item("Lattice Top-Drive Gate(S)", 615.93));
        list.add(new Item("Lattice Top-Walk Gate(B)", 382.93));
        list.add(new Item("Lattice Top-Drive Gate(B)", 678.93));
        list.add(new Item("Classic-3' Gothic(W)", 23.93));
        list.add(new Item("Classic-4' Gothic(W)", 25.93));
        list.add(new Item("Classic-3.5' Scallop(W)", 23.93));
        list.add(new Item("Classic-Walk Gate(W)", 323.93));
        list.add(new Item("Classic-Drive Gate(W)", 622.93));
        list.add(new Item("Classic-Walk Gate(S)", 286.93));
        list.add(new Item("Classic-Drive Gate(S)", 549.93));
        list.add(new Item("Post & 2 Rail(W)", 15.25));
        list.add(new Item("Post & 3 Rail(W)", 17.25));
        list.add(new Item("2 Rail-Walk Gate(W)", 237.25));
        list.add(new Item("3 Rail-Walk Gate(W)", 251.25));
        list.add(new Item("Labor-Removal Existing Fence", 3, 2, "73945"));
        list.add(new Item("Labor-Fence Line Clearing", 3, 2, "73706"));
        list.add(new Item("Labor-Punch Thru Concrete", 50, 40, "68221"));
        list.add(new Item("Labor-Mileage", 2, 2, "154376"));
        list.add(new Item("Labor-Custom Work", 1, 1, "228185"));
        Group.setItems(list);
        return Group;
    }

 


	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseVinylFenceAssortment());
	
		return list;
	}

}
