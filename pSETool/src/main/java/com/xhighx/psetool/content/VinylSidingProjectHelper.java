package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;

public class VinylSidingProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

	
	public ItemAssortment GPSidingAssortment() {

		ItemAssortment gpsidinggroup = new ItemAssortment();
		ArrayList<Item> list = new ArrayList<Item>();
		gpsidinggroup.setName("SOS - Georgia Pacific Siding");
		list.add(new Item("GP-VP D4 Traditional", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-VP D5 Traditional", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-VP D4 Dutch", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-VP D5 Dutch", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Forest Ridge D4", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Forest Ridge D5", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Shadow Ridge D4", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Shaodw Ridge D5", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Cedar Lane D4", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Cedar Lane D4.5", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Cedar Lane D5", 9.00, "168290", ItemType.Material));
		list.add(new Item("GP-Cedar Spectrum Shingle", 9.00, "168290",
				ItemType.Material));
		list.add(new Item("GP-Cedar Spectrum Round Cut", 9.00, "168290",
				ItemType.Material));
		list.add(new Item("GP-Board & Batten Vertical", 9.00, "168290",
				ItemType.Material));
		gpsidinggroup.setItems(list);
		return gpsidinggroup;
	}
		
public ItemAssortment DBSidingAssortment(){

		ItemAssortment dbsidinggroup = new ItemAssortment();
		dbsidinggroup.setName("SOS - Durabuilt Siding");
		ArrayList<Item>list = new ArrayList<Item>();
		list.add(new Item("DB-410 Series Traditional D4", 8.65,
				"89001 - 36560xxx", ItemType.Material));
		list.add(new Item("DB-410 Series Traditional D5", 10.51,
				"89001 - 36562xxx", ItemType.Material));
		list.add(new Item("DB-410 Series Dutch D4.5", 9.59,
				"89001 - 36561xxx", ItemType.Material));
		list.add(new Item("DB-410 Series T3", 9.57, "89001 - 36540xxx",
				ItemType.Material));
		list.add(new Item("DB-440 Series Traditional  D4", 10.65,
				"89001 - 36556xxx", ItemType.Material));
		list.add(new Item("DB-440 Series Traditional  D5", 10.51,
				"89001 - 36558xxx", ItemType.Material));
		list.add(new Item("DB-440 Series Dutch  D4", 10.86,
				"89001 - 36404xxx", ItemType.Material));
		list.add(new Item("DB-440 Series Dutch  D5", 10.70,
				"89001 - 36405xxx", ItemType.Material));
		list.add(new Item("DB-450 Series Beaded 6.5\"", 8.24,
				"89001 - 36433xxx", ItemType.Material));
		list.add(new Item("DB-480 Series Board & Batten 7\"", 8.33,
				"89001 - 36505xxx", ItemType.Material));
		list.add(new Item("DB-650 Series Cedar Shingle", 168.00,
				"89001 - 36515xxx", ItemType.Material));
		list.add(new Item("DB-660 Series Cedar Half Round", 168.00,
				"89001 - 36516xxx", ItemType.Material));
		list.add(new Item("DB-800 Series Insulated D6", 29.00,
				"89001 - 36490xxx", ItemType.Material));
		dbsidinggroup.setItems(list);
		return dbsidinggroup;
	}
	public ItemAssortment DBAccessoriesAssortment(){
		ItemAssortment dbaccgroup = new ItemAssortment();
		dbaccgroup.setName("SOS - Durabuilt Accessories");
		ArrayList<Item>list = new ArrayList<Item>();
		list.add(new Item("DB-400 Series 5/8\" J-Channel", 4.88,
				"89145 - 36585xxx", ItemType.Material));
		list.add(new Item("DB-400 Series 7/8\" J-Channel", 6.88,
				"89145 - 40024xxx", ItemType.Material));
		list.add(new Item("DB-400 Series Finish Trim", 6.48,
				"89145 - 40028xxx", ItemType.Material));
		list.add(new Item("DB-400 Series WG OS Corner", 24.88,
				"89145 - 40020xxx", ItemType.Material));
		list.add(new Item("DB-400 Series SM OS Corner", 20.88,
				"89145 - 40021xxx", ItemType.Material));
		list.add(new Item("DB-400 Series SM IS Corner", 11.88,
				"89145 - 364xxx", ItemType.Material));
		list.add(new Item("DB-900 Series J-Channel", 12.48,
				"89145 - 36437101", ItemType.Material));
		list.add(new Item("DB-400/900 Series H-Channel", 6.48,
				"89145 - 40028xxx", ItemType.Material));
		list.add(new Item("DB-800 Series 1.25\" J-Channel", 8.89,
				"89145 - 40023xxx", ItemType.Material));
		list.add(new Item("DB-800 Series Finish Trim", 13.49,
				"89145 - 36529xxx", ItemType.Material));
		list.add(new Item("DB-800 Series OS Corner", 54.51,
				"89145 - 36492xxx", ItemType.Material));
		list.add(new Item("DB-800 Series IS Corner", 20.51,
				"89145 - 36493xxx", ItemType.Material));
		list.add(new Item("DB-800 Series W&D Lineal", 34.51,
				"89145 - 36494xxx", ItemType.Material));
		list.add(new Item("DB-800 Series Lineal Strater Strip", 17.51,
				"89145 - 36539001", ItemType.Material));
		dbaccgroup.setItems(list);
		return dbaccgroup;
	}
