
public abstract class Item {

	
	 static int  itemQuantity=0;
	 double itemPrice;
	 double itemWeight;
	
	public Item(double price, double weight){
		if(price>=0)
		this.itemPrice= price;
		else 
			itemPrice=0;
		if(weight>=0)
		this.itemWeight= weight;
		else
			itemWeight =0;
			
		itemQuantity+=1;
		
	}
	public static int getItemQuantity(){
		
		return itemQuantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	
	public double getItemWeight() {
		return itemWeight;
	}
	
	public abstract boolean useItem();
	
		
	
	
}
