/*
* 5 functions
* 1 hasDigit function and 4 variations of the isPalindrome function
* @author Jack Gambello
* @version 1.0
*/

public class hasDigit
{


	public static void main(String[] args)
	{
		String s = new String("abcd");
		String s1 = new String("abc2d");
		String s2 = new String("racecar");
		System.out.println(hasDigit(s));
		System.out.println(hasDigit(s1));
		System.out.println(isPalindromeRecursive(s));
		System.out.println(isPalindromeRecursive(s2));
		System.out.println(isPalindromeRecursiveNoCharAt(s));		
		System.out.println(isPalindromeRecursiveNoCharAt(s2));
		System.out.println(isPalindromeIterativeNoCharAt(s));
		System.out.println(isPalindromeIterativeNoCharAt(s2));
		System.out.println(isPalindromeIterative(s));
		System.out.println(isPalindromeIterative(s2));
	}
	
	/** 
	*This nested takes in a string and returns true
	*if the given string has a digit, false otherwise
	* @param s the given string to check whether it has a digit
	* @return boolean true if has digit, false otherwise
	*/
	public static boolean hasDigit(String s)
	{
		for (int i = s.length() - 1; i >= 0; i--)
		{
			int charOn = s.charAt(i); 
			if(charOn >= 48 && charOn <= 57)
				return true;
		}
		return false;
	
	}

	/**
	*   The following 4 methods take in a String and return true if the given String is a palindrome.
	*   @param s the String to check whether it is a palindrome
	*   @return boolean true if palindrome, false otherwise
	*	The same function is made both recursively and iteratively
	*   It is also using charAt and without using charAt for both iterative and recursive
	*/

	public static boolean isPalindromeRecursive(String s)
	{
		if(s.charAt(0) != s.charAt(s.length()-1))
			return false;
		
		else if (s.length() == 0 || s.length() == 1)
			return true;
			
		return isPalindromeRecursive(s.substring(1,s.length()-1));
	
	}

	public static boolean isPalindromeRecursiveNoCharAt(String s)
	{
		if(!s.substring(0, 1).equals(s.substring(s.length()-1)))
			return false;
		
		else if (s.length() == 0 || s.length() == 1)
			return true;
			
		return isPalindromeRecursive(s.substring(1,s.length()-1));
	
	}

	public static boolean isPalindromeIterativeNoCharAt(String s)
	{
		for (int i = 0;i <= s.length() - 1; i++)
		{
			int backsideCheck = (s.length() - i - 1);
			if (!s.substring(i, i + 1).equals(s.substring(backsideCheck, backsideCheck + 1)))
				return false;
		
		}
		return true;
	}
	
	public static boolean isPalindromeIterative(String s)
	{
		for (int i = 0;i <= s.length() - 1; i++)
		{
			int backsideCheck = (s.length() - i - 1);
			if (s.charAt(i) != s.charAt(backsideCheck))
				return false;
		
		}
		return true;
	}
	
	
	
	
	
	}















	
	
	