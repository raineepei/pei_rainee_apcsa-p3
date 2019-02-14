//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rainee Pei
//Date - 02/11/19


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	   char first = a.charAt(0);
	   char last = a.charAt(a.length() - 1);
	  
	   for (int i = 0; i < vowels.length(); i++) {
		   if (vowels.charAt(i) == first || vowels.charAt(i) == last) 
			   return "yes";
	   }
	  
	   return "no";
	   
	}
}


