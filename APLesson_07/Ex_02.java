import java.util.Scanner;

public class Ex_02{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer.");
		int number = kb.nextInt();
		
		System.out.println("The average of the digits in " + number + " is " + avDigits(number));
	}
	
	public static double avDigits(int num){
		int digits = 0;
		double average = 0;
		
		while(num > 0){
			digits++;
			average += num % 10;
			num /= 10;
		}
		
		return average/digits;
	}
}