public class Ex_05{
	static int[]arr;//I'm a pirate!
	
	public static void main(String[]args){
		arr = new int[10];
		fillArray();
		
		System.out.print("For the following numbers... ");
		printArray();
		System.out.print("\nThere are " + getOdds() + " odd numbers.");
	}
	
	public static void fillArray(){
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random()*10)+1;
	}
	
	public static void printArray(){
		for(int num : arr)
			System.out.print(num + " ");
	}
	
	public static int getOdds(){
		int odds = 0;
		
		for(int num : arr){
			if(num % 2 == 1)
				odds++;
		}
		
		return odds;
	}
}