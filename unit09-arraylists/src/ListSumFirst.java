//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i < ray.size(); i++)
		{
			if (ray.get(i) > first)
			{
				sum += ray.get(i);
				count++;
			}
		}
		if (count == 0) return -1;
		return sum;
	}
}