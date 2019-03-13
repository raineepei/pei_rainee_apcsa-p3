//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddIndex = 0;
		int evenIndex = 0;
		
		for (int i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 1)
			{
				oddIndex = i;
				break;
			}
		}
		for (int j = oddIndex; j < ray.size(); j++)
		{
			if (ray.get(j) % 2 == 0)
			{
				evenIndex = j;
				break;
			}
		}
		
		if (evenIndex > oddIndex) 
			{
			return (evenIndex - oddIndex);
			}
		else return -1;
		
	}
}