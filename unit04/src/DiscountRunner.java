//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Rainee Pei 
//Date - 02/06/19
//Class - APCSA
//Lab  - Discount

import static java.lang.System.*;

import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.print("Bill after discount :: " + Discount.getDiscountedBill(amt));
		

	}
}