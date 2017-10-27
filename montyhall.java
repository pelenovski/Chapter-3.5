//Pane Elenovski
//10/26/2017
//Monty Hall Program
//Runs through monty hall paradox 1000 times and records data

import java.util.Random;

public class montyhall
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		int loop = 1000, withswitch = 0, withoutswitch = 0;

		for (int x = 0; x < loop; x++)
		{
			//randomly select prize and selected doors
			int pdoor = generator.nextInt(3);
			int select = generator.nextInt(3);

			int opendoor;

			if (select == pdoor)
				opendoor = (pdoor + 1 + generator.nextInt(2))%3;
			else
				opendoor = (0 + 1 + 2) - select- pdoor;

			int switchdoor = (0 + 1 + 2) - select - opendoor;

			if (select == pdoor)
				withoutswitch++;
			if (switchdoor == pdoor)
				withswitch++;
		}

		System.out.println("Wins with no switch: " + withoutswitch);
		System.out.println("Wins with switch: " + withswitch);

	}
}
