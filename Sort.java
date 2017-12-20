import java.util.*;
import java.io.*;


public class Sort
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int[] a=new int[20];
		int temp=0,slot=0;
		Random r=new Random();
		System.out.print("Array:");
		for(int i=0;i<20;i++)
		{
			a[i]=r.nextInt(100)+1;
			System.out.print(a[i]+ "  ");
		}
		for(int j=0;j<20;j++)
		{
			for(int k=j+1;k<20;k++)
			{
				if(a[j]<a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.print("\n"+"sorted array:");
		for(int k=0;k<20;k++)
		{
			System.out.print(a[k]+"  ");
			
		}
	}
}
