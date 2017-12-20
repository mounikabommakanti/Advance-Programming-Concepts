import java.util.*;
import java.io.*;


public class Largest
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int[] a=new int[10];
		int temp=0,slot=0;
		Random r=new Random();
		System.out.print("Array:");
		for(int i=0;i<10;i++)
		{
			a[i]=r.nextInt(100)+1;
			System.out.print(a[i]+"\t");
		}
		for(int j=0;j<10;j++)
		{
			if(temp<a[j])
			{
				temp=a[j];
				slot=j;
			}
		}
		System.out.print("\n");
		System.out.println("largest value in the array:"+temp);
		System.out.println("It is in slot:"+(slot+1));
		for(int k=0;k<10;k++)
		{
			System.out.print(a[k]+"\t");
			
		}
		System.out.print("\n");
		for(int k=0;k<10;k++)
		{
			if(a[k]==temp)
				System.out.print("^");
			else
				System.out.print("\t");
			
		}
	}
}
		
		
		