//Pane Elenovski
//10/26/2017
//Fibonacci Program
//Prints the series in the fibonacci sequence up to a certain amount of numbers

import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//Asks user for sequence limit
		System.out.print("Enter how long you would like the sequence to be.");
		int i = keyboard.nextInt();

		//Seperate instances for if the limit is 0 or 1
		if (i == 0)
			System.out.println("0");
		if (i == 1)
			System.out.println("0 1");
		else
			//Runs through and shifts the numbers added each time until limit is reached
			System.out.print("0 1 ");
			int a = 0;
			int b = 1;
			for (int x = 1; x <= i-2; x++)
			{
				int nextNum = a + b;
				System.out.print(nextNum + " ");
				a = b;
				b = nextNum;
			}
	}
}

//Enter how long you would like the sequence to be.5
//0 1 1 2 3

//Enter how long you would like the sequence to be.10
//0 1 1 2 3 5 8 13 21 34