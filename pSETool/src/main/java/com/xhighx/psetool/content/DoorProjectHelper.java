package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class DoorProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    
	public ItemAssortment PatioDoorAssortment(){
        ItemAssortment patiodoorsgroup = new ItemAssortment();
        ArrayList<Item> patiodoorschildlist = new ArrayList<Item>();
        patiodoorsgroup.setName("Stock - Patio Door");
        patiodoorschildlist.add(new Item("5' Patio Door(LH)", 428, "290229", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Patio Door(LH)", 322, "290225", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Patio Door(RH)", 322, "290224", ItemType.Material));
        patiodoorschildlist.add(new Item("5' French Door(RH) w/ Grid", 324, "328360", ItemType.Material));
        patiodoorschildlist.add(new Item("5' French Door(LH) w/ Grid", 324, "328361", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(LH) w/ Grid", 324, "328356", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Grid", 324, "328354", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(LH) w/ Blinds", 571, "394018", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Blinds", 571, "394021", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Grid + Blinds", 698, "289766", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Fre nnch Door(LH) w/ Grid + Blinds", 698, "289767", ItemType.Material));
        patiodoorschildlist.add(new Item("5' RB Vinyl Sliding Door w/ Grid", 298, "447367", ItemType.Material));
        patiodoorschildlist.add(new Item("6' RB Vinyl Sliding Door w/ Grid", 425, "447366", ItemType.Material));
        patiodoorschildlist.add(new Item("Pella Vinyl Sliding Door(RH) w/ Blinds", 748, "326402", ItemType.Material));
        patiodoorschildlist.add(new Item("Pella Vinyl Sliding Door(LH) w/ Blinds", 748, "326404", ItemType.Material));
        patiodoorschildlist.add(new Item("Custom Item", 1.00, 1, "229019", ItemType.Material));
        patiodoorsgroup.setItems(patiodoorschildlist);
       return patiodoorsgroup;
	}
	
	public ItemAssortment DoorLaborAssortment(){
		
		ItemAssortment DoorLaborAssortment = new ItemAssortment("Labor - Door");
		
			add(DoorLaborAssortment,new Item("Labor-Sgl Prehung Door", 189.00, 157, "229012"));
		    add(DoorLaborAssortment,new Item("Labor-Sgl Slab Door", 199.00, 123, "229013"));
		    add(DoorLaborAssortment,new Item("Labor-Dbl Prehung Door", 349.00, 255, "229014"));
		    add(DoorLaborAssortment,new Item("Labor-Dbl Slab Door", 309.00, 216, "229015"));
		    add(DoorLaborAssortment,new Item("Labor-Sliding Patio Door", 350.00, 248, "229016"));
		    add(DoorLaborAssortment,new Item("Labor-French Patio Door", 399.00, 267, "229017"));
		    add(DoorLaborAssortment,new Item("Labor-Sidelight/Transom", 90.00, 62, "229018"));
		    add(DoorLaborAssortment,new Item("Labor-Mortise Lock", 41.00, 28, "229020"));
		    add(DoorLaborAssortment,new Item("Labor-Storm Door", 97.00, 51, "229024"));
		    add(DoorLaborAssortment,new Item("Labor-Retractable Screen", 135.00, 51, "229027"));
		    add(DoorLaborAssortment,new Item("Labor-Dbl Storm Door", 245.00, 115, "235638"));
		    add(DoorLaborAssortment,new Item("Labor-R/R Storm Door", 97.00, 52, "235639"));
		    add(DoorLaborAssortment,new Item("Labor-Boring Holes", 41.00, 28, "235640"));
		    add(DoorLaborAssortment,new Item("Labor-Security Door", 140.00, 55, "288273"));
		    add(DoorLaborAssortment,new Item("Labor-Dbl Security Door", 291.00, 134, "288281"));
		    add(DoorLaborAssortment,new Item("Labor-Mileage", 2.00, 2, "154641"));
		    add(DoorLaborAssortment,new Item("Labor-Custom Work", 1.00, 1, "229019"));
		
		    return DoorLaborAssortment;
      

	}
	


    
    public ItemAssortment EntryDoorAssortment() {
        ItemAssortment doorsgroup = new ItemAssortment();
        ArrayList<Item> doorchildlist = new ArrayList<Item>();
        doorsgroup.setName("Stock - Entry Door");
        doorchildlist.add(new Item("6-Panel Steel Door", 159.00, "229019", ItemType.Material));
        doorchildlist.add(new Item("9-Lite Steel Door", 184.00, "229019", ItemType.Material));
        doorchildlist.add(new Item("Custom Item", 1.00, 1, "229019", ItemType.Material));
        doorsgroup.setItems(doorchildlist);
        return doorsgroup;
    }
    public ItemAssortment StormDoorAssortment() {
        ItemAssortment sdgroup = new ItemAssortment();
        sdgroup.setName("Stock - Storm Door");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Tradewind Midview", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Midview Beveled Glass", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Fullview", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Fullview Beveled Glass", 297.00, "229024", ItemType.Material));
        sdgroup.setItems(list);
        return sdgroup;
    }


   

    

	

	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PatioDoorAssortment());
		list.add(this.EntryDoorAssortment());
		list.add(this.StormDoorAssortment());
		list.add(this.DoorLaborAssortment());
		list.add(super.WWTrimBoardAssortment());
		list.add(super.PrimedMouldingAssortment());
		list.add(super.FurringStrip());
		list.add(super.ClearPineTrimBoardAssortment());
		list.add(super.PoplarTrimAssortment());
		list.add(super.PVCTrimBoardAssortment());
		list.add(super.CedarTrimBoardAssortment());
		list.add(super.RedOakTrimAssortment());
		list.add(super.SYPTrimBoardAssortment());
		list.add(super.ACQTrimBoardAssortment());
		list.add(super.ArmorWoodAssortment());
		list.add(super.DimensionalPineLumber());
		return list;
	}

}
