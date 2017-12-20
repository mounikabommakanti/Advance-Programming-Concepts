import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
   This class is an applet that demonstrates how a
   polygon can be drawn.
*/

public class Triangles500 extends JApplet
{
	
	//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
   /**
      paint method
      @param g The applet's Graphics object.
   */
   public void paint(Graphics g)
   {
      int[] xCoords =new int[3];
	  int [] yCoords=new int[3];
      Random r=new Random();
	  
		for(int j=0;j<500;j++)
		{
		for(int i=0;i<3;i++)
			{
				xCoords[i]=r.nextInt(500)+1;
				yCoords[i]=r.nextInt(500)+1;

			}
			
			g.fillPolygon(xCoords, yCoords, 3);
			g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
						
		}
   }
}