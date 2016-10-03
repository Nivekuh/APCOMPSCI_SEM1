import java.util.Scanner;

public class Circle{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the radius?");
		double r = kb.nextDouble();
		
		print(r, calcArea(r));
	}
	
	public static double calcArea(double r){
		return Math.PI*Math.pow(r, 2);
	}
	
	public static void print(double r, double area){
		System.out.printf("The area of a circle with raidus %.5f is %.5f", r, area);
	}
}