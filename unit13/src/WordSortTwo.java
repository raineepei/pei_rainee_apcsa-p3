//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		int i = 1;
		while (i < wordRay.length) {
			int j = i; 
			while (j > 0 && wordRay[j-1].compareTo(wordRay[j]) > 0) {
				String temp = wordRay[j-1];
				wordRay[j-1] = wordRay[j];
				wordRay[j] = temp;
				j--;
			}
			i++;
		}
	}

	public String toString()
	{
		String output="";
		for (String s: wordRay) {
			output += s + "\n";
		}
		return output+"\n\n";
	}
}
