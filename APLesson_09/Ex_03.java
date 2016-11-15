public class Ex_03{
	public static void main(String[]args){
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)Math.floor(Math.random()*100)+1;
		}
		
		System.out.println("Numbers...");
		for(int num : nums){
			System.out.print(num + " ");
		}
		
		System.out.println("\nThe average of the above numbers is " + average(nums));
	}
	
	public static double average(int[]nums){
		int sum = 0;
		for(int num : nums){
			sum += num;
		}
		
		return (double)sum/nums.length;
	}
}