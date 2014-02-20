package com.xhighx.psetool.content;

import java.util.ArrayList;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.Item.ItemType;

public class PseProjectHelper {
	public String mProjectCategory;
	public ArrayList<ItemAssortment> mProjectAssortment;
	
	
	
	public PseProjectHelper(String mProjectCategory) {
		
	}


	
	
	
	public static ItemAssortment getRoofLaborAssortment(){
		ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor-Roof");
        list.add(new Item("Labor-Shingle Roof(Sq)", 95.00, 75.00, "322256"));
        list.add(new Item("Labor-Layer Removal(Sq)", 15.00, 10.00, "228230"));
        list.add(new Item("Labor-Higher Pitch(Sq)", 24.00, 18.00, "228231"));
        list.add(new Item("Labor-Multiple Story(Sq)", 24.00, 18.00, "228232"));
        list.add(new Item("Labor-OSB/Plywood(Sheet)", 81.00, 50.00, "228239"));
        list.add(new Item("Labor-Stnd Fascia(Lf)", 3.00, 2.00, "228240"));
        list.add(new Item("Labor-Skylight Replacement(Ea)", 150.00, 100.00, "228244"));
        list.add(new Item("Labor-Rmv/Replace Satellite(Ea)", 39.00, 25.00, "228245"));
        list.add(new Item("Labor-Skylight Flash(Ea)", 110.00, 75.00, "228247"));
        list.add(new Item("Labor-Soffit Vent(Ea)", 15.00, 10.00, "235811"));
        list.add(new Item("Labor-1x Deck(Lf)", 3.00, 2.25, "295608"));
        list.add(new Item("Labor-Rmv Metal/Tile/Wd Roof(Sq)", 25.00, 15.00, "322732"));
        list.add(new Item("Labor-New Rafter Tail(Ea)", 73.00, 55.00, "322734"));
        list.add(new Item("Labor-Chimney Cricket(Ea)", 130.00, 90.00, "322735"));
        list.add(new Item("Labor-Custom Fascia(Lf)", 6.00, 4.00, "322738"));
        list.add(new Item("Labor-Ice/Water Barrier(Sq)", 15.00, 10.00, "323870"));
        list.add(new Item("Labor-Gutter Removal(Lf)", 1.05, .75, "228740"));
        list.add(new Item("Labor-Custom Sidewall Flash(Ea)", 187.50, 125.00, "322740"));
        list.add(new Item("Labor-Cover Over Vent(Ea)", 11.50, 10.00, "401945"));
        list.add(new Item("Labor-Tarping Service(Ea)", 1, 1, "367623"));
        list.add(new Item("Labor-Minimum Labor(Ea)", 610.00, 380.00, "236751"));
        list.add(new Item("Labor-Mileage", 2, 2, "154378"));
        laborgroup.setItems(list);
        return laborgroup;
	}
	public static ItemAssortment getWindowLaborAssortment(){
		ArrayList<Item> laborchildlist = new ArrayList<Item>();
        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor-Window");
        laborchildlist.add(new Item("Labor-Basic Window", 99, 70, "59841"));
        laborchildlist.add(new Item("Labor-Oversized Window", 145, 105, "60177"));
        laborchildlist.add(new Item("Labor-Garden Window", 321, 268, "61878"));
        laborchildlist.add(new Item("Labor-Bow/Bay Window", 490, 321, "60301"));
        laborchildlist.add(new Item("Labor-Full Frame Removal", 30, 20, "325941"));
        laborchildlist.add(new Item("Labor-Exterior Trim/Brickmould", 40, 28, "67810"));
        laborchildlist.add(new Item("Labor-Sill Replacement", 30, 21, "125472"));
        laborchildlist.add(new Item("Labor-2nd Story Upcharge", 30, 21, "125472"));
        laborchildlist.add(new Item("Labor-Disposal", 10, 7, "235636"));
        laborchildlist.add(new Item("Labor-Mileage", 2, 2, "154660"));
        laborchildlist.add(new Item("Labor-Remove A/C", 30, 20, "105451"));
        laborchildlist.add(new Item("Labor-EPA Lead Safe Practices", 46, 46, "242908"));
        laborchildlist.add(new Item("Labor-EPA Lead Test", 16, 16, "242761"));
        laborchildlist.add(new Item("Labor-Custom Work", 1, 1, "105451"));
        laborgroup.setItems(laborchildlist);
        return laborgroup;
	}
	public static ItemAssortment getDoorLaborAssortment() {
		ItemAssortment laborgroup = new ItemAssortment();
	    ArrayList<Item> laborchildlist = new ArrayList<Item>();
	    laborgroup.setName("Labor-Door");
	    laborchildlist.add(new Item("Labor-Sgl Prehung Door", 189.00, 157, "229012"));
	    laborchildlist.add(new Item("Labor-Sgl Slab Door", 199.00, 123, "229013"));
	    laborchildlist.add(new Item("Labor-Dbl Prehung Door", 349.00, 255, "229014"));
	    laborchildlist.add(new Item("Labor-Dbl Slab Door", 309.00, 216, "229015"));
	    laborchildlist.add(new Item("Labor-Sliding Patio Door", 350.00, 248, "229016"));
	    laborchildlist.add(new Item("Labor-French Patio Door", 399.00, 267, "229017"));
	    laborchildlist.add(new Item("Labor-Sidelight/Transom", 90.00, 62, "229018"));
	    laborchildlist.add(new Item("Labor-Mortise Lock", 41.00, 28, "229020"));
	    laborchildlist.add(new Item("Labor-Storm Door", 97.00, 51, "229024"));
	    laborchildlist.add(new Item("Labor-Retractable Screen", 135.00, 51, "229027"));
	    laborchildlist.add(new Item("Labor-Dbl Storm Door", 245.00, 115, "235638"));
	    laborchildlist.add(new Item("Labor-R/R Storm Door", 97.00, 52, "235639"));
	    laborchildlist.add(new Item("Labor-Boring Holes", 41.00, 28, "235640"));
	    laborchildlist.add(new Item("Labor-Security Door", 140.00, 55, "288273"));
	    laborchildlist.add(new Item("Labor-Dbl Security Door", 291.00, 134, "288281"));
	    laborchildlist.add(new Item("Labor-Mileage", 2.00, 2, "154641"));
	    laborchildlist.add(new Item("Labor-Custom Work", 1.00, 1, "229019"));
	    laborgroup.setItems(laborchildlist);	
	    return laborgroup;
	}
	
	
	
	
	
	
	
