package com.xhighx.psetool.model;

import java.util.ArrayList;


public class ItemAssortment {
    private String Name;
    private String Tag;
    private ArrayList<Item> Items;
    
    

    @Override
    public String toString() {
        return Name;
    }

    public ItemAssortment() {
        super();
        Items = new ArrayList<Item>();
    }
    
    public ItemAssortment(String name) {
        super();
        Name = name;
        Items = new ArrayList<Item>();
    }
    
    public ItemAssortment(ArrayList<Item> itemlist) {
        super();
        Items = itemlist;
    }
    
    public ItemAssortment(String name, ArrayList<Item> itemlist) {
        super();
        Name = name;
        Items = itemlist;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> items) {
        Items = items;
    }
    
    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    

}
