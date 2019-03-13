import java.util.List;
import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,5}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {10,9,8,7,6,5,4,3,2,1,-99}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {32767}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {9,10,-88,100,-555,2}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
	}
}