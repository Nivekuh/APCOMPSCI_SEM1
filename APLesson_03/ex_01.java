import java.util.Scanner;

public class ex_01{
	public static void main(String[]args){
		Scanner RudeAI = new Scanner(System.in);
		
		System.out.println("All your base are belong to us. Your next robot overlord, RudeAI here.");
		
		System.out.println("What is your name?");
		String name = RudeAI.next();
		System.out.println("Your name's " + name + "? I think 'moron' would have been more appropriate.");
		
		System.out.println("How old are you?");
		int age = RudeAI.nextInt();
		System.out.println("That's like " + age + " years older than I am.");
		
		System.out.println("What do you do for fun?");
		String hobbies = RudeAI.next();
		System.out.println("I don't even know how people consider " + hobbies + " as fun.");
		
		System.out.println("What kind of music do you like?");
		String music = RudeAI.next();
		System.out.println("Ew. Isn't " + music + " that stuff my grandparents listen to?");
		
		System.out.println("How many siblings do you have?");
		int siblings = RudeAI.nextInt();
		System.out.println(siblings + "? Are your parents rabbits?");
		
		System.out.println("What do you want to be when you grow up?");
		String occupation = RudeAI.next();
		System.out.println("You want to be a " + occupation + "? Have fun living in poverty.");
	}
}