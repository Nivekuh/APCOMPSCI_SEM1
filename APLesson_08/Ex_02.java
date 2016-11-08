import java.util.Scanner;

public class Ex_02{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter three words.");
		System.out.println(makeCenter(kb.next()) + "\n" + makeCenter(kb.next()) + "\n" + makeCenter(kb.next()));
	}
	
	public static String makeCenter(String word){
		if(word.length() >= 20)
			return word;
		
		return makeCenter(" " + word + " ");
	}
}