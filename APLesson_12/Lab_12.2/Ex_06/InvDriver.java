import java.util.Scanner;

public class InvDriver{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args){
		Inventory inv;
		
		System.out.println("Would you like to enter category and price information? (Y or N)");
		switch(kb.next().toLowerCase()){
			case "y":
				inv = new Inventory(prompt("manufacturer"), prompt("item name"), prompt("category"), Double.parseDouble(prompt("price")));
				break;
			default:
				inv = new Inventory(prompt("manufacturer"), prompt("item name"));
				break;
		}
		
		System.out.println("\n" + inv);
	}
	
	public static String prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the " + prompt + "?");
		return kb.next();
	}
}