//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rainee Pei
//Date - 02/01/19
//Class - APCSA
//Lab  - Miles Per Hour

import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
	}

	public void calcMPH()
	{
		mph = ((double)distance) / (hours + (minutes/60.0));
	}

	public void print()
	{
	
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in " + hours + " hours and " + minutes + " mintues = " + mph + " MPH.";
	}
}