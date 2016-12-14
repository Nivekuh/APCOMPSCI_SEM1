public class Ex_03{
	public static void main(String[]args){
		String[][] xo = new String[4][4];
		
		for(int i = 0; i < xo.length; i++){
			for(int j = 0; j < xo[i].length; j++){
				xo[i][j] = ((int)(Math.random()*2) == 1) ? "x" : "o";
				
				System.out.print(xo[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}