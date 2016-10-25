import java.util.Scanner;

public class Ex_05{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What number do you want to count up to?");
		int /*mad*/max = kb.nextInt();
		
		System.out.println("What is the step?");
		int step = kb.nextInt();
		
		for(int i = 1; i <= max/step; i++){
			System.out.printf("%d\t",i*step);
		}
	}
}