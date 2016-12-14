import java.util.Scanner;

public class Ex_06{
	static int maxHealth = 6;
	static int health = maxHealth;
	
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		String in = "";
		
		printHealth();
		while(!in.toLowerCase().equals("q") && health > 0){
			System.out.print("Press enter to continue, 'Q' to quit: ");
			in = kb.nextLine();
			
			updateHealth((int)(Math.random()*2 + 1), (int)(Math.random()*6 + 1));
			printHealth();
		}
		System.out.println("You died!");
	}
	
	public static void printHealth(){
		String out = "Health:\t";
		for(int i = 0; i < maxHealth; i++){
			if(i < health)
				out += "@ ";
			else
				out += "[]";
		}
		
		System.out.println(out);
	}
	
	public static void updateHealth(int rand, int amt){
		if(rand == 1){
			health -= amt;
			System.out.println("Taking " + amt + " damage");
		}
		else{
			health = Math.min(maxHealth, health + amt);
			System.out.println("Power up!");
		}
		System.out.println("\n");
	}
}