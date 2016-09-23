import java.util.Scanner;

public class Ex_03{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		Ex_03 loan = new Ex_03();
		
		System.out.println("What is your interest rate (as a decimal)?");
		double interest = kb.nextDouble();
		
		System.out.println("What is your principal?");
		double principal = kb.nextDouble();
		
		System.out.println("How many times is the loan coumpounded per year?");
		double coumpoundRate = kb.nextDouble();
		
		System.out.println("What is the life of the loan (in years)?");
		double time = kb.nextDouble();
		
		System.out.printf("Your total monthly payment is %.2f", loan.totalCost(interest,principal,coumpoundRate,time)/(12*time));
	}
	
	public double totalCost(double r, double p, double n, double t){
		return p*Math.pow(1+(r/n),n*t);
	}
}