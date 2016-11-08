import java.util.Scanner;

public class Ex_03{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer.");
		System.out.println(luck(kb.nextInt()));
	}
	
	public static int luck(int num){
		if(num > 0){
			if(num % 10 == 7)
				return 1 + luck(num/10);
			
			return luck(num/10);
		}
		return 0;
	}
}