import java.util.Scanner;

public class Ex_01{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a sentence.");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String sent){
		int index = sent.indexOf(" ");
		if(index == -1)
			return sent;
		
		return replace(sent.substring(0,index) + "_" + sent.substring(index+1));
	}
}