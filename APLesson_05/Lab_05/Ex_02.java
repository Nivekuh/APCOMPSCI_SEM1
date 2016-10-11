import java.util.Scanner;

public class Ex_02{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		double total = 0;
		String[] items = {"","","",""};
		double[] prices = {0,0,0,0};
		
		for(int i = 0; i < 4; i++){
			System.out.println("What is item " + (i+1) + "?");
			items[i] = kb.nextLine();
			
			System.out.println("What is the price?");
			prices[i] = kb.nextDouble();
			kb.nextLine();
			
			total += prices[i];
		}
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		for(int i = 0; i < 4; i++){
			format(items[i],prices[i]);
		}
		System.out.println("");
		format("Subtotal:",total);
		format("Discount:",1 - discount(total)/total);
		format("Total:",discount(total));
		System.out.println("__________________________________________\n* Thank you for your support *");
	}
	
	public static void format(String item, double price){
		System.out.printf("* %15s ........\t %5.2f\n", item, price);
	}
	
	public static double discount(double total){
		if(total >= 2000)
			return total*.85;
		return total;
	}
}