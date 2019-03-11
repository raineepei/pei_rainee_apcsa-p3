/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		Deck deck1 = new Deck(new String[] {"5", "jack", "king"}, 
		new String[] {"spades", "diamonds"},
		new int[] {5, 7, 13});
		
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		Deck deck2 = new Deck(new String[] {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"}, 
				new String[] {"spades", "hearts", "diamonds", "clubs"},
				new int[] {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
		
		int n = deck2.size();
		for (int i = 0; i < n; i++) {
			deck2.shuffle();
			deck2.deal();
			System.out.println(deck2);
		}
}
}
