package com.xhighx.psetool.model;



public class Cart extends ItemAssortment{
    public double getmDiscount() {
        return mDiscount;
    }

    public void setmDiscount(double mDiscount) {
        this.mDiscount = mDiscount;
    }

    private double mDiscount=1;
	public boolean contains(Item item){
		
		if(getItems().contains(item)){
			return true;
		}
		
		return false;
		
	}
	
	public Cart() {
		super("Cart");
	}
		
	public int getItemCount(){
		return  getItems().size();
	}
	
	

	public double getCartSubtotal(){
		
		double subtotal = 0;
		for(int i = 0; i < getItemCount(); i++ ){
			subtotal += getItems().get(i).getSubtotal();
		}
		return subtotal;
	}
	
	public double getCartTax(){
		double taxtotal = 0;
		for(int i = 0; i < getItemCount(); i++ ){
			taxtotal += getItems().get(i).getSalesTax();
		}
		return taxtotal;
	}
	
	public double getCartTotal(){
		double carttotal = 0;
		for(int i = 0; i < getItemCount(); i++ ){
			carttotal += getItems().get(i).getTotal();
		}
		return carttotal;
	}
	
	

	
}
