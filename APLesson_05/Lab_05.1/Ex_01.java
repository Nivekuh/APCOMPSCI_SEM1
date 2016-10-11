import java.util.Scanner;

public class Ex_01{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int classes = 7;
		double total = 0;
		
		for(int i = 0; i < classes; i++){
			System.out.println("What is your grade for class #" + (i+1) + "?");
			total += calcPoints(kb.next());
		}
		
		System.out.println("Your GPA is " + total/classes);
	}
	
	public static double calcPoints(String grade){
		grade = grade.toLowerCase();
		
		if(grade.equals("a"))
			return 4;
		else if(grade.equals("b"))
			return 3;
		else if(grade.equals("c"))
			return 2;
		else if(grade.equals("d"))
			return 1;
		else
			return 0;
	}
}