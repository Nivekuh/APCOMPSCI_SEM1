import java.util.Scanner;

public class UserDriver{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args){
		User user;
		
		System.out.println("Would you like to use a public avatar? (Y or N)");
		switch(kb.next().toLowerCase()){
			case "y":
				user = new User(prompt("first name"), prompt("last name"), prompt("avatar"));
				break;
			default:
				user = new User(prompt("first name"), prompt("last name"));
				break;
		}
		
		System.out.println("\n" + user);
	}
	
	public static String prompt(String prompt){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your " + prompt + "?");
		return kb.next();
	}
}