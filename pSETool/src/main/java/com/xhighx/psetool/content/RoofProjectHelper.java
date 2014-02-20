package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class RoofProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {
	
	public ItemAssortment PseShingleRoofAssortment(){
		ItemAssortment RoofGroup = new ItemAssortment();
        RoofGroup.setName("PSE - Shingle Roof");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("PSE-OC Supreme AR", 248.80));
        list.add(new Item("PSE-OC Oakridge AR", 257.63));
        list.add(new Item("PSE-OC Dur Prem Cool Colors", 394.37));
        list.add(new Item("PSE-OC TruDef Duration Design AR", 289.72));
        list.add(new Item("PSE-OC TruDef Max", 289.72));
        list.add(new Item("PSE-OC Berkshire", 429.10));
        list.add(new Item("PSE-OC Weatherguard", 307.48));
        list.add(new Item("PSE-OC Woodcrest", 332.71));
        list.add(new Item("PSE-OC Woodmoor AR Lifetime LTD", 394.16));
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
	public ItemAssortment SupremeSeriesAssortment(){
		ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment supremegroup = new ItemAssortment();
        supremegroup.setName("OC Supreme Series");
        list.add(new Item("OC Supreme-Driftwood", 23.75, "14609", ItemType.Material));
        list.add(new Item("OC Supreme-Weatherwood", 23.75, "12914", ItemType.Material));
        list.add(new Item("OC Supreme-Shasta White", 23.75, "14614", ItemType.Material));
        list.add(new Item("OC Supreme-Desert Tan", 23.75, "14613", ItemType.Material));
        list.add(new Item("OC Supreme-Estate Grey", 23.75, "14624", ItemType.Material));
        list.add(new Item("OC Supreme-Brownwood", 23.75, "12906", ItemType.Material));
        supremegroup.setItems(list);
		return supremegroup;
	}
	public ItemAssortment OakridgeSeriesAssortment(){
		ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment oakgroup = new ItemAssortment();
        oakgroup.setName("OC Oakridge Series");
        list.add(new Item("OC Oakridge-Estate Grey", 30.76, "10076", ItemType.Material));
        list.add(new Item("OC Oakridge-Brownwood", 30.76, "12559", ItemType.Material));
        list.add(new Item("OC Oakridge-Onyx Black", 30.76, "10086", ItemType.Material));
        list.add(new Item("OC Oakridge-Driftwood", 30.76, "10073", ItemType.Material));
        list.add(new Item("OC Oakridge-Desert Tan", 30.76, "10074", ItemType.Material));
        oakgroup.setItems(list);
        return oakgroup;
	}
	
	public ItemAssortment RoofAccessoriesAssortment(){
		ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment accgroup = new ItemAssortment();
        accgroup.setName("Roof Accessories");
        list.add(new Item("Starter Shingle", 30.00, "113047", ItemType.Material));
        list.add(new Item("#15 Felt", 19.25, "10306", ItemType.Material));
        list.add(new Item("#30 Felt", 19.25, "10308", ItemType.Material));
        list.add(new Item("Ice & Water Barrier", 77.87, "11615", ItemType.Material));
        list.add(new Item("Roof Underlayment 4'x250'", 112.00, "283849", ItemType.Material));
        list.add(new Item("20\"x50' Galv Metal", 59.25, "12520", ItemType.Material));
        list.add(new Item("1.5\"x1.5\" White Drip Edge", 3.45, "143364", ItemType.Material));
        list.add(new Item("2\"x2\" Galv Drip Edge", 4.68, "20192", ItemType.Material));
        list.add(new Item("1\"-3\" Galv Pipe Flash", 6.13, "200333", ItemType.Material));
        list.add(new Item("3\"-4\" Galv Pipe Flash", 7.40, "200334", ItemType.Material));
        list.add(new Item("Roof Cement 1 Gal", 9.98, "12011", ItemType.Material));
        list.add(new Item("Buttonkap Nails 3000/cnt", 25.98, "110181", ItemType.Material));
        accgroup.setItems(list);
		return accgroup;
	}
	
	public ItemAssortment ShingleRoofLaborAssortment(){
		ArrayList<Item> list = new ArrayList<Item>();
        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor - Shingle Roof");
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
  
    

	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseShingleRoofAssortment());
		list.add(this.ShingleRoofLaborAssortment());
		list.add(this.SupremeSeriesAssortment());
		list.add(this.OakridgeSeriesAssortment());
		list.add(this.RoofAccessoriesAssortment());
		list.add(super.Plywood());
		list.add(super.DimensionalPineLumber());
		return list;
	}
	

}
