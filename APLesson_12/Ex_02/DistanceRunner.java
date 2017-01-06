import java.util.Scanner;

public class DistanceRunner{
	public static void main(String[]args){
		Distance dist = new Distance();
		
		while(true){
			dist.setParams(prompt("x1"), prompt("y1"), prompt("x2"), prompt("y2"));
			System.out.println("Distance = " + dist.getDistance() + "\n");
		}
	}
	
	public static double prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is " + prompt + "?");
		return kb.nextDouble();
	}
}