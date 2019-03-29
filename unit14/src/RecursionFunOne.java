//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if (num == 0) return 0;
		else if (num % 10 % 2 == 1) 
			{
			return 1 + countOddDigits(num / 10);
			}
		else 
		{
			return countOddDigits(num / 10);
		}

	}
}