public ItemAssortment DBSoffitAssortment(){
		ItemAssortment dbsoffitgroup = new ItemAssortment();
		dbsoffitgroup.setName("SOS - Durabuilt Soffit");
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("DB-910 Series T4 Solid Soffit", 12.98,
				"89001 - 36572xxx", ItemType.Material));
		list.add(new Item("DB-911 Series T4 CV Soffit", 13.28,
				"89001 - 36573xxx", ItemType.Material));
		list.add(new Item("DB-912 Series T4 Vented Soffit", 13.28,
				"89001 - 36574xxx", ItemType.Material));
		list.add(new Item("DB-930 Series D5 Solid Soffit", 11.68,
				"89001 - 36575xxx", ItemType.Material));
		list.add(new Item("DB-930 Series D5 Vented Soffit", 11.98,
				"89001 - 36576xxx", ItemType.Material));
		list.add(new Item("DB-950 Series Beaded Soffit", 12.48,
				"89001 - 36445101", ItemType.Material));
		list.add(new Item("DB-953 Series Beaded HV Soffit", 12.68,
				"89001 - 36446101", ItemType.Material));
		list.add(new Item("DB-950 Series Beaded Soffit White", 12.48,
				"89001 - 36446101", ItemType.Material));
		list.add(new Item("DB-950 Series Beaded Soffit White", 12.48,
				"89001 - 36446101", ItemType.Material));
		dbsoffitgroup.setItems(list);
		return dbsoffitgroup;

		
	}

	
	

	public ItemAssortment VinylSidingLaborAssortment() {
		ItemAssortment lgroup = new ItemAssortment();
		ArrayList<Item> list = new ArrayList<Item>();
		lgroup.setName("Labor - Vinyl Siding");
		list.add(new Item("Labor-Vinyl Siding(Sq)", 135, 95, "227648"));
		list.add(new Item("Labor-Rmv/Haul Away Siding(Sq)", 54, 38, "56570"));
		list.add(new Item("Labor-Siding Beam Wrap(Lf)", 4, 3, "58610"));
		list.add(new Item("Labor-Stnd Fascia(Lf)", 4.5, 3, "227651"));
		list.add(new Item("Labor-Soffit(Lf)", 5.7, 4, "227650"));
		list.add(new Item("Labor-Gable Vent(Ea)", 4.5, 3, "227663"));
		list.add(new Item("Labor-Door Wrap(Ea)", 55, 39, "227664"));
		list.add(new Item("Labor-Exterior Shutter(Pair)", 55, 20, "227668"));
		list.add(new Item("Labor-Furring Strip(SqFt)", 1.5, .75, "227670"));
		list.add(new Item("Labor-Mounting Block(Ea)", 4.5, 2.5, "235810"));
		list.add(new Item("Labor-Window Wrap(Ea)", 25, 17, "348408"));
		list.add(new Item("Labor-Rmv/Replace Gutter(Lf)", 1.3, 1, "357948"));
		list.add(new Item("Labor-Mileage(Ea)", 2, 2, "179091"));
		list.add(new Item("Labor-Minimum Charge", 600, 400, "227583"));
		lgroup.setItems(list);
		return lgroup;
	}

	
	public ItemAssortment PseVinylSidingAssortment() {

		ItemAssortment sidingGroup = new ItemAssortment();
		sidingGroup.setName("PSE - Vinyl Siding");
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("GP-Vision Pro D4 Traditional", 298.79));
		list.add(new Item("GP-Vision Pro D4 Dutch", 305.95));
		list.add(new Item("GP-Vision Pro D5 Traditional", 309.05));
		list.add(new Item("GP-Vision Pro D5 Dutch", 316.92));
		list.add(new Item("GP-Forest Ridge D4", 314.53));
		list.add(new Item("GP-Forest Ridge D5", 330.03));
		list.add(new Item("GP-Shadow Ridge D4", 326.70));
		list.add(new Item("GP-Shadow Ridge D5", 339.47));
		list.add(new Item("GP-Cedar Lane Select D4", 391.57));
		list.add(new Item("GP-Cedar Lane Select D4.5", 407.82));
		list.add(new Item("GP-Cedar Lane Select D5", 447.53));
		list.add(new Item("GP-Cedar Spectrum Shingle", 574.83));
		list.add(new Item("GP-Cedar Spectrum Round Cut", 617.39));
		list.add(new Item("GP-Board & Batten Vertical", 386.06));
		list.add(new Item("DB-Traditional Lap 410 Series D4", 292.94));
		list.add(new Item("DB-Traditional Lap 410 Series D5", 286.80));
		list.add(new Item("DB-410 Series Dutch Lap D4", 283.12));
		list.add(new Item("DB-410 Series T3", 299.94));
		list.add(new Item("DB-Traditional Lap 440 Series D4", 297.55));
		list.add(new Item("DB-Traditional Lap 440 Series D5", 294.61));
		list.add(new Item("DB-Dutch Lap 440 Series D4", 296.81));
		list.add(new Item("DB-Dutch Lap 440 Series D5", 299.62));
		list.add(new Item("DB-Beaded 450 Series 6.5", 318.00));
		list.add(new Item("DB-Cedar Shingle 650 Series", 516.94));
		list.add(new Item("DB-Cedar Shingle 660 Series Half Round",
				517.20));
		list.add(new Item("DB-Insulated Lap 800 Series 6\"", 435.40));
		sidingGroup.setItems(list);
		return sidingGroup;
	}
	public ItemAssortment PseVinylSoffitAssortment(){
		ItemAssortment sfGroup = new ItemAssortment();
		sfGroup.setName("PSE - Vinyl Soffit");
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("GP-Perforated Soffit D5", 7.04));
		list.add(new Item("GP-Solid Soffit D5", 7.02));
		list.add(new Item("GP-Perforated Soffit T4", 7.13));
		list.add(new Item("GP-Solid Matte Finish Soffit T4", 7.08));
		list.add(new Item("GP-Center Vent Soffit T4", 7.07));
		list.add(new Item("DB-D5 Solid Soffit 930 Series", 9.75));
		list.add(new Item("DB-D5 Vented Soffit 932 Series", 9.95));
		list.add(new Item("DB-Beaded Solid Soffit 950 Series", 11.95));
		list.add(new Item("DB-Beaded Hidden Vent Soffit 953 Series",
				12.05));
		list.add(new Item("DB-T4 Solid Soffit 910 Series", 9.17));
		list.add(new Item("DB-T4 Center Vent Soffit 911 Series", 9.38));
		list.add(new Item("DB-T4 Full Vent Soffit 912 Series", 9.38));
		list.add(new Item("D6 Solid Alum Soffit 160 Series", 10.75));
		list.add(new Item("DB-D6 Vented Alum Soffit 162 Series", 11.63));
		list.add(new Item("DB-T4 Solid Alum Soffit 120 Series", 11.63));
		list.add(new Item("DB-T4 Center Vent Alum Soffit 121 Series",
				11.63));
		list.add(new Item("DB-T4 Full Vent Alum Soffit 122 Series", 8.59));
		sfGroup.setItems(list);
		return sfGroup;
	}
	public ItemAssortment PseLaborAssortment(){
		ItemAssortment lGroup = new ItemAssortment();
		lGroup.setName("PSE - Additional Labor");
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item("Labor-Rmv/Haul Away Siding", 54));
		list.add(new Item("Labor-Siding Beam Wrap", 4));
		list.add(new Item("Labor-Stnd Fascia", 4.5));
		list.add(new Item("Labor-Gable Vent", 4.5));
		list.add(new Item("Labor-Exterior Shutter(Pair)", 55));
		list.add(new Item("Labor-Furring Strip", 1.5));
		list.add(new Item("Labor-Mounting Block", 1.5));
		list.add(new Item("Labor-Rmv/Replace Gutter", 1.3));
		list.add(new Item("Labor-Mileage", 2));
		list.add(new Item("Labor-Custom Work", 1));
		lGroup.setItems(list);
		return lGroup;
	}


	

	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		list.add(this.PseVinylSidingAssortment());
		list.add(this.PseVinylSoffitAssortment());
		list.add(this.PseLaborAssortment());
		list.add(super.SidingAccessories());
		list.add(this.GPSidingAssortment());
		list.add(this.DBSidingAssortment());
		list.add(this.DBSoffitAssortment());
		list.add(this.DBAccessoriesAssortment());
		list.add(this.VinylSidingLaborAssortment());
		list.add(super.SidingAccessories());
		list.add(super.DimensionalPineLumber());
		list.add(super.WWTrimBoardAssortment());
		list.add(super.Plywood());
		list.add(super.FurringStrip());
		list.add(super.PrimedMouldingAssortment());
		list.add(super.PVCTrimBoardAssortment());
		return list;
	}

}