	public static ItemAssortment getPatioDoorAssortment() {
        ItemAssortment patiodoorsgroup = new ItemAssortment();
        ArrayList<Item> patiodoorschildlist = new ArrayList<Item>();
        patiodoorsgroup.setName("Patio Door");
        patiodoorschildlist.add(new Item("5' Patio Door(LH)", 428, "290229", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Patio Door(LH)", 322, "290225", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Patio Door(RH)", 322, "290224", ItemType.Material));
        patiodoorsgroup.setItems(patiodoorschildlist);
        return patiodoorsgroup;
	}
	public static ItemAssortment getFrenchDoorAssortment() {
        ItemAssortment patiodoorsgroup = new ItemAssortment();
        ArrayList<Item> patiodoorschildlist = new ArrayList<Item>();
        patiodoorsgroup.setName("Fench Door");
         patiodoorschildlist.add(new Item("5' French Door(RH) w/ Grid", 324, "328360", ItemType.Material));
        patiodoorschildlist.add(new Item("5' French Door(LH) w/ Grid", 324, "328361", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(LH) w/ Grid", 324, "328356", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Grid", 324, "328354", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(LH) w/ Blinds", 571, "394018", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Blinds", 571, "394021", ItemType.Material));
        patiodoorschildlist.add(new Item("6' French Door(RH) w/ Grid + Blinds", 698, "289766", ItemType.Material));
        patiodoorschildlist.add(new Item("6' Fre nnch Door(LH) w/ Grid + Blinds", 698, "289767", ItemType.Material));
        patiodoorschildlist.add(new Item("Custom Item", 1.00, 1, "229019", ItemType.Material));
        patiodoorsgroup.setItems(patiodoorschildlist);
        return patiodoorsgroup;
	}
	public static ItemAssortment getEntryDoorAssortment() {
		ItemAssortment doorsgroup = new ItemAssortment();
        ArrayList<Item> doorchildlist = new ArrayList<Item>();
        doorsgroup.setName("Entry Door");
        doorchildlist.add(new Item("6-Panel Steel Door", 139.00, "229019", ItemType.Material));
        doorchildlist.add(new Item("9-Lite Steel Door", 184.00, "229019", ItemType.Material));
        doorsgroup.setItems(doorchildlist);
        return doorsgroup;	
    }
	public static ItemAssortment getStormDoorAssortment() {
		ItemAssortment sdgroup = new ItemAssortment();
        sdgroup.setName("Storm Door");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Tradewind Midview", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Midview Beveled Glass", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Fullview", 297.00, "229024",ItemType.Material));
        list.add(new Item("Tradewind Fullview Beveled Glass", 297.00, "229024", ItemType.Material));
        sdgroup.setItems(list);
        return sdgroup;
	}
	public static ItemAssortment getSlidingDoorAssortment() {
        ItemAssortment patiodoorsgroup = new ItemAssortment();
        ArrayList<Item> patiodoorschildlist = new ArrayList<Item>();
        patiodoorsgroup.setName("Sliding Door");
        patiodoorschildlist.add(new Item("5' RB Vinyl Sliding Door w/ Grid", 298, "447367", ItemType.Material));
        patiodoorschildlist.add(new Item("6' RB Vinyl Sliding Door w/ Grid", 425, "447366", ItemType.Material));
        patiodoorschildlist.add(new Item("Pella Vinyl Sliding Door(RH) w/ Blinds", 748, "326402", ItemType.Material));
        patiodoorschildlist.add(new Item("Pella Vinyl Sliding Door(LH) w/ Blinds", 748, "326404", ItemType.Material));
        patiodoorsgroup.setItems(patiodoorschildlist);
        return patiodoorsgroup;
	}
	
	
	
	
	
	
	
