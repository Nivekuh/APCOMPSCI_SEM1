import java.util.Scanner;

public class Ex_06{
	static int attempts = 0;
	
	public static void main(String[]args){
		String user = "username";
		String pass = "password";
		
		if(!passCheck(user, pass))
			System.out.println("Too many attempts.");
	}
	
	public static Boolean passCheck(String user, String pass){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Username:");
		String userIn = kb.next().toLowerCase();
		
		System.out.println("Enter Password:");
		String passIn = kb.next();
		
		if(userIn.equals(user) && passIn.equals(pass)){
			System.out.println("You are granted access!");
			return true;
		}
		else if(userIn.equals(user))
			System.out.println("Your password is incorrect!");
		else if(passIn.equals(pass))
			System.out.println("Your username is incorrect!");
		else
			System.out.println("Your username and password are incorrect!");
		
		attempts++;
		if(attempts > 4)
			return false;
		
		return passCheck(user, pass);
	}
}