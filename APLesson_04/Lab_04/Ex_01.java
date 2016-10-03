import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Ex_01 receipt = new Ex_01();
		
		System.out.println("Please enter item 1:");
		String item1 = input.nextLine();
		System.out.println("Please enter the price:");
		double price1 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = input.nextLine();
		System.out.println("Please enter the price:");
		double price2 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = input.nextLine();
		System.out.println("Please enter the price:");
		double price3 = input.nextDouble();
		
		receipt.printReceipt(item1, price1, item2, price2, item3, price3);
	}
	
	public void printReceipt(String item1, double price1, String item2, double price2, String item3, double price3)
	{
		Ex_01 receipt = new Ex_01();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.printReceiptLine(item1, price1);
		receipt.printReceiptLine(item2, price2);
		receipt.printReceiptLine(item3, price3);
		System.out.println("");
		receipt.printReceiptLine("Subtotal:", price1+price2+price3);
		receipt.printReceiptLine("Tax:", (price1+price2+price3)*.07);
		receipt.printReceiptLine("Total:", (price1+price2+price3)*1.07);
		System.out.println("__________________________________________\n* Thank you for your support *");
	}
	
	public void printReceiptLine(String item, double price)
	{
		System.out.printf("* %15s ........\t %5.2f\n", item, price);
	}
}