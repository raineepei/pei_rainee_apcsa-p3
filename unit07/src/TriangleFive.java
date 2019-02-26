//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rainee Pei

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";

		for (int i = amount; i > 0; i--)
		{
			int a = 0;
			char begin = letter;
			while (a < i)
			{
				for (int b = amount - a; b > 0; b--)
				{	
					output += begin;
				}
				if (begin == 'Z') begin -= 25;
				else begin++;
				output += " ";
				a++;
			}
			output += "\n";
		}
			
		return output;
	}
}