import java.util.Scanner;

public class Ex_04{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a sentence.");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sent){
		while(sent.toLowerCase().indexOf("a") != -1){
			int index = sent.toLowerCase().indexOf("a");
			sent = sent.substring(0,index) + "@" + sent.substring(index+1);
		}
		
		return sent;
	}
}