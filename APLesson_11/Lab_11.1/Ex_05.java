import java.util.Scanner;

public class Ex_05{
	static int bulletCount = 96;
	static int clipSize = 16;
	static int shotCount = 0;
	
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		printClip();
		
		while(bulletCount + shotCount > 0){
			System.out.print("Action(R or S): ");
			switch(kb.next().toLowerCase()){
				case "r":
					reload();
					break;
				case "s":
					shoot();
					break;
				default:
					System.out.println("Please enter a valid action.");
					break;
			}
			System.out.println("\n");
			printClip();
		}
	}
	
	public static void printClip(){
		String out = "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i = 0; i < clipSize; i++){
			if(i < shotCount)
				out += "* ";
			else
				out += "[]";
		}
		
		System.out.println(out);
	}
	
	public static void reload(){
		int shotCount_o = shotCount;
		
		shotCount = Math.min(shotCount + bulletCount, clipSize);
		bulletCount -= shotCount - shotCount_o;
	}
	
	public static void shoot(){
		if(shotCount > 0){
			shotCount--;
			System.out.println("Boom! I love gun violence!");
		}
		else
			System.out.println("Please reload");
	}
}