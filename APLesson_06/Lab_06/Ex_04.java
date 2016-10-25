import java.util.Scanner;

public class Ex_04{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = kb.nextInt();
		
		System.out.println("Enter the table size");
		int size /*I like to think it doesn't matter*/ = kb.nextInt();
		
		for(int i = 1; i <= size; i++){
			System.out.printf("%d\t%d\n", i, i*num);
		}
	}
}