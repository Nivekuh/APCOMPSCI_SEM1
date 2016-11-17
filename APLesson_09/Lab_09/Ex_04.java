import java.util.Scanner;

public class Ex_04{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your starting number:");
		int a = kb.nextInt();
		
		System.out.println("Please enter your sequence size:");
		int[] seq = new int[kb.nextInt()];
		
		for(int i = 0; i < seq.length; i++){
			if(i < 2)
				seq[i] = a;
			else
				seq[i] = seq[i-1] + seq[i-2];
			System.out.print(seq[i] + " ");
		}
	}
}