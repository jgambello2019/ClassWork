public class RecursivePractice
{
/**
* This method prints the ints from
* 0 to n both inclusive, on sperate lines
* using recursion
* @param n the largest int printed on screen
*/
	public static void printNum(int n)
	{
		if (n==0)
			System.out.println(n);
		else
		{
			printNum(n - 1);
			System.out.println(n);
			
			
		}

	}
	
	public static void main(String[] args)
	{
		printNum(5);
	}
}