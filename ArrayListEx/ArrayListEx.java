import java.util.ArrayList;
/*
* Practice with Array lists
* 2 functions that change array lists
* @author Jack Gambello
* @version 1.0
*/
public class ArrayListEx
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		a.add(3);
		a.add(4);
		System.out.println(a.size());
		System.out.println(a);
		
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a);
		i = 6;
		System.out.println(i);
		System.out.println(a);
		
		a.add(0, -1);
		System.out.println(a);
	
		a.add(a.size() - 1, 6);
		System.out.println(a);
		
		a.set(a.size() - 1, 9);
		System.out.println(a);
		
		removeOccur(3, a);
		System.out.println(a);
		
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("eye");
		s.add("abc");
		s.add("elephant");
		
		System.out.println(s);
		
		e2x(s);
		
		System.out.println(s);
		
	}

	/*
	* Takes an array list and removes all instances of int s
	* @param the int that is to be removed
	* @param the array list of Integers that s will be removed from
	*/
	public static void removeOccur(int s, ArrayList<Integer> a)
	{
		for(int i = 0; i < a.size(); i++)
		{
			if (a.get(i) == s)
				a.remove(i);
		}
	
	}
	/*
	* Takes an ArrayList and replaces all instances of "e" with "x"
	* @param the array list of strings that the replacement will be carried out on
	*/
	public static void e2x(ArrayList<String> l)
	{
		String newString = "";
		for(int i = 0; i < l.size(); i++)
		{
			String on = l.get(i);
			for(int j = 0; j < on.length(); j++)
			{
				if (on.substring(j, j+1).equals("e"))
					newString += "x";	
				else
					newString += on.substring(j, j+1);
				
			}
			l.set(i, newString);
			newString = "";
		
		
		}
	
	
	
	
	
	}





}