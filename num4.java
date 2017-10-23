//Pane Elenovski & Aaina Vannan
//10/18/2017
//Program 4
//Takes string and messes with it

import java.util.Scanner;

public class num4
{
	public static void main (String []args)
	{
		//int length = 1;
		Scanner keyboard = new Scanner(System.in);

		String statement;
		statement = keyboard.nextLine();

		length = (statement.length()-1);

		for (int length = 1; length != 0;)
		{
			System.out.println(statement.charAt(length));
			length = length - 1;
		}



	}
}
