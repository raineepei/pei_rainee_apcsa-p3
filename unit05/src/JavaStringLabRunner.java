//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class JavaStringLabRunner
{
	public static void main( String args[] )
	{
		BetweenSigns s = new BetweenSigns();
			
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
		System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  s.go(  "##")    );
		System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );

	}
}


