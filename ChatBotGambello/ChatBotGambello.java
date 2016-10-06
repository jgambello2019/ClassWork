import java.util.Scanner;

/**
 * This is a program that talks to user until they say bye or Bye
 * @author Jack Gambello
 * @version 1.0
 */
 public class ChatBotGambello
 {
 	/**
 	 * This is the main method that the java interpreter calls
 	 * @param args This is a command line argument
 	 */
 	public static void main(String[] args)
 	{
 		// create/construct a Scanner obj
 		Scanner jack = new Scanner(System.in);
 		System.out.print("Please enter your name: ");
 		String name = jack.nextLine();
 		int x = 0;
 		while (x != 1)
 		{	
 			if (name.equals("bye"))
			{
				x = 1;
				System.out.println("See ya!");
			}
			else if (name.equals("Bye"))
			{
				x = 1;
				System.out.println("See ya!");
			}
			
			else
			{	
				System.out.println("Hi " + name + "!. How are you doing today?");
				String input = jack.nextLine();
				if (input.equals("bye"))
				{
					x = 1;
					System.out.println("See ya!");
				}
				else if (input.equals("Bye"))
				{
					x = 1;
					System.out.println("See ya!");
				}
				else
				{
					System.out.println("Your answer is " + input);
					System.out.println("How old are you? ");
					String StringAge = jack.nextLine();
					if (StringAge.equals("bye"))
					{
						x = 1;
						System.out.println("See ya!");
					}
					else if (StringAge.equals("Bye"))
					{
						x = 1;
						System.out.println("See ya!");
					}
					else
					{
						int age = Integer.parseInt(StringAge);
						if(age > 30)
						{
							System.out.println(name + ", you are old!");
						}
						else
						{
							System.out.println("Nice!"); 
						}
						System.out.print("How tall are you?");
						String StringHeight = jack.nextLine();
						if (StringHeight.equals("bye"))
						{
							x = 1;
							System.out.println("See ya!");
						}
						else if (StringHeight.equals("Bye"))
						{
							x = 1;
							System.out.println("See ya!");
						}
						else
						{
							double height = Double.parseDouble(StringHeight);
							if (height > 6.0)
							{
								System.out.println(name + ", you are tall!");
							}
							else if (height > 5.0)
							{
								System.out.println(name + ", good height");
							}
							else
							{
								System.out.println(name + ", you are short! :P");
							}

							System.out.print("What is your fav color?: ");
							String color = jack.nextLine();
							if (color.equals("bye"))
							{
								x = 1;
								System.out.println("See ya!");
							}
							else if (color.equals("Bye"))
							{
								x = 1;
								System.out.println("See ya!");
							}
							else
							{
								System.out.println(color + " is your favorite!");
							}
						}
							}
						}				
					 }
				   }
		   }
		}
	