//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{ 
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i = 0; i < ray.length; i++)
		{
			if (ray[i] % 2 == 1)
			{
				oddIndex = i;
				break;
			}
		}
		for (int j = oddIndex; j < ray.length; j++)
		{
			if (ray[j] % 2 == 0)
			{
				evenIndex = j;
				break;
			}
		}
		if (evenIndex > oddIndex)
		{
		return evenIndex - oddIndex;
		}
		else return -1;
	}
}