public class Ex_01{
	public static void main(String[]args){
		boolean rigged = true; //Set false if you actually want a fair game
		
		int player = (int)(Math.random()*6 + 1);
		int computer = (int)(Math.random()*6 + 1);
		
		if(rigged){
			int a = player;
			int b = computer;
			
			computer = Math.max(a,b);
			player = Math.min(a,b);
		}
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + rollDice(player, computer));
	}
	
	public static String rollDice(int player, int computer){
		if(player > computer)
			return "you";
		if(computer > player)
			return "computer";
		return "nobody";
	}
}