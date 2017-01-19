public class Inventory{
	private String manufacture, name, category;
	private double price;
	private int ID;
	
	public Inventory(String manu, String nm){
		manufacture = manu;
		name = nm;
		category = "Undefined";
		ID = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Inventory(String manu, String nm, String cat, double cost){
	    manufacture = manu;
		name = nm;
		category = cat;
		price = cost;
		ID = (int)(Math.random() * 1000000000) + 1;
	}
	
	public String toString(){
	    return "Item Info...\nItem name: " + name +
							   "\nManufacturer: " + manufacture +
							   "\nCategory: " + category +
							   "\nPrice: " + price +
							   "\nID#: " + ID;
	}
}