import java.util.Scanner;

public class Cube{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the cube's side length?");
		double side = kb.nextDouble();
		
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double side){
		return 6*Math.pow(side, 2);
	}
	
	public static void print(double side, double sa){
		System.out.printf("The surface area of a cube with side length of %.5f is %.5f", side, sa);
	}
}