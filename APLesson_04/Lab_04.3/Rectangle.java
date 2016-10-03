import java.util.Scanner;

public class Rectangle{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your rectangle's length (ft)?");
		double length = kb.nextDouble();
		
		System.out.println("What is your rectangle's width (ft)?");
		double width = kb.nextDouble();
		
		print(calcPerim(length, width));
	}
	
	public static double calcPerim(double length, double width){
		return 2*(length+width);
	}
	
	public static void print(double perimeter){
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}