import java.util.Scanner;

public class Cube{
	static double side;
	static double sa;
	
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the cube's side length?");
		side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf(){
		sa = 6*Math.pow(side, 2);
	}
	
	public static void print(){
		System.out.printf("The surface area of a cube with side length of %.5f is %.5f", side, sa);
	}
}