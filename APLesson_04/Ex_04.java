import java.util.Scanner;

public class Ex_04{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		Ex_04 box = new Ex_04();
		
		System.out.println("What is the object's height (in inches)?");
		double h = kb.nextDouble();
		
		System.out.println("What is the object's length (in inches)?");
		double l = kb.nextDouble();
		
		System.out.println("What is the object's width (in inches)?");
		double w = kb.nextDouble();
		
		System.out.println("The volume of your object in cubic feet is " + box.calcVol(h,l,w));
	}
	
	public double calcVol(double h, double l, double w){
		return h*l*w/1728;
	}
}