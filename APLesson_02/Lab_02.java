public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 1;
		int b = 2;
		int product = a*b;
		
		System.out.println(a + " multiplied by " + b + " is " + product);
		
		String name = "Kevin Hu";
		String address = "123 Street Road";
		String city = "San Diego";
		int zip = 92130;
		
		System.out.println(name + "\n" + address + "\n" + city + ", " + zip);
		
		int length = 1;
		int width = 2;
		int height = 3;
		int sArea = 2*length*width + 2*(length+width)*height;
		
		System.out.println("The surface area of your rectangle is " + sArea);
	}
}