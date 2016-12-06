public class Ex_01{
	public static void main(String[]args){
		int[][] nums = new int[4][4];
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++){
				nums[i][j] = (int)(Math.random()*10);
				
				System.out.print(nums[i][j] + " ");
			}
			System.out.println("");
		}
	}
}