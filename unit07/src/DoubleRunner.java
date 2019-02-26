//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		BiggestDouble run1 = new BiggestDouble(14.51,6.17,71.8,1.0);
		System.out.println(run1);
		System.out.println("biggest = " + run1.getBiggest() + "\n");
		
		BiggestDouble run2 = new BiggestDouble(41.15,816.7,17.8,19.0);
		System.out.println(run2);
		System.out.println("biggest = " + run2.getBiggest() + "\n");
		
		BiggestDouble run3 = new BiggestDouble(884.5,16.7,7.8,9.0);
		System.out.println(run3);
		System.out.println("biggest = " + run3.getBiggest() + "\n");

		//add more test cases
				
	}
}