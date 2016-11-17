import java.util.Scanner;

public class Ex_07{
	static String[]words;//I'm no longer a pirate :(
	
	public static void main(String[]args){
		words = new String[5];
		fillArray();
		
		System.out.print("For the words... ");
		printArray();
		System.out.print("\n" + hasZs() + "contain(s) the letter z");
	}
	
	public static void fillArray(){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 5 words.");
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	
	public static void printArray(){
		for(String word : words)
			System.out.print(word + " ");
	}
	
	public static String hasZs(){
		String zs = "No words ";
		
		for(String word : words){
			if(word.toLowerCase().indexOf("z") != -1){
				if(zs.equals("No words "))
					zs = "Only ";
				zs += word + " ";
			}
		}
		
		return zs;
	}
}