//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rainee Pei
//Date - 02/16/19
//Class - APCSA
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(in); 
		
		out.print("Enter a whole number :: ");
		int num = keyboard.nextInt();
		
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		//add in more test cases
	}
}