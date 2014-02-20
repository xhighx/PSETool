package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ProjectAssortmentProvider;

public abstract class ProjectHelper implements ProjectAssortmentProvider{
	
	
	public interface CategoryInformation{
		//public List
	}
	
	
	
	public ItemAssortment RedOakTrimAssortment(){
		ItemAssortment RedOakTrimAssortment = new ItemAssortment("Trim-Red Oak");
		add(RedOakTrimAssortment,new Item("Red Oak 1x4x6", 12.38, "1048", ItemType.Material));
        add(RedOakTrimAssortment,new Item("Red Oak 1x4x8", 14.88, "1049", ItemType.Material));
        add(RedOakTrimAssortment,new Item("Red Oak 1x4x10", 18.88, "28334", ItemType.Material));
        add(RedOakTrimAssortment,new Item("Red Oak 1x6x6", 18.57, "1053", ItemType.Material));
        add(RedOakTrimAssortment,new Item("Red Oak 1x6x8", 21.57, "1054", ItemType.Material));
        add(RedOakTrimAssortment,new Item("Red Oak 1x6x10", 32.97, "28341", ItemType.Material));
        return RedOakTrimAssortment;
	}
	public ItemAssortment PoplarTrimAssortment(){
		ItemAssortment PoplarTrimAssortment = new ItemAssortment("Trim-Poplar");
		add(PoplarTrimAssortment,new Item("Poplar 1x4x6", 9.43, "1088", ItemType.Material));
        add(PoplarTrimAssortment,new Item("Poplar 1x4x8", 11.88, "1088", ItemType.Material));
        add(PoplarTrimAssortment,new Item("Poplar 1x4x10", 12.88, "28376", ItemType.Material));
        add(PoplarTrimAssortment,new Item("Poplar 1x6x6", 12.43, "1092", ItemType.Material));
        add(PoplarTrimAssortment,new Item("Poplar 1x6x8", 17.88, "1093", ItemType.Material));
        add(PoplarTrimAssortment,new Item("Poplar 1x6x10", 19.88, "28391", ItemType.Material));
        return PoplarTrimAssortment;
	}
	public ItemAssortment ACQTrimBoardAssortment(){
		ItemAssortment ACQTrimAssortment = new ItemAssortment("Trim-ACQ");
		add(ACQTrimAssortment,new Item("ACQ 1x4x6", 3.57, "201710", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x4x8", 3.77, "201711", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x4x10", 3.97, "201714", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x4x12", 5.37, "201715", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x6x6", 4.57, "201719", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x6x8", 5.68, "201722", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x6x10", 5.98, "201723", ItemType.Material));
        add(ACQTrimAssortment,new Item("ACQ 1x6x12", 8.58, "201725", ItemType.Material));
        return ACQTrimAssortment;
	}
	
	public ItemAssortment ClearPineTrimBoardAssortment(){
		ItemAssortment ClearPineTrimAssortment = new ItemAssortment("Trim-Ponderosa Pine");
		add(ClearPineTrimAssortment,new Item("Clear Pine 1x4x6", 6.58, "1154", ItemType.Material));
	     add(ClearPineTrimAssortment,new Item("Clear Pine 1x4x8", 8.58, "1155", ItemType.Material));
	     add(ClearPineTrimAssortment,new Item("Clear Pine 1x4x10", 10.72, "20447", ItemType.Material));
	     add(ClearPineTrimAssortment,new Item("Clear Pine 1x6x6", 12.58, "1157", ItemType.Material));
	     add(ClearPineTrimAssortment,new Item("Clear Pine 1x6x8", 16.31, "1158", ItemType.Material));
	     add(ClearPineTrimAssortment,new Item("Clear Pine 1x6x10", 20.98, "25745", ItemType.Material));
	     return ClearPineTrimAssortment;
	}
	
