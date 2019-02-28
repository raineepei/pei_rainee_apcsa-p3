//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rainee	Pei
//Date - 02/26/19

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int count = 0;
		int last = ray[ray.length - 1];
		
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] > last) 
				{
				sum += ray[i]; 
				count++;
				}
		}
		if (count == 0) return -1;
		return sum;
	}
}