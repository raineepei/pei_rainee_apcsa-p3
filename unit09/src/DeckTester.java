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
		
		Deck deck2 = new Deck(new String[] {"10", "jack", "queen"}, 
				new String[] {"spades", "hearts", "diamonds"},
				new int[] {13, 12, 11});
		
		System.out.println(deck2);
		deck2.deal();
		deck2.deal();
		System.out.println(deck2);
		
		int temp = deck1.size();
		for (int i = 0; i < temp; i++) {
			deck2.deal();
		}
		System.out.println(deck1);
		}
}

