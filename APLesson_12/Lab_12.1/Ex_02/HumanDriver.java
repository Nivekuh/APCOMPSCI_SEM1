import java.util.Scanner;

public class HumanDriver{
	public static void main(String[]args){
		Human person = new Human(prompt("hair"), prompt("eyes"), prompt("skin"));
		person.printInfo();
		
		System.out.println("\n Your Friend:");
		
		person.setHES("Black", "Brown", "Yellow");
		person.printInfo();
	}
	
	public static String prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your " + prompt + "?");
		return kb.next();
	}
}