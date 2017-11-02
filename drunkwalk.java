//Pane Elenovski
//10/27/2017
//Drunk Walk
//Randomly walk in different directions

import java.util.Random;
import TurtleGraphics.StandardPen;
import java.awt.*;

public class drunkwalk
{
	public static void main(String[] args)
	{
		StandardPen p = new StandardPen();
		Random generator = new Random();
		p.down();
		int m = 0;

		for (int x = 0; x <= 250; x++)
		{
			//Generates random num in between 1 and 4 inclusive
			m = generator.nextInt(4)+1;

			//turns pen 90 degrees and writes for 10 blocks
			if (m == 1)
			{
				p.turn(90);
				p.move(10);
			}
			else if (m == 2)
			{
				p.turn(180);
				p.move(10);
			}
			else if (m == 3)
			{
				p.turn(270);
				p.move(10);
			}
			else if (m == 4)
			{
				p.turn(360);
				p.move(10);
			}
		}

	}
}
