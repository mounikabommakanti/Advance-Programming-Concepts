import java.awt.*;
import java.applet.*;
import java.util.*;

public class SierpinskiDemo extends Applet{
    
	public void paint(Graphics g)
   {
	   //Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
	   int x1=512,x2=146,x3=876,y1=109,y2=654,y3=654,dx=0,dy=0;
	   int x=512,y=382,n=0;
	   //setForeground(Color.black);
	   for(int i=0;i<50000;i++)
	   {
		   g.drawLine(x,y,x,y);
		   Random r=new Random();
		    n=r.nextInt(3)+1;
		   if(n==1)
		   {
			   dx=x-x1;
				dy=y-y1;
		   }
		   else if(n==2)
		   {
			   dx=x-x2;
			   dy=y-y2;
		   }
		   else 
		   {
			   dx=x-x3;
			   dy=y-y3;
		   }
		    x=x-dx/2;
			y=y-dy/2; 
	   }
	   g.drawString("Sierpinski Triangle",462,484);
   }
}
