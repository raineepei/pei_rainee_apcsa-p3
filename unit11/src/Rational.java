//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	
	//write two constructors
	public Rational()
	{
		num = 1;
		den = 1;
	}
	
	public Rational(int numerator, int denominator)
	{
		setNums(numerator, denominator);
		reduce();
	}

	//write a setRational method
	public void setRational(int numOne, int numTwo)
	{
		setNums(numOne, numTwo);
		reduce();
	}

	//write  a set method for numerator and denominator
	public void setNums(int n, int d)
	{
		num = n;
		den = d;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = num * other.getDenominator() + other.getNumerator() * den;
		den = den * other.getDenominator();

		reduce();
		
	}

	private void reduce()
	{
		int gcd = gcd(num, den);
		num /= gcd;
		den /= gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int max = 1;
		for (int i = 1; i <= numOne; i++) {
			if (numOne%i == 0 && numTwo%i == 0) {
				max = i;
			}
		}
		return max;

	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator()
	{
		return num;
	}
	
	public int getDenominator()
	{
		return den;
	}
	
	public boolean equals( Object obj)
	{
		return (num == ((Rational) obj).getNumerator() && den == ((Rational) obj).getDenominator());
	}

	public int compareTo(Rational other)
	{
		double first = (double) num / den;
		double second = (double) other.getNumerator() / other.getDenominator();
		if (first > second)
		{
			return 1;
		}
		else {
			return -1;
		}

	}
	
	//write  toString() method
	public String toString() 
	{
		return num + " / " + den;
	}

	
}