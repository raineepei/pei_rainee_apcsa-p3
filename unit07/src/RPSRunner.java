//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			
			do {

			out.print("pick your weapon [rock, paper, scissors] :: ");
			
			player = keyboard.nextLine();
			
			//read in the player value
			RockPaperScissors game = new RockPaperScissors();
			
			game.setPlayers(player);
			System.out.println(game);
			
			System.out.println("play again? (y/n)");
			response = keyboard.nextLine().charAt(0);
			
			} while (response != ('n'));
	}
}



