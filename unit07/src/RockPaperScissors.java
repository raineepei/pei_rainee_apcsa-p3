//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("rock");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double random = Math.floor((Math.random() * 3) + 1);
		if (random == 0) compChoice = "rock";
		if (random == 1) compChoice = "paper";
		if (random == 2) compChoice = "scissors";
	}

	public String determineWinner()
	{
		String winner="";
		if (compChoice.equals("rock") && playChoice.equals("scissors")
			|| compChoice.equals("scissors") && playChoice.equals("paper")
			|| compChoice.equals("paper") && playChoice.equals("rock")) winner = "computer wins";
		else if (compChoice.equals(playChoice)) winner = "draw";
		else winner = "player wins";
			return winner;
		}

	public String toString()
	{
		String output;
		if (determineWinner().equals("computer wins")) output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + ":: " + compChoice + " beats " + playChoice;
		else if (determineWinner().equals("draw")) output = "draw game";
		else output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + ":: " + playChoice + " beats " + compChoice; 
		return output;
	}
}