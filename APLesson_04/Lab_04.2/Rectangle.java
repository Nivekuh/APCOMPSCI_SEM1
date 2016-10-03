import java.util.Scanner;

public class Rectangle{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your rectangle's length (ft)?");
		length = kb.nextDouble();
		
		System.out.println("What is your rectangle's width (ft)?");
		width = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim(){
		perimeter = 2*(length+width);
	}
	
	public static void print(){
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}