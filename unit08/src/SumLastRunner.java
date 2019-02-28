//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rainee Pei
//Date - 02/26/19

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		int[] test = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(test));
		
		int[] test1 = new int[] {255, 255};
		System.out.println(RaySumLast.go(test1));
		
		int[] test2 = new int[] {32767};
		System.out.println(RaySumLast.go(test2));
		
		int[] test3 = new int[] {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(test3));
		
	}
}