	public static ItemAssortment PseGutterAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE-Gutter");
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
	public static ItemAssortment PseRoofAssortment(){
		ItemAssortment RoofGroup = new ItemAssortment();
	    RoofGroup.setName("PSE-Roofing");
	    ArrayList<Item> list = new ArrayList<Item>();
	    list.add(new Item("OC Supreme AR", 248.80, "NA"));
        list.add(new Item("OC Oakridge AR", 257.63));
        list.add(new Item("OC Dur Prem Cool Colors", 394.37));
        list.add(new Item("OC TruDef Duration Design AR", 289.72));
        list.add(new Item("OC TruDef Max", 289.72));
        list.add(new Item("OC Berkshire", 429.10));
        list.add(new Item("OC Weatherguard", 307.48));
        list.add(new Item("OC Woodcrest", 332.71));
        list.add(new Item("OC Woodmoor AR Lifetime LTD", 394.16));
        list.add(new Item("Labor-Layer Removal", 15.00, 10.00, "228230"));
        list.add(new Item("Labor-Higher Pitch", 24.00, 18.00, "228231"));
        list.add(new Item("Labor-Multiple Story", 24.00, 18.00, "228232"));
        list.add(new Item("Labor-OSB/Plywood(SH)", 81.00, 50.00, "228239"));
        list.add(new Item("Labor-Stnd Fascia", 3.00, 2.00, "228240"));
        list.add(new Item("Labor-Skylight Replacement", 150.00, 100.00, "228244"));
        list.add(new Item("Labor-Rmv/Replace Satellite", 39.00, 25.00, "228245"));
        list.add(new Item("Labor-Skylight Flash", 110.00, 75.00, "228247"));
        list.add(new Item("Labor-Soffit Vent", 15.00, 10.00, "235811"));
        list.add(new Item("Labor-1x Deck", 3.00, 2.25, "295608"));
        list.add(new Item("Labor-Rmv Metal/Tile/Wd Roof", 25.00, 15.00, "322732"));
        list.add(new Item("Labor-New Rafter Tail", 73.00, 55.00, "322734"));
        list.add(new Item("Labor-Chimney Cricket", 130.00, 90.00, "322735"));
        list.add(new Item("Labor-Custom Fascia", 6.00, 4.00, "322738"));
        list.add(new Item("Labor-Ice/Water Barrier", 15.00, 10.00, "323870"));
        list.add(new Item("Labor-Gutter Removal", 1.05, .75, "228740"));
        list.add(new Item("Labor-Custom Sidewall Flashing", 187.50, 125.00, "322740"));
        list.add(new Item("Labor-Cover Over Vent", 11.50, 10.00, "401945"));
        list.add(new Item("Labor-Tarping Service", 1, 1, "367623"));
        list.add(new Item("Labor-Mileage", 2, 2, "154378"));
        list.add(new Item("Labor-Custom Work", 1));
        RoofGroup.setItems(list);
        return RoofGroup;
	}
	
	
	
	
	
	
	
	
	
