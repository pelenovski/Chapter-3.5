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
		pen.down();
		int m;
		
		for (x = 0; x <= 250; x++)
			//Generates random num in between 1 and 4 inclusive
			m = generator.nextInt(5)+1;
			double x;
			double y;
			
			//Adds or substracts 1 from x or y depending on num generated
			if (m == 1)
				x++;
			if (m == 2)
				x--;
			if (m == 3)
				y++;
			if (m == 4)
				y--;
			//Moves pen to that coordinate each time until x equals 250
			pen.move(x,y);
			
	}
}
