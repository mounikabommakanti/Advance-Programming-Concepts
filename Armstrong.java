import java.util.*;

public class Armstrong
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int r,n,i,sum=0;
		System.out.println("three digited armstrong numbers are:");
		for(n=100;n<1000;n++)
		{
				sum=0;
				for(i=n;i>0;i=i/10)
				{
					r=i%10;
					sum=sum+(r*r*r);
				}
				if(sum==n)
					System.out.println(n);
		}
	
	}
}