    public static ItemAssortment getPineTrimAssortment(){
    	ItemAssortment mldtrimgroup = new ItemAssortment();
        mldtrimgroup.setName("PNE Trim");
        ArrayList<Item> mldtrimchildlist = new ArrayList<Item>();
        mldtrimchildlist.add(new Item("PNE SCRN-8", 3.12, "3542", ItemType.Material));
        mldtrimchildlist.add(new Item("PNE S4S-8", 4.72, "3487", ItemType.Material));
        mldtrimchildlist.add(new Item("PNE Mullion-8", 7.84, "3077", ItemType.Material));
        mldtrimgroup.setItems(mldtrimchildlist);
        return mldtrimgroup;
    }
    public static ItemAssortment getPFJTrimAssortment(){
    	ItemAssortment mldtrimgroup = new ItemAssortment();
        mldtrimgroup.setName("PFJ Trim");
        ArrayList<Item> mldtrimchildlist = new ArrayList<Item>();
        mldtrimchildlist.add(new Item("PFJ CASE-7", 4.62, "110515", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ STOP-7", 3.50, "110103", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ BKMD-S-7", 11.13, "31140", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ BKMD-S-10", 15.90, "31143", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ BKMD-R-7", 11.13, "110458", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ BKMD-R-14", 22.26, "110466", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ H-Mould-7", 4.62, "110515", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ QTRD-8", 5.52, "112462", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ SHOE-8", 4.08, "112484", ItemType.Material));
        mldtrimchildlist.add(new Item("PFJ STOCK-8", 5.92, "110451", ItemType.Material));
        mldtrimgroup.setItems(mldtrimchildlist);
        return mldtrimgroup;
    }
    public static ItemAssortment getWWTrimAssortment(){
        ItemAssortment wwtrimgroup = new ItemAssortment();
        ArrayList<Item> wwchildlist = new ArrayList<Item>();
        wwtrimgroup.setName("White Pine Trim");
        wwchildlist.add(new Item("WW 1x2x8", 2.98, "1408", ItemType.Material));
        wwchildlist.add(new Item("WW 1x4x8", 4.73, "940", ItemType.Material));
        wwchildlist.add(new Item("WW 1x4x10", 6.73, "941", ItemType.Material));
        wwchildlist.add(new Item("WW 1x4x12", 8.22, "942", ItemType.Material));
        wwchildlist.add(new Item("WW 1x6x8", 6.98, "951", ItemType.Material));
        wwchildlist.add(new Item("WW 1x6x10", 11.28, "952", ItemType.Material));
        wwchildlist.add(new Item("WW 1x6x12", 13.98, "953", ItemType.Material));
        wwtrimgroup.setItems(wwchildlist);
        return wwtrimgroup;
    }
    public static ItemAssortment getArmorwoodTrimAssortment(){
    	ItemAssortment armorwoodgroup = new ItemAssortment();
        armorwoodgroup.setName("Armorwood Trim");
        ArrayList<Item> armorwoodchildlist = new ArrayList<Item>();
        armorwoodchildlist.add(new Item("ArmourWood 1x4x10", 12.57, "217737", ItemType.Material));
        armorwoodchildlist.add(new Item("ArmourWood 1x4x16", 18.22, "217630", ItemType.Material));
        armorwoodchildlist.add(new Item("ArmourWood 1x6x10", 16.98, "217374", ItemType.Material));
        armorwoodchildlist.add(new Item("ArmourWood 1x6x16", 28.11, "217506", ItemType.Material));
        armorwoodchildlist.add(new Item("ArmourWood 1x8x10", 27.98, "217503", ItemType.Material));
        armorwoodchildlist.add(new Item("ArmourWood 1x8x16", 40.97, "217496", ItemType.Material));
        armorwoodgroup.setItems(armorwoodchildlist);
        return armorwoodgroup;
    }
    public static ItemAssortment getPVCTrimAssortment(){
    	ItemAssortment pvctrimgroup = new ItemAssortment();
        pvctrimgroup.setName("PVC Trim");
        ArrayList<Item> pvctrimchildlist = new ArrayList<Item>();
        pvctrimchildlist.add(new Item("PVC 1x2x12", 10.18, "113010", ItemType.Material));
        pvctrimchildlist.add(new Item("PVC 1x4x8", 13.04, "209620", ItemType.Material));
        pvctrimchildlist.add(new Item("PVC 1x6x8", 20.56, "209621", ItemType.Material));
        pvctrimchildlist.add(new Item("PVC 1/4\"x6x8", 17.28, "310630", ItemType.Material));
        pvctrimchildlist.add(new Item("PVC Lattice-2\"x8", 5.12, "209626", ItemType.Material));
        pvctrimchildlist.add(new Item("PVC BKMD-S-8", 11.18, "98458", ItemType.Material));
        pvctrimgroup.setItems(pvctrimchildlist);
        return pvctrimgroup;
    }
    public static ItemAssortment getCedarTrimAssortment(){
    	ItemAssortment cedargroup = new ItemAssortment();
        cedargroup.setName("Trim - Cedar");
        ArrayList<Item> cedarchildlist = new ArrayList<Item>();
        cedarchildlist.add(new Item("Cedar 1x2x8", 2.26, "7592", ItemType.Material));
        cedarchildlist.add(new Item("Cedar 1x4x8", 4.88, "7499", ItemType.Material));
        cedarchildlist.add(new Item("Cedar 1x4x10", 6.78, "7581", ItemType.Material));
        cedarchildlist.add(new Item("Cedar 1x4x12", 7.99, "7500", ItemType.Material));
        cedarchildlist.add(new Item("Cedar 1x6x8", 10.57, "7502", ItemType.Material));
        cedarchildlist.add(new Item("Cedar 1x6x12", 15.57, "7503", ItemType.Material));
        cedargroup.setItems(cedarchildlist);
        return cedargroup;
    }
    public static ItemAssortment getSYPTrimAssortment(){
    	ItemAssortment sypgroup = new ItemAssortment();
        sypgroup.setName("SYP Trim");
        ArrayList<Item> sypchildlist = new ArrayList<Item>();
        sypchildlist.add(new Item("SYP 1x4x8", 5.97, "1549", ItemType.Material));
        sypchildlist.add(new Item("SYP 1x4x10", 7.47, "1567", ItemType.Material));
        sypchildlist.add(new Item("SYP 1x4x12", 8.97, "1568", ItemType.Material));
        sypchildlist.add(new Item("SYP 1x6x8", 9.97, "1588", ItemType.Material));
        sypchildlist.add(new Item("SYP 1x6x10", 11.57, "1589", ItemType.Material));
        sypchildlist.add(new Item("SYP 1x6x12", 13.97, "1611", ItemType.Material));
        sypgroup.setItems(sypchildlist);
        return sypgroup;
    }
    public static ItemAssortment getPonderosaPineTrimAssortment(){
    	ItemAssortment clearpinegroup = new ItemAssortment();
        clearpinegroup.setName("Ponderosa Pine Trim");
        ArrayList<Item> clearpinechildlist = new ArrayList<Item>();
        clearpinechildlist.add(new Item("Ponderosa Pine 1x4x6", 6.58, "1154", ItemType.Material));
        clearpinechildlist.add(new Item("Ponderosa Pine 1x4x8", 8.58, "1155", ItemType.Material));
        clearpinechildlist.add(new Item("Ponderosa Pine 1x4x10", 10.72, "20447", ItemType.Material));
        clearpinechildlist.add(new Item("Ponderosa Pine 1x6x6", 12.58, "1157", ItemType.Material));
        clearpinechildlist.add(new Item("Ponderosa Pine 1x6x8", 16.31, "1158", ItemType.Material));
        clearpinechildlist.add(new Item("Ponderosa Pine 1x6x10", 20.98, "25745", ItemType.Material));
        clearpinegroup.setItems(clearpinechildlist);
        return clearpinegroup;
    }
    public static ItemAssortment getRedOakTrimAssortment(){
    	ItemAssortment redoakgroup = new ItemAssortment();
        redoakgroup.setName("Red Oak Trim");
        ArrayList<Item> redoakchildlist = new ArrayList<Item>();
        redoakchildlist.add(new Item("Red Oak 1x4x6", 12.38, "1048", ItemType.Material));
        redoakchildlist.add(new Item("Red Oak 1x4x8", 14.88, "1049", ItemType.Material));
        redoakchildlist.add(new Item("Red Oak 1x4x10", 18.88, "28334", ItemType.Material));
        redoakchildlist.add(new Item("Red Oak 1x6x6", 18.57, "1053", ItemType.Material));
        redoakchildlist.add(new Item("Red Oak 1x6x8", 21.57, "1054", ItemType.Material));
        redoakchildlist.add(new Item("Red Oak 1x6x10", 32.97, "28341", ItemType.Material));
        redoakgroup.setItems(redoakchildlist);
        return redoakgroup;
    }  
    public static ItemAssortment getPoplarTrimAssortment(){
    	ItemAssortment poplargroup = new ItemAssortment();
        poplargroup.setName("Poplar Trim");
        ArrayList<Item> poplarchildlist = new ArrayList<Item>();
        poplarchildlist.add(new Item("Poplar 1x4x6", 9.43, "1088", ItemType.Material));
        poplarchildlist.add(new Item("Poplar 1x4x8", 11.88, "1088", ItemType.Material));
        poplarchildlist.add(new Item("Poplar 1x4x10", 12.88, "28376", ItemType.Material));
        poplarchildlist.add(new Item("Poplar 1x6x6", 12.43, "1092", ItemType.Material));
        poplarchildlist.add(new Item("Poplar 1x6x8", 17.88, "1093", ItemType.Material));
        poplarchildlist.add(new Item("Poplar 1x6x10", 19.88, "28391", ItemType.Material));
        poplargroup.setItems(poplarchildlist);
        return poplargroup;
    }
    public static ItemAssortment getAcqTrimAssortment(){
    	ItemAssortment acqgroup = new ItemAssortment();
        acqgroup.setName("ACQ Trim");
        ArrayList<Item> acqchildlist = new ArrayList<Item>();
        acqchildlist.add(new Item("ACQ 1x4x6", 3.57, "201710", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x4x8", 3.77, "201711", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x4x10", 3.97, "201714", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x4x12", 5.37, "201715", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x6x6", 4.57, "201719", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x6x8", 5.68, "201722", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x6x10", 5.98, "201723", ItemType.Material));
        acqchildlist.add(new Item("ACQ 1x6x12", 8.58, "201725", ItemType.Material));
        acqgroup.setItems(acqchildlist);
        return acqgroup;
    }
    

}
