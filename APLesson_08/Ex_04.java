import java.util.Scanner;

public class Ex_04{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word.");
		tree(kb.next(),1);
	}
	
	public static void tree(String word, int start){
		if(start <= word.length()){
			System.out.printf("%20s\n",word.substring(0,start));
			start++;
			tree(word,start);
		}
	}
}