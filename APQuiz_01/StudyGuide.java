public class StudyGuide{
	public static void main(String[]args){
		//Question_01
		int num = 45;
		System.out.println("IronMan has " + num + " kinds of weapons in his suit");
		
		//Question_02
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres + " once said, \"" + quote +  "\"");
		
		//Question_03
		int h = 45;
		int w = 64;
		System.out.println("The area of your rectangle is..." + h*w);
		
		//Question_04
		/*
		System.out.println("How many pieces of pizza do you want? ");
		int slices = kb.nextInt();
		System.out.println(slices + "slices, coming right up!");
		
		Produces an error because "seven" is a String, and variable "slices" is an int.
		*/
		
		//Question_05
		//C
		
		//Question_06
		//A
		
		//Question_07
		/*
		System.out.println("R. Kelly said "I believe I can fly!"");
		
		Produces an error because the quotations around "I belive I can fly" end the String.
		You can fiz this by putting a backslash before the two quotation marks.
		*/
		
		//Question_08
		System.out.println("This one goes on top\nThis one goes on bottom");
		
		//Question_09
		System.out.println("a  b  c\nd  e  f\ng  h  i");
		
		//Question_10
		/*The program produces 0 because all the datatypes are integers, which cannot have demical values.
		Since the gpa he calculates comes out to be a decimal less than 1, because it's an integer, it just cuts off the decimal and adopts the value of 0.
		You can fiz this by using doubles instead of ints.
		*/
		
		int a = 23;
		int b = 41;
		int c = 57;
		
		double d = (a+b+c)/4;
		
		System.out.println(d);
	}
}