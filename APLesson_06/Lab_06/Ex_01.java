import java.util.Scanner;

public class Ex_01{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your string?");
		String str = kb.next();
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str);
		}
	}
}