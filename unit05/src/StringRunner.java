//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Rainee Pei
//Date - 02/11/19
//Class - APCSA
//Lab  - Odd or Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a word :: ");
		String s = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven(s);
		test.isEven();
		System.out.print(test);
	}
}