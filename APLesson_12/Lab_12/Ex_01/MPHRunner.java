import java.util.Scanner;

public class MPHRunner{
	public static void main(String[]args){
		MilesPerHour mph = new MilesPerHour();
		
		while(true){
			mph.setParams(prompt("distance"), prompt("hours"), prompt("minutes"));
			System.out.println(mph.d + " miles in " + (mph.h + mph.m / 60) + " hours = " + mph.getMPH() + " mph\n");
		}
	}
	
	public static double prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is " + prompt + "?");
		return kb.nextDouble();
	}
}