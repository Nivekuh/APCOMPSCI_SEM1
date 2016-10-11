import java.util.Scanner;

public class Ex_02{
	static double bmi = 0;
	static String condition;
	
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height (in inches)?");
		double height = kb.nextDouble();
		
		System.out.println("What is your weight (in pounds)?");
		double weight = kb.nextDouble();
		
		calcBMI(height, weight);
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition);
	}
	
	public static void calcBMI(double height, double weight){
		bmi = weight*703/(height*height);
		
		if(bmi < 18.5)
			condition = "Underweight";
		else if(bmi < 24.9)
			condition = "Normal";
		else if(bmi < 29.9)
			condition = "Overweight";
		else if(bmi < 34.9)
			condition = "Obese";
		else if(bmi < 39.9)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
	}
}