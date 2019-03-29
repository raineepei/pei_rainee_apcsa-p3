//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(12, 9, new String[] {"a", "b", "c", "d", "1", "7", "x", "2"});
		System.out.println(test);
	}
}