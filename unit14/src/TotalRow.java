//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> result = new ArrayList<Integer>();
    	for (int[] i: m)
    	{
    		int total = 0;
    		for (int j: i)
    		{
    			total += j;
    		}
    		result.add(total);
    	}
		return result;
    }
}
