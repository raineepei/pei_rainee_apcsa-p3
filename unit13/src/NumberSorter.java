//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int index = 0;
		int num = number;
		while (num > 0) {
			sorted[index] = num%10;
			num /= 10;
			index++;
		}
		int i = 1;
		while (i < sorted.length) {
			int j = i; 
			while (j > 0 && sorted[j-1] > sorted[j]) {
				int temp = sorted[j-1];
				sorted[j-1] = sorted[j];
				sorted[j] = temp;
				j--;
			}
			i++;
		}
		return sorted;
	}
}