import java.util.ArrayList;

public class Ex_01{
	public static void main(String[]args){
		int[] arrNums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> listNums = new ArrayList<Integer>();
		
		for(int num : arrNums){
			if(isComposite(num))
				listNums.add(num);
		}
		
		System.out.println(listNums);
	}
	
	public static Boolean isComposite(int n){
		for(int i = 2; i <= Math.pow(n, .5); i++){
			if(n % i == 0)
				return true;
		}
		
		return false;
	}
}