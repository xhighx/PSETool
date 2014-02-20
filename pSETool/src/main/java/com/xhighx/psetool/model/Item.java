package com.xhighx.psetool.model;


public class Item{
	public static final double CONST_SALES_TAX = .0825;

	String name;
    String description;

    public Item(String name, double price, double cost, String id, ItemType itemType, String model) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.id = id;
        this.itemType = itemType;
        this.model = model;
    }

    public Item(String name, double price, double cost, String id, String model) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.id = id;
        this.model = model;
    }

    public Item(String name, double price, String id, String model) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.model = model;
    }


    String model;
    String tag;
    double price;
    double cost;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double discount;
    String id;
    int quantity;

    {
        quantity = 0;
        discount = 1;
        itemType = null;
        taxable = false;
    }

    boolean taxable=false;
    ItemType itemType;

    public String getModel() {return model;}
    public void setModel(String model) { this.model = model; }
    public enum ItemType{
    	PSE(), Material(), Labor();
    }
    
    @Override
    public String toString() {
        return name;
    }
    public Item(String name) {
        super();
        this.name = name;
    }
    public Item(String name, double price
    ) {
        super();
        this.name = name;
        this.price = price;
    }
    public Item(String name, double price,
                double cost) {
        super();
        this.name = name;
        this.price = price;
        this.cost = cost;
    }
    public Item(String name, double price, double cost, String id) {
		super();
		this.name=name;
		this.price = price;
		this.cost = cost;
		this.id =id;
    }
    public Item(String name, double price, ItemType itemType) {
		super();
		this.name=name;
		this.price = price;
		this.itemType = itemType;
    }
    public Item(String name, double price, String id) {
		super();
		this.name=name;
		this.price = price;
		this.id =id;
    }
	public Item(String name, double price, String id, ItemType itemType) {
		super();
		this.name=name;
		this.price = price;
		this.id =id;
		this.itemType = itemType;
    }
	public Item(String name, double price, double cost, String id, ItemType itemType) {
		super();
		this.name=name;
		this.price = price;
		this.cost = cost;
		this.id =id;
		this.itemType = itemType;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
    	this.tag = tag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    public double getDiscountPrice(){
        return getPrice() * getDiscount();
    }
	
	public double getSubtotal(){
		double subtotal = 0;
		subtotal = getDiscountPrice() * getQuantity();
		return subtotal;		
	}
	public double getTotal(){
		double total = 0;
		total = getSubtotal() + getSalesTax();
		return total;
	}
	public double getSalesTax(){
		double tax = 0;
		if(isTaxable()){
			tax = getSubtotal() * CONST_SALES_TAX;
		}
		return tax;
	}
    public double getMargin(){
        double mMargin = 0;
        mMargin = (getDiscountPrice()-getCost())/getDiscountPrice();
        return mMargin;
    }


	public double getTotalCost(){
		return getCost() * getQuantity();
	}
	public boolean isTaxable(){
		taxable = false;
		if(getItemType() == ItemType.Material && getItemType() != null){
			taxable = true;
		}
		return taxable;
	}

	

}
