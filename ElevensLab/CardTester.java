/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("5", "Hearts", 5);
		Card card2 = new Card("3", "Spades", 5);
		Card card3 = new Card("5", "Hearts", 5);
		
		System.out.println(card1);
		System.out.println("Card 1 and 3 are equal: " + (card1.matches(card3) ? "true" : "false"));
	}
}
