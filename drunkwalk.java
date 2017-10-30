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
		Random generator = new Random();
		pen.up();
		int m;

		for (x = 0; x <= 250; x++)
			//Generates random num in between 1 and 4 inclusive
			m = generator.nextInt(5)+1;

			//turns pen 90 degrees and writes for 10 blocks
			if (m == 1)
				pen.turn(90);
				pen.move(10);
			if (m == 2)
				pen.turn(180);
				pen.move(10);
			if (m == 3)
				pen.turn(270);
				pen.move(10);
			if (m == 4)
				pen.turn(360);
				pen.move(10);

	}
}
