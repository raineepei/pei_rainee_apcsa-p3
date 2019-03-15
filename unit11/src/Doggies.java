//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		Dog max = pups[0];
		for (Dog dog: pups)
		{
			if (dog.getAge() > max.getAge()) max = dog;
		}
		return max.getName();
	}

	public String getNameOfYoungest()
	{
		Dog min = pups[0];
		for (Dog dog: pups)
		{
			if (dog.getAge() < min.getAge()) min = dog;
		}
		return min.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}