	public ItemAssortment SYPTrimBoardAssortment(){
		ItemAssortment SYPTrimAssortment = new ItemAssortment("Trim-Yellow Pine");
		add(SYPTrimAssortment,new Item("SYP 1x4x8", 5.97, "1549", ItemType.Material));
        add(SYPTrimAssortment,new Item("SYP 1x4x10", 7.47, "1567", ItemType.Material));
        add(SYPTrimAssortment,new Item("SYP 1x4x12", 8.97, "1568", ItemType.Material));
        add(SYPTrimAssortment,new Item("SYP 1x6x8", 9.97, "1588", ItemType.Material));
        add(SYPTrimAssortment,new Item("SYP 1x6x10", 11.57, "1589", ItemType.Material));
        add(SYPTrimAssortment,new Item("SYP 1x6x12", 13.97, "1611", ItemType.Material));
        return SYPTrimAssortment;
	}
	public ItemAssortment PVCTrimBoardAssortment(){
		ItemAssortment PVCTrimAssortment = new ItemAssortment("Trim-PVC");
		add(PVCTrimAssortment,new Item("PVC 1x2x12", 10.18, "113010"));
        add(PVCTrimAssortment,new Item("PVC 1x4x8", 13.04, "209620"));
        add(PVCTrimAssortment,new Item("PVC 1x6x8", 20.56, "209621"));
        add(PVCTrimAssortment,new Item("PVC 1/4\"x6x8", 17.28, "310630"));
        add(PVCTrimAssortment,new Item("PVC Lattice-2\"x8", 5.12, "209626"));
        add(PVCTrimAssortment,new Item("PVC BKMD-S-8", 11.18, "98458"));
        return PVCTrimAssortment;
	}
	public ItemAssortment CedarTrimBoardAssortment(){
		ItemAssortment CedarTrimAssortment = new ItemAssortment("Trim-Cedar");
		add(CedarTrimAssortment,new Item("Cedar 1x2x8", 2.26, "7592", ItemType.Material));
        add(CedarTrimAssortment,new Item("Cedar 1x4x8", 4.88, "7499", ItemType.Material));
        add(CedarTrimAssortment,new Item("Cedar 1x4x10", 6.78, "7581", ItemType.Material));
        add(CedarTrimAssortment,new Item("Cedar 1x4x12", 7.99, "7500", ItemType.Material));
        add(CedarTrimAssortment,new Item("Cedar 1x6x8", 10.57, "7502", ItemType.Material));
        add(CedarTrimAssortment,new Item("Cedar 1x6x12", 15.57, "7503", ItemType.Material));
        return CedarTrimAssortment;
	}
	public ItemAssortment PrimedMouldingAssortment(){
		ItemAssortment PFJMouldTrimAssortment = new ItemAssortment("Trim-PFJ Mould");
		 add(PFJMouldTrimAssortment,new Item("PNE SCRN-8", 3.12, "3542", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PNE S4S-8", 4.72, "3487", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PNE Mullion-8", 7.84, "3077", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ CASE-7", 4.62, "110515", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ STOP-7", 3.50, "110103", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ BKMD-S-7", 11.13, "31140", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ BKMD-S-10", 15.90, "31143", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ BKMD-R-7", 11.13, "110458", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ BKMD-R-14", 22.26, "110466", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ H-Mould-7", 4.62, "110515", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ QTRD-8", 5.52, "112462", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ SHOE-8", 4.08, "112484", ItemType.Material));
	     add(PFJMouldTrimAssortment,new Item("PFJ STOCK-8", 5.92, "110451", ItemType.Material));
	     return PFJMouldTrimAssortment;
	}
	public ItemAssortment ArmorWoodAssortment(){
		ItemAssortment ArmorWoodTrimAssortment = new ItemAssortment("Trim-Armorwood");
		add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x4x10", 12.57, "217737"));
        add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x4x16", 18.22, "217630"));
        add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x6x10", 16.98, "217374"));
        add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x6x16", 28.11, "217506"));
        add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x8x10", 27.98, "217503"));
        add(ArmorWoodTrimAssortment,new Item("ArmourWood 1x8x16", 40.97, "217496"));
        return ArmorWoodTrimAssortment;
	}
	
	public ItemAssortment WWTrimBoardAssortment(){
		ItemAssortment WhitePineTrimAssortment = new ItemAssortment("Trim-#2 Pine");
		add(WhitePineTrimAssortment,new Item("WW 1x2x8", 2.98, "1408", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x4x8", 4.73, "940", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x4x10", 6.73, "941", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x4x12", 8.22, "942", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x6x8", 6.98, "951", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x6x10", 11.28, "952", ItemType.Material));
        add(WhitePineTrimAssortment,new Item("WW 1x6x12", 13.98, "953", ItemType.Material));
        return WhitePineTrimAssortment;
	}
	
	
	
	
	
	
	
	
	
	public ItemAssortment getNewAssortmentGroup() {
		ItemAssortment cart = new ItemAssortment();
		ArrayList<Item> cartlist = new ArrayList<Item>();
		cart.setItems(cartlist);
		return cart;
	}

	public ProjectHelper() {
	}


	public static List<Item> ITEMS = new ArrayList<Item>();


	public static Map<ItemAssortment, Item> ITEM_MAP = new HashMap<ItemAssortment, Item>();



	protected static void add(ItemAssortment assortment, Item item) {
		assortment.getItems().add(item);
		ITEM_MAP.put(assortment, item);
	}

	public  ItemAssortment DimensionalPineLumber() {
	    ArrayList<Item> list = new ArrayList<Item>();
	    ItemAssortment group = new ItemAssortment();        
	    group.setName("Dimensional Lumber"); 
	    list.add(new Item("2x4x8 WW", 2.99, "6005", ItemType.Material));
	    list.add(new Item("2x4x10 WW", 4.27, "27172", ItemType.Material));
	    list.add(new Item("2x4x12 WW", 5.35, "28349", ItemType.Material));
	    list.add(new Item("2x4x14 WW", 5.95, "28512", ItemType.Material));
	    list.add(new Item("2x4x16 WW", 6.98, "29003", ItemType.Material));
	    list.add(new Item("2x6x8 WW", 5.33, "30820", ItemType.Material));
	    list.add(new Item("2x6x10 WW", 6.77, "31100", ItemType.Material));
	    list.add(new Item("2x6x12 WW", 7.68, "31878", ItemType.Material));
	    list.add(new Item("2x6x14 WW", 9.21, "33462", ItemType.Material));
	    list.add(new Item("2x6x16 WW", 10.48, "33789", ItemType.Material));
	    
	    group.setItems(list);
		return group;
	}
	public static ItemAssortment FurringStrip() {
	    ArrayList<Item> list = new ArrayList<Item>();
	    ItemAssortment group = new ItemAssortment();        
	    group.setName("Furring Strip"); 
		list.add(new Item("1x2x8 Fur Strip", 1.04, "4511", ItemType.Material));
	    list.add(new Item("1x3x8 Fur Strip", 1.58, "4512", ItemType.Material));
	    list.add(new Item("1x4x8 Fur Strip", 2.07, "4510", ItemType.Material));
	    list.add(new Item("2x2x8 Fur Strip", 1.92, "4513", ItemType.Material));
	    group.setItems(list);
	    return group;
	}
	public static ItemAssortment Plywood() {
		ItemAssortment group = new ItemAssortment();        
	    group.setName("Plywood"); 
	    ArrayList<Item> list = new ArrayList<Item>();
	    list.add(new Item("7/16\" OSB", 11.99, "12212", ItemType.Material));
	    list.add(new Item("1/2\" CD Ply", 21.99, "12192", ItemType.Material));
	    list.add(new Item("5/8\" CD Ply", 24.99, "12242", ItemType.Material));
	    list.add(new Item("3/4\" CD Ply", 29.99, "12244", ItemType.Material));
		group.setItems(list);
	    return group;
	}

	public ItemAssortment SidingAccessories() {
		ItemAssortment group = new ItemAssortment();        
		ArrayList<Item> glist = new ArrayList<Item>();
	    group.setName("Siding Accessories"); 
	    glist.add(new Item("Lowe's House Wrap", 107, "168290", ItemType.Material));
	    group.setItems(glist);
	    return group;
	}



}
