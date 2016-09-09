import java.util.Scanner;

public class ex_02{
	public static void main(String[]args){
		Scanner BMI = new Scanner(System.in);
		
		System.out.println("What is your height (in inches)?");
		double height = BMI.nextDouble();
		
		System.out.println("What is your weight (in pounds)?");
		double weight = BMI.nextDouble();
		
		double BMIResults = weight*703/(height*height);
		
		System.out.println("Your BMI is " + BMIResults + ". Congrats. You're almost as fat as your mom.");
	}
}