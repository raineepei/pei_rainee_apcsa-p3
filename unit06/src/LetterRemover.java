//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' '); 
		//call set
	}

	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
		removeLetters();
	}
	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned="";
		
		for (int i = 0; i < sentence.length() - 1; i++) {
			if (sentence.charAt(i) != lookFor) {
			cleaned += sentence.charAt(i);
		}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}