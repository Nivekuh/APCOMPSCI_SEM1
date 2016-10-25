import java.util.Scanner;

public class Ex_06{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = kb.next();
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.substring(i));
		}
	}
}