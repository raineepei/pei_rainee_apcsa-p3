//� A+ Computer Science  -  www.apluscompsci.com
//Name - Rainee Pei
//Date - 02/01/19
//Class - APCSA
//Lab  - LineRunner

public class LineRunner
{
   public static void main( String[] args )
   {
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1.0,9.0,14.0,2.0 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1.0,7.0,18.0,3.0 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6.0,4.0,2.0,2.0 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		
	}
}