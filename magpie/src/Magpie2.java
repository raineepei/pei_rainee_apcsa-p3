/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		String statementTrim = statement.trim();
	
		if (statementTrim.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "dog") >= 0 
				|| findKeyword(statement, "cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (findKeyword(statement, "Mauro") >= 0)
		{
			response = "Your teacher is a very nice person.";
		}
		else if (findKeyword(statement, "CCA") >= 0
				|| findKeyword(statement, "TP") >= 0)
		{
			response = "Tell me more about your school.";
		}
		else if (findKeyword(statement, "draw") >= 0
				|| findKeyword(statement, "play") >= 0
				|| findKeyword(statement, "read") >= 0)
		{
			response = "Tell me more about your hobbies.";
		}
		else if (findKeyword(statement, "pizza") >= 0
				|| findKeyword(statement, "sushi") >= 0
				|| findKeyword(statement, "pasta") >= 0)
		{
			response = "I like to eat that too.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		while (psn >= 0) {
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))){
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return -1;
	}
	
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}
	
	
	
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Wow, how fascinating!";
		}
		else if (whichResponse == 5)
		{
			response = "That's so cool!";
		}
		return response;
	}
}
