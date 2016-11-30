	/*
	* Practice methods using 2D arrays
	* Two Print functions, one that prints a 2D array of ints row by row, one that prints 2D array of strings row by row
	* Two functions that create int 2D arrays that count up in each each item of each array, one that counts from
	* 1-16 and one that counts from 1-n
	* Lastly, a function that prints a 2D array of ints neatly and evenly spaced with borders
	* These helped me understand 2D arrays and familiarize myself with working with them
	* @author Jack Gambello
	* @version 1.0
	*/

public class TwoDArrayPrac
{
	public static void main(String[] args)
	{
		int[][] arr = create2D();
		print2D(arr);

		int[][] arr1 = param2D(4);
		printNice(arr1);
	}


	/*
	* Prints a 2D array of ints row by row
	* @param 2D int array
	*/
	public static void print2D(int[][] a)
	{
		 for(int row = 0; row < a.length; row++)
		 {
		 	for(int col = 0; col < a[row].length; col++)
		 	{
		 		System.out.print(a[row][col] + " ");
		 	}
		 	System.out.println();
		 }
	}
	
	/*
	* Prints a 2D array of strings row by row
	* @param 2D string array
	*/
	public static void print2D1(String[][] a)
	{
		 for(int row = 0; row < a.length; row++)
		 {
		 	for(int col = 0; col < a[row].length; col++)
		 	{
		 		System.out.print(a[row][col] + " ");
		 	}
		 	System.out.println();
		 }
	}
	
	/* 
	* Returns a 2D array containing lists of ints that count from 1 to 16
	* @return the 2D array 1-16
	*/
	public static int[][]create2D()
	{
		int[][] arr = new int[4][4];
		int counter = 1;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = counter;
				counter++;
			}
		}
		return arr;
	}
	
	/*
	* Returns a array of n lists containing n ints each
	* the ints of the array start at 1 and count up in each item of each array
	* @param an int determining the amount of arrays and the length of each array
	* @return the 2D array of ints
	*/
	public static int[][]param2D(int n)
	{
		int[][] arr = new int[n][n];
		int counter = 1;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				arr[i][j] = counter;
				counter++;
			}
		}
		return arr;
	}
	
	
	/*
	* Prints int[][] a in a neat and evenly spaced fashion with borders
	* @param two dimensional array containing ints
	*/
	public static void printNice(int[][] a)
	{
		String mostSpaces = String.valueOf(a[a.length - 1][a[a.length - 1].length - 1]);
		int max = mostSpaces.length();
		for(int j = 0; j <= (max + 2) * (a[0].length); j++)
	 		System.out.print("-");
	 	System.out.println();
		 for(int row = 0; row < a.length; row++)
		 {
		 	System.out.print("|");
		 	for(int col = 0; col < a[row].length; col++)
		 	{
		 		System.out.print(a[row][col]);
		 		int lengthOf = (String.valueOf(a[row][col])).length();
		 		for(int i = lengthOf; i <= max; i++)
		 			System.out.print(" ");
		 		System.out.print("|");
		 	}
		 	System.out.println();
		 	for(int j = 0; j <= (max + 2) * (a[row].length); j++)
		 		System.out.print("-");
		 	System.out.println();
		 }
	}
	
}