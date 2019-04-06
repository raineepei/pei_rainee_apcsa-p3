//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
	private String[][] m;
    private int side;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int count = 0; 
    	while (count < size*size) {
    		m[count/size][count%size] = str.substring(count, count+1);
    		count++;
    	}
    	side = size;
    }

    public boolean isFound( String word )
    {
    	return (checkRight(word, 0, 0) || checkLeft(word, 0, word.length()-1)
    			|| checkUp(word, word.length()-1, 0) || checkDown(word, 0, 0));
    }

	public boolean checkRight(String w, int r, int c)
   {
		if (side - c < w.length() || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r][c+i])) {
					return (checkRight(w, r+1, c) || checkRight(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (c < w.length()-1 || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r][c-i])) {
					return (checkLeft(w, r+1, c) || checkLeft(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (r < w.length()-1 || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r-i][c])) {
					return (checkUp(w, r+1, c) || checkUp(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkDown(String w, int r, int c)
   {
		if (side - r < w.length() || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r+i][c])) {
					return (checkDown(w, r+1, c) || checkDown(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if (side - c < w.length() || r < w.length()-1 || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r-i][c+i])) {
					return (checkDiagUpRight(w, r+1, c) || checkDiagUpRight(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if (c < w.length()-1 || r < w.length()-1 || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r-i][c-i])) {
					return (checkDiagUpLeft(w, r+1, c) || checkDiagUpLeft(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if (side - r < w.length() || c < w.length()-1 || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r+i][c-1])) {
					return (checkDiagDownLeft(w, r+1, c) || checkDiagDownLeft(w, r, c+1));
				}
			}
			return true;
		}
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if (side - r < w.length() || side - c < w.length() || r >= side || c >= side) {
			return false;
		}
		else {
			for (int i = 0; i < w.length(); i++) {
				if (!w.substring(i, i+1).contentEquals(m[r+i][c+i])) {
					return (checkDiagDownRight(w, r+1, c) || checkDiagDownRight(w, r, c+1));
				}
			}
			return true;
		}
	}

    public String toString()
    {
    	String output="";
		for (String[] i: m) {
			for (String j: i) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
    }
}