//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		 StringEquality test = new StringEquality("abe", "ape");
		 test.checkEquality();
		 out.println(test);
		   
		 StringEquality test1 = new StringEquality("ABC", "CAB");
		 test1.checkEquality();
		 out.println(test1);
		 
		 StringEquality test2 = new StringEquality("three", "four");
		 test2.checkEquality();
		 out.println(test2);
		 
		 StringEquality test3 = new StringEquality("same", "Same");
		 test3.checkEquality();
		 out.println(test3);
		 
		 StringEquality test4 = new StringEquality("hello", "hello");
		 test4.checkEquality();
		 out.println(test4);
		   
		//add test cases
		
	}
}