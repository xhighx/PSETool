package com.xhighx.psetool.model;

import java.util.ArrayList;

/**
 * Created by James on 2/16/14.
 */
public class Assortment extends ArrayList<Item> {
    private String name;
    private int id;

    public Assortment(String name) {
        this.name = name;
    }
}
