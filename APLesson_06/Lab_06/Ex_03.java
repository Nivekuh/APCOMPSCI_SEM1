import java.util.Scanner;

public class Ex_03{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = kb.next();
		
		for(int i = str.length(); i > 0; i--){
			System.out.println(str.substring(0, i));
		}
	}
}