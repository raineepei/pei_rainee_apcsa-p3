//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public String getWord()
	{
		return word;
	}

	public int compareTo( Word rhs )
	{		
		if (rhs.getWord().length() != word.length()) 
		{
			if (rhs.getWord().length() < word.length())
			{
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			char[] rhsArray = rhs.getWord().toCharArray();
			char[] wordArray = word.toCharArray();
			for (int i = 0; i < rhsArray.length; i++)
			{
				if (rhsArray[i] < wordArray[i]) 
				{
					return 1;
				}
				else if (rhsArray[i] > wordArray[i])
				{
					return -1;
				}
			}
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}