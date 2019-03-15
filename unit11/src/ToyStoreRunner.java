//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toys = new ToyStore("sorry gijoe teddybear sorry train sorry teddybear train train train gijoe");
		toys.sortToysByCount();
		System.out.println(toys);
		System.out.println(toys.getMostFrequentToy());
	}
}