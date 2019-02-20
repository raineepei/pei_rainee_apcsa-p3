//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(496);
		
		test.setNum(496);
		test.isPerfect();
		System.out.println(test.toString());
		
		test.setNum(45);
		test.isPerfect();
		System.out.println(test.toString());
		
		test.setNum(6);
		test.isPerfect();
		System.out.println(test.toString());
		
		test.setNum(14);
		test.isPerfect();
		System.out.println(test.toString());
		
		test.setNum(8128);
		test.isPerfect();
		System.out.println(test.toString());
		
		//add test cases
																
	}
}