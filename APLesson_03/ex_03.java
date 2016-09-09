import java.util.Scanner;

public class ex_03{
	public static void main(String[]args){
		Scanner bananaScale = new Scanner(System.in);
		double avgBanana = 7.5;
		
		System.out.println("How tall are you (in inches)?");
		double height = bananaScale.nextDouble();
		
		System.out.println("You are approximately " + height/avgBanana + " bananas tall.");
	}
}