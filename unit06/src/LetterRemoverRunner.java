//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test.toString());
		
		LetterRemover test1 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test1.toString());
		
		LetterRemover test2 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test2.toString());
		
		LetterRemover test3 = new LetterRemover("abababababa", 'b');
		System.out.println(test3.toString());
		
		//add test cases		
											
	}
}