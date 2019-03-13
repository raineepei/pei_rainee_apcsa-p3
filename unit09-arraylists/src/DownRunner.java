import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{				
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {10,9,8,7,6,5,4,3,2,1,-99}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {32767}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {9,10,-88,100,-555,1000}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));
		
		ray.clear();
	}
}