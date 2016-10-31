import java.util.Scanner;

public class Ex_01{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer.");
		int number = kb.nextInt();
		
		System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
	}
	
	public static int sumDigits(int num){
		int sum = 0;
		
		while(num > 0){
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}