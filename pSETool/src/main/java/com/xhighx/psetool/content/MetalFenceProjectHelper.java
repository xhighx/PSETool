package com.xhighx.psetool.content;

import java.util.ArrayList;
import java.util.List;

import com.xhighx.psetool.model.Item;
import com.xhighx.psetool.model.Item.ItemType;
import com.xhighx.psetool.model.ItemAssortment;
import com.xhighx.psetool.model.ProjectAssortmentProvider;


public class MetalFenceProjectHelper extends ProjectHelper implements ProjectAssortmentProvider {

    public ItemAssortment StockBlackMetalFenceAssortment() {

        ArrayList<Item> stockblackfencelist = new ArrayList<Item>();
        ItemAssortment stockblackgroup = new ItemAssortment();
        stockblackgroup.setName("Stock Black Metal Fence");
        stockblackfencelist.add(new Item("3'x8' Black Panel", 39.00, "92379", ItemType.Material));
        stockblackfencelist.add(new Item("3'x3' Black Walk Gate", 51.00, "94528", ItemType.Material));
        stockblackfencelist.add(new Item("5'x8' Black Panel", 55.00, "94419", ItemType.Material));
        stockblackfencelist.add(new Item("5'x8' Black HD Panel", 82.00, "94493", ItemType.Material));
        stockblackfencelist.add(new Item("5' Black HD Walk Gate", 87.00, "95045", ItemType.Material));
        stockblackfencelist.add(new Item("78\" Black Post", 19.98, "419178", ItemType.Material));
        stockblackfencelist.add(new Item("60\" Black Flange Post", 16.98, "419177", ItemType.Material));
        stockblackfencelist.add(new Item("54\" Black Post", 13.98, "419172", ItemType.Material));
        stockblackfencelist.add(new Item("36\" Black Flange Post", 10.98, "419171", ItemType.Material));
        stockblackfencelist.add(new Item("Black Brackets(4)", 10.58, "99167", ItemType.Material));
        stockblackfencelist.add(new Item("Black HD Brackets(4)", 9.98, "99769", ItemType.Material));
        stockblackfencelist.add(new Item("Black FM Brackets(2)", 6.98, "419193", ItemType.Material));
        stockblackfencelist.add(new Item("Black Gate Kit", 16, "96102", ItemType.Material));
        stockblackfencelist.add(new Item("Black SC Gate Kit", 25, "419195", ItemType.Material));
        stockblackfencelist.add(new Item("80lb Concrete", 3.48, "10385", ItemType.Material));
        stockblackgroup.setItems(stockblackfencelist);
        return stockblackgroup;
    }
    public ItemAssortment StockWhiteMetalFenceAssortment(){

        ArrayList<Item> stockwhitefencelist = new ArrayList<Item>();
        ItemAssortment stockwhitegroup = new ItemAssortment();
        stockwhitegroup.setName("Stock White Metal Fence");
        stockwhitefencelist.add(new Item("3'x8' White Panel", 51.00, "94481", ItemType.Material));
        stockwhitefencelist.add(new Item("3'x3' White Walk Gate", 51.00, "94561", ItemType.Material));
        stockwhitefencelist.add(new Item("5'x8' White Panel", 67.00, "94492", ItemType.Material));
        stockwhitefencelist.add(new Item("5'x8' White HD Panel", 82.00, "94521", ItemType.Material));
        stockwhitefencelist.add(new Item("5' White Walk Gate", 70.00, "94992", ItemType.Material));
        stockwhitefencelist.add(new Item("5' White HD Walk Gate", 87.00, "95075", ItemType.Material));
        stockwhitefencelist.add(new Item("78\" White Post", 19.98, "419167", ItemType.Material));
        stockwhitefencelist.add(new Item("60\" White Flange Post", 16.98, "419166", ItemType.Material));
        stockwhitefencelist.add(new Item("54\" White Post", 13.98, "419161", ItemType.Material));
        stockwhitefencelist.add(new Item("36\" White Flange Post", 10.98, "418575", ItemType.Material));
        stockwhitefencelist.add(new Item("White Brackets(4)", 10.58, "99214", ItemType.Material));
        stockwhitefencelist.add(new Item("White Gate Kit", 16, "91058", ItemType.Material));
        stockwhitefencelist.add(new Item("White SC Gate Kit", 25, "419194", ItemType.Material));
        stockwhitefencelist.add(new Item("80lb Concrete", 3.48, "10385", ItemType.Material));
        stockwhitegroup.setItems(stockwhitefencelist);
        return stockwhitegroup;


    }

