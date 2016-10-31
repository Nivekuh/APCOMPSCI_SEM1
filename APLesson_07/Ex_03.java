import java.util.Scanner;

public class Ex_03{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer.");
		int number = kb.nextInt();
		
		System.out.println(number + " reversed is " + getReverse(number));
	}
	
	public static int getReverse(int num){
		int rev = 0;
		
		while(num > 0){
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		
		return rev;
	}
}