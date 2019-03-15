//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore(String toys)
	{
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		for (String s: toys.split(" "))
		{
			boolean matches = false;
			if (toyList.size() > 0)
			{
				for (Toy toy: toyList) {
					if (toy.getName().equals(s)) {
						toy.setCount(toy.getCount() + 1);
						matches = true;
					}
				}
			}
			if (!matches) {
				toyList.add(new Toy(s));
				getThatToy(s).setCount(1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy: toyList) 
  		{
  			if (toy.getName().equals(nm))
  			{
  				return toy;
  			}
  		}
  		return new Toy();
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy result = toyList.get(0);
  		for (Toy toy: toyList)
  		{
  			if (toy.getCount() > result.getCount()) 
  			{
  				result = toy;
  			}
  		}
  		return result.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		boolean sorted = false;
  		while (!sorted)
  		{
  			int fixed = 0;
  			for (int i = 0; i < toyList.size()-1; i++)
  			{
  				if (toyList.get(i).getCount() > toyList.get(i+1).getCount())
  				{
  					Toy temp = toyList.get(i);
  					toyList.add(i, toyList.get(i+1));
  					toyList.remove(i+1);
  					toyList.remove(i+1);
  					toyList.add(i+1, temp);
  					fixed += 1;
  				}
  			}
  			if (fixed == 0) sorted = true;
  		}
  	}  
  	  
	public String toString()
	{
		return Arrays.toString(toyList.toArray());
	}
}