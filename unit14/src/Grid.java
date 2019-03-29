//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;
   private String[] values;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				grid[i][j] = vals[(int) (Math.random() * vals.length)];
			}
		}
		values = vals;
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String result = vals[0];
		for (String s: vals) {
			if (countVals(s) > countVals(result)) {
				result = s;
			}
		}
		return result;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (String[] i: grid) {
			for (String j: i) {
				if (j.contentEquals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		for (String[] i: grid) {
			for (String j: i) {
				output += j + " ";
			}
			output += "\n";
		}
		output += findMax(values) + " occurs the most";
		return output;
	}
}