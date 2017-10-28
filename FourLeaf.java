import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class FourLeaf
{
public static void main(String[] args)
{
	Random gen = new Random();
	StandardPen pen = new StandardPen();

	double i;
	double twopi = 6.28;
	double theta = 6.28/100;
	pen.up();

	for (i = 0; i<=6.28; i+=theta)
	{
		double r = Math.cos(2*i);
		double x = r * 100 * Math.cos(i);
		double y = r * 100 * Math.sin(i);
		pen.move(x,y);
		pen.down();
	}





}//end of main
}//end of class
