import java.applet.*;
import java.awt.*;

/**
 * Simple Java program for Applet
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
@SuppressWarnings("serial")
public class Welcome extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("WELCOME To APPLET",500, 50);
		g.drawArc(500, 100, 500, 500, 0, 360);
		g.setColor(Color.MAGENTA);
		g.drawRect(800, 300,100,50);
		
		
	}

}
