package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class CementSidingProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {
	public ItemAssortment HardieLapSiding(){
		ItemAssortment lapsidinggroup = new ItemAssortment();
        ArrayList<Item> list = new ArrayList<Item>();
        lapsidinggroup.setName("Hardie - Plank");
        list.add(new Item("8.25\"x12' Primed CM Plank", 7.96, "19319", ItemType.Material));
        list.add(new Item("12\"x12' Primed CM Plank", 7.96, "88706", ItemType.Material));
        list.add(new Item("5.25\"x12' CP CM Plank", 6.74, 0, "165986-###101", ItemType.Material));
        list.add(new Item("6.25\"x12' CP CM Plank", 8.02, 0, "165986-###111", ItemType.Material));
        list.add(new Item("7.25\"x12' CP CM Plank", 9.31, 0, "165986-###121", ItemType.Material));
        list.add(new Item("8.25\"x12' CP CM Plank", 10.60, 0, "165986-###131", ItemType.Material));
        lapsidinggroup.setItems(list);
        return lapsidinggroup;        
	}
	
	public ItemAssortment HardiePanelSiding(){
		 ItemAssortment panelgroup = new ItemAssortment();
	       ArrayList<Item> list = new ArrayList<Item>();
	        panelgroup.setName("Hardie - Panel");
	        list.add(new Item("4'x8' Primed CM Panel", 23.28, "37692", ItemType.Material));
	        list.add(new Item("4'x8' Primed 8OC Panel", 31.26, "128526", ItemType.Material));
	        list.add(new Item("4'x8' Primed Stucco Panel", 31.44, "89434", ItemType.Material));
	        list.add(new Item("4'x8' Primed Smooth Panel", 28.22, "7102", ItemType.Material));
	        list.add(new Item("4'x8' CP CM Panel", 41.09,  "165986-###371", ItemType.Material));
	        list.add(new Item("4'x10' CP CM Panel", 51.36, "165986-###381", ItemType.Material));
	        list.add(new Item("4'x8' CP Smooth Panel", 41.09, "165986-###", ItemType.Material));
	        list.add(new Item("4'x10' CP Smooth Panel", 51.36, "165986-###", ItemType.Material));
	        list.add(new Item("4'x8' CP 8OC Panel", 41.09,"165986-###321", ItemType.Material));
	        list.add(new Item("4'x10' CP 8OC Panel", 51.36, "165986-###331", ItemType.Material));
	        list.add(new Item("4'x8' CP Stucco Panel", 41.09,"165986-###361", ItemType.Material));
	        list.add(new Item("4'x10' CP Stucco Panel", 51.36, "165986-###391", ItemType.Material));
	        panelgroup.setItems(list);
	        return panelgroup;
	}
	
	public ItemAssortment HardieSoffit(){
		
		 ItemAssortment soffitgroup = new ItemAssortment();
		 ArrayList<Item> list = new ArrayList<Item>();
	        soffitgroup.setName("Hardie - Soffit");
	        list.add(new Item("12\"x12' CP CM NV Soffit", 16.40, "165986-###0501", ItemType.Material));
	        list.add(new Item("12\"x12' CP CM V Soffit", 19.46, "165986-###0521", ItemType.Material));
	        list.add(new Item("16\"x12' CP CM NV Soffit", 21.54, "165986-###0581", ItemType.Material));
	        list.add(new Item("16\"x12' CP CM V Soffit", 25.61,  "165986-###0531", ItemType.Material));
	        list.add(new Item("24\"x8' CP CM NV Soffit", 21.54,  "165986-###481", ItemType.Material));
	        list.add(new Item("24\"x8' CP CM V Soffit", 25.86,  "165986-###541", ItemType.Material));
	        soffitgroup.setItems(list);
	        return soffitgroup;
	}
	
	public ItemAssortment HardieTrim(){
		 	ItemAssortment trimgroup = new ItemAssortment();
	        ArrayList<Item> list = new ArrayList<Item>();
	        trimgroup.setName("Hardie - Trim");
	        list.add(new Item("3.5\"x12' Primed Trim", 9.48, "33519", ItemType.Material));
	        list.add(new Item("5.5\"x12' Primed Trim", 15.98, "30615", ItemType.Material));
	        list.add(new Item("2.5\"x12' CP Trim", 7.72, "165986-##961", ItemType.Material));
	        list.add(new Item("3.5\"x12' CP Trim", 11.80, "165986-###1661", ItemType.Material));
	        list.add(new Item("5.5\"x12' CP Trim", 17.98, "165986-###1671", ItemType.Material));
	        list.add(new Item("7.25\"x12' CP Trim", 23.36, "165986-###1681", ItemType.Material));
	        list.add(new Item("9.25\"x12' CP Trim", 29.52, "165986-###1691", ItemType.Material));
	        list.add(new Item("11.25\"x12' CP Trim", 36.70, "165986-###1701", ItemType.Material));
	        trimgroup.setItems(list);
	        return trimgroup;
	}
	
	public ItemAssortment HardieSidingAccessories(){
        ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment jhaccgroup = new ItemAssortment();
        jhaccgroup.setName("Hardie - Accessories");
        list.add(new Item("CP Caulk(12)", 71.01, "165986-###821", ItemType.Material));
        list.add(new Item("CP Paint Kit", 14.61, "165986-###801", ItemType.Material));
        list.add(new Item("CP Z Trim 8'", 7.01, "165986-###0038", ItemType.Material));
        list.add(new Item("CP Drip Trim", 4.64, "165986-###0005", ItemType.Material));
        list.add(new Item("CP H Trim 8'", 3.98, "165986-###305", ItemType.Material));
        jhaccgroup.setItems(list);
		return jhaccgroup;
	}
	
	public ItemAssortment HardieInstallation(){
        ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor - Cement Siding");
        list.add(new Item("Labor-Plank/Panel(Sq)", 299, 229, "248397"));
        list.add(new Item("Labor-Rmv/Haul Away Siding(Sq)", 54, 38, "248397"));
        list.add(new Item("Labor-Soffit(SqFt)", 3, 2, "248397"));
        list.add(new Item("Labor-Fascia(Lf)", 3.5, 2.5, "248397"));
        list.add(new Item("Labor-Build/Frame Rafter Tail(Lf)", 3, 2.5, "248397"));
        list.add(new Item("Labor-Beam Wrap(Lf)", 2.5, 2, "248397"));
        list.add(new Item("Labor-Gable Vent(Ea)", 88, 60, "248397"));
        list.add(new Item("Labor-Exterior Shutter(Pair)", 30, 20, "248397"));
        list.add(new Item("Labor-Insulation Board/Fur Out(SqFt)", .85, .50, "248397"));
        list.add(new Item("Labor-OSB/Plywood(SH)", 60, 45, "248397"));
        list.add(new Item("Labor-Mileage(Ea)", 2, 2, "248397"));
        list.add(new Item("Labor-Minimum Charge", 600, 400, "248397"));
        laborgroup.setItems(list);
		return laborgroup;
	}
	
	public ItemAssortment PseHardieSiding() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Hardie Siding");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("CP-Hardieplank", 622.30));
        list.add(new Item("CP-Hardiepanel", 645.30));
        list.add(new Item("CP-Hardieshingle", 1011.30));
        list.add(new Item("CP-Non-Vented Soffit 12\"(SqFt)", 4.50));
        list.add(new Item("CP-Non-Vented Soffit 16\"(SqFt)", 4.60));
        list.add(new Item("CP-Non-Vented Soffit 24\"(SqFt)", 5.60));
        list.add(new Item("CP-Vented Soffit 12\"(SqFt)", 6.50));
        list.add(new Item("CP-Vented Soffit 16\"(SqFt)", 6.50));
        list.add(new Item("CP-Vented Soffit 24\"(SqFt)", 5.95));
        list.add(new Item("CP-Fascia 3\"(Lf)", 4.15));
        list.add(new Item("CP-Fascia 4\"(Lf)", 4.25));
        list.add(new Item("CP-Fascia 6\"(Lf)", 4.90));
        list.add(new Item("CP-Fascia 8\"(Lf)", 5.45));
        list.add(new Item("CP-Fascia 10\"(Lf)", 6.15));
        list.add(new Item("CP-Fascia 12\"(Lf)", 6.75));
        list.add(new Item("Labor-Rmv/Haul Away Siding", 54, 38, "248397"));
        list.add(new Item("Labor-Beam Wrap", 2.5, 2, "248397"));
        list.add(new Item("Labor-Gable Vent", 88, 60, "248397"));
        list.add(new Item("Labor-Exterior Shutter(Pair)", 30, 20, "248397"));
        list.add(new Item("Labor-Insulation Board/Fur Out(SqFt)", .85, .50, "248397"));
        list.add(new Item("Labor-Build/Frame Rafter Tail", 3, 2.5, "248397"));
        list.add(new Item("Labor-OSB/Plywood(SH)", 60, 45, "248397"));
        list.add(new Item("Labor-Cut in Soffit Vent", 3, 2, "248397"));
        list.add(new Item("Labor-Mileage", 2, 2, "248397"));
        Group.setItems(list);
        return Group;
    }

	

	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(PseHardieSiding());
		list.add(HardieLapSiding());
		list.add(HardiePanelSiding());
		list.add(HardieTrim());
		list.add(HardieSoffit());
		list.add(HardieSidingAccessories());
		list.add(HardieInstallation());
		list.add(super.SidingAccessories());
		list.add(super.DimensionalPineLumber());
		return list;
	}


}