    public ItemAssortment PseMetalFenceAssortment() {
        ItemAssortment Group = new ItemAssortment();
        Group.setName("PSE - Metal Fence");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Providence Select-3'", 23.5));
        list.add(new Item("Providence Select-4'", 27.59));
        list.add(new Item("Providence Select-5'", 29.9));
        list.add(new Item("Providence Select-6'", 34.91));
        list.add(new Item("Providence Select-3' Gate", 399.73));
        list.add(new Item("Providence Select-4' Gate", 434.73));
        list.add(new Item("Providence Select-5' Gate", 474.73));
        list.add(new Item("Providence Select-6' Gate", 531.73));
        list.add(new Item("Hudson Select-3'", 23.50));
        list.add(new Item("Hudson Select-3' Walk Gate", 399.73));
        list.add(new Item("Hudson Select-3' Walk Gate", 399.73));
        list.add(new Item("New Haven Select-3'", 25.5));
        list.add(new Item("New Haven Select-4'", 27.59));
        list.add(new Item("New Haven Select-4.5'", 28.25));
        list.add(new Item("New Haven Select-5'", 29.9));
        list.add(new Item("New Haven Select-6'", 34.91));
        list.add(new Item("New Haven Select-3' Gate", 399.73));
        list.add(new Item("New Haven Select-4' Gate", 434.73));
        list.add(new Item("New Haven Select-4.5' Gate", 453.73));
        list.add(new Item("New Haven Select-5' Gate", 474.73));
        list.add(new Item("New Haven Select-6' Gate", 531.73));
        list.add(new Item("Concord Select-4'", 27.59));
        list.add(new Item("Concord Select-4.5'", 28.25));
        list.add(new Item("Concord Select-5'", 29.9));
        list.add(new Item("Concord Select-4' Gate", 434.73));
        list.add(new Item("Concord Select-4.5' Gate", 453.73));
        list.add(new Item("Concord Select-5' Gate", 474.73));
        list.add(new Item("Easton Select-4'", 23.50));
        list.add(new Item("Easton Select-4' Gate", 399.73));
        list.add(new Item("Providence Premier-4'", 30.16));
        list.add(new Item("Providence Premier-5'", 33.03));
        list.add(new Item("Providence Premier-4' Gate", 497.73));
        list.add(new Item("Providence Premier-5'", 584.73));
        list.add(new Item("Concord Premier-4.5'", 32));
        list.add(new Item("Concord Premier-5'", 33));
        list.add(new Item("Concord Premier-4.5' Gate", 542.73));
        list.add(new Item("Concord Premier-5' Gate", 584.73));
        list.add(new Item("Easton Premier-4'", 29.50));
        list.add(new Item("Easton Premier-4' Gate", 482.73));
        list.add(new Item("Majestic-4'", 39.21));
        list.add(new Item("Majestic-4.5'", 42.95));
        list.add(new Item("Majestic-5'", 40.99));
        list.add(new Item("Majestic-6'", 43.99));
        list.add(new Item("Majestic-4' Gate", 463.73));
        list.add(new Item("Majestic-4.5' Gate", 484.73));
        list.add(new Item("Majestic-5' Gate", 493.73));
        list.add(new Item("Majestic-6' Gate", 493.73));
        list.add(new Item("Classic-4'", 39.21));
        list.add(new Item("Classic-5'", 42.99));
        list.add(new Item("Classic-6'", 45.99));
        list.add(new Item("Classic-4' Gate", 475.73));
        list.add(new Item("Classic-5' Gate", 493.73));
        list.add(new Item("Classic-6' Gate", 513.73));
        list.add(new Item("Labor-Removal Existing Fence", 3, 2, "73945"));
        list.add(new Item("Labor-Fence Line Clearing", 3, 2, "73706"));
        list.add(new Item("Labor-Punch Thru Concrete", 50, 40, "68221"));
        list.add(new Item("Labor-Install Gate Opener", 200, 150, "333442"));
        list.add(new Item("Labor-Mileage", 2, 2, "154376"));
        list.add(new Item("Labor-Custom Work", 1, 1, "228185"));
        Group.setItems(list);
        return Group;
    }

    

    public ItemAssortment MetalFenceLaborAssortment(){
        ItemAssortment laborgroup = new ItemAssortment();
        laborgroup.setName("Labor - Metal Fence");
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("Labor-Decorative Metal(Lf)", 8, 6.1, "228142"));
        list.add(new Item("Labor-Walk Gate(Ea)", 56.25, 45, "228171"));
        list.add(new Item("Labor-Drive Gate(Ea)", 106.25, 85.20, "228177"));
        list.add(new Item("Labor-Removal Existing Fence", 3, 2, "73945"));
        list.add(new Item("Labor-Fence Line Clearing", 3, 2, "73706"));
        list.add(new Item("Labor-Punch Thru Concrete", 50, 40, "68221"));
        list.add(new Item("Labor-Install Gate Opener", 200, 150, "333442"));
        list.add(new Item("Labor-Mileage", 2, 2, "154376"));
        list.add(new Item("Labor-Minimum Labor", 400, 300, "41024"));
        list.add(new Item("Labor-Custom Work", 1, 1, "228185"));
        laborgroup.setItems(list);
        return laborgroup;
    }


	
	@Override
	public List<ItemAssortment> getProjectAssortments() {
		List<ItemAssortment> list = new ArrayList<ItemAssortment>();
		
		list.add(this.PseMetalFenceAssortment());
		list.add(this.StockBlackMetalFenceAssortment());
		list.add(this.StockWhiteMetalFenceAssortment());
		list.add(this.MetalFenceLaborAssortment());
		return list;
	}

}
