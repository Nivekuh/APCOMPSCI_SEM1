import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Ex_02 card = new Ex_02();
		
		System.out.println("Enter your first name:");
		String firstName = kb.next();
		
		System.out.println("Enter your last name:");
		String lastName = kb.next();
		
		System.out.println("Enter your title:");
		String title = kb.next();
		
		System.out.println("Enter the school site:");
		kb.nextLine();
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.next();
		
		System.out.println("What is your subject?");
		String subject = kb.next();
		
		System.out.println("*******************************************");
		card.printIDLine(school, year);
		card.printIDLine(firstName, lastName);
		card.printIDLine(title, subject);
		System.out.println("*******************************************");
	}
	
	public void printIDLine(String item1, String item2)
	{
		System.out.printf("*  %15s  %20s  *\n", item1, item2);
	}
}