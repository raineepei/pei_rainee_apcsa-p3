/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card cardOne = new Card("five", "hearts", 8);
		System.out.println(cardOne);
		
		Card cardTwo = new Card("king", "spades", 12);
		System.out.println(cardTwo);
		
		Card cardThree = new Card("eight", "clubs", 5);
		System.out.println(cardThree);
		
		Card cardFour = new Card("eight", "clubs", 5);
		System.out.println(cardFour);
		
		System.out.println(cardOne.matches(cardThree));
		System.out.println(cardThree.matches(cardFour));
	}
}
