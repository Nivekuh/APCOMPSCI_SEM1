/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck1 = new Deck(new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}, new String[]{"Hearts", "Spades", "Diamonds", "Clubs"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1});
		
		System.out.println(deck1);
		
		deck1.shuffle();
		System.out.println(deck1);
	}
}
