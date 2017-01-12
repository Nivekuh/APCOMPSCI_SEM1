import java.util.Scanner;

public class CarDriver{
	public static void main(String[]args){
		Car car = new Car(prompt("paint"), prompt("interior"), prompt("engine"), prompt("tires"));
		
		System.out.println("Your vehicle is ready...\nPaint:\t" + car.getPaint() + "\nInterior:\t" + car.getInterior()+ "\nEngine:\t" + car.getEngine() + "\nTires:\t" + car.getTires());
	}
	
	public static String prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the " + prompt + "?");
		return kb.next();
	}
}