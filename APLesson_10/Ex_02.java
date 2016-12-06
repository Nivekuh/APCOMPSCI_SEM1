import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_02{
	//Notes: negative numbers, do in parse. Parenthesis check, syntax check.
	
	static String[] operators = {"(","^","/","*","-","+"}; //Add operators in order of operations
	static String[][] syntax = {{"e(","(e)*("}};
	static ArrayList<String> operatorsArr = new ArrayList<String>(Arrays.asList(operators));
	static String nums = ".0123456789";
	
	public static void main(String[]args){
		System.out.println(doEquation(parseEq(prompt())));
		main(args);
	}
	
	public static String prompt(){
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter an equation");

		return kb.nextLine();
	}
	
	public static ArrayList<String> parseEq(String in){
		ArrayList<String> eq = new ArrayList<String>();
		ArrayList<String> inArr = new ArrayList<String>();
		if(operatorsArr.size() == operators.length)
			operatorsArr.add(")");

		//Remove invalid characters
		for(int i = 0; i < in.length(); i++){
			String ch = String.valueOf(in.charAt(i));

			if(ch.equals("(") && i > 0 && (nums.indexOf(in.charAt(i - 1)) != -1 || String.valueOf(in.charAt(i - 1)).equals(")")))
				inArr.add("*");
			
			if(!ch.equals(" ")){
				if(operatorsArr.contains(ch) || nums.indexOf(ch) != -1){
					inArr.add(ch);
				}
				else{
					System.out.println("Invalid character: " + ch);
					return parseEq(prompt());
				}
			}
		}
		//Finished removing invalid characters


		//Group values
		String current = "";
		for(int i = 0; i < inArr.size(); i++){
			String ch = inArr.get(i);

			if(operatorsArr.contains(ch)){
				if(!current.equals(""))
					eq.add(current);
				eq.add(ch);
				current = "";
			}
			else
				current += ch;
		}
		if(!current.equals(""))
			eq.add(current);
		//Finished grouping

		return eq;
	}
	
	public static ArrayList<String> doEquation(ArrayList<String> eq){	
		for(String operator : operators){
			int index = eq.indexOf(operator);
			
			if(index != -1){
				double result = 0;
				int range = 0; //Inclusive
				
				switch(operator){
					case "(":
						int pCount = 1;
					
						for(int i = index + 1; i < eq.size(); i++){
							if(eq.get(i).equals(")"))
								pCount--;
							else if(eq.get(i).equals("("))
								pCount++;
						
							if(pCount == 0){
								range = i - index;
								break;
							}
						}
					
						result = Double.parseDouble(doEquation(new ArrayList<String>(eq.subList(index + 1, index + range))).get(0));
						break;
					case "^":
						index--;
						range = 2;
						if(eq.get(index+2).equals("-")){
							range++;
							result = Math.pow(Double.parseDouble(eq.get(index)),-1*Double.parseDouble(eq.get(index+3)));
							break;
						}
						result = Math.pow(Double.parseDouble(eq.get(index)),Double.parseDouble(eq.get(index+2)));
						break;
					case "*":
						index--;
						range = 2;
						result = Double.parseDouble(eq.get(index)) * Double.parseDouble(eq.get(index+2));
						break;
					case "/":
						result = Math.pow(Double.parseDouble(eq.get(index+1)), -1);
						eq.add(index, "*");
						index++;
						range = 1;
						break;
					case "+":
						if(index == 0 || operatorsArr.contains(eq.get(index - 1))){
							range = 1;
							result = 0 + Double.parseDouble(eq.get(index+1));
						}
						else{
							index--;
							range = 2;
							result = Double.parseDouble(eq.get(index)) + Double.parseDouble(eq.get(index+2));
						}
						break;
					case "-":
						result = -1*Double.parseDouble(eq.get(index+1));
						eq.add(index, "+");
						index++;
						range = 1;
						break;
				}
				for(int i = 0; i <= range; i++)
					eq.remove(index);
				eq.add(index, Double.toString(result));
				
				return doEquation(eq);
			}
		}
		
		return eq;
	}
}