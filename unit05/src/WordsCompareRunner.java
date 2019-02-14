//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Rainee Pei
//Date - 02/12/19
//Class - APCSPA
//Lab  - Dictionary

import java.util.Scanner; 

import static java.lang.System.*;


public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare("abe", "ape");
	   test.compare();
	   out.println(test);
	   
	   WordsCompare test1 = new WordsCompare("one", "two");
	   test1.compare();
	   out.println(test1);
	   
	   WordsCompare test2 = new WordsCompare("52", "184");
	   test2.compare();
	   out.println(test2);
	   
	   WordsCompare test3 = new WordsCompare("rainee", "rain");
	   test3.compare();
	   out.println(test3);
	   
	   WordsCompare test4 = new WordsCompare("hill", "hi");
	   test4.compare();
	   out.println(test4);
	   //add test cases

	}
}