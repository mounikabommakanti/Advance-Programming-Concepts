import java.util.Scanner;
import java.io.*;
public class SumOf3
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int sum=0;
			String str="";
		File txtfile=new File("3nums.txt");
		
		try
		{
			
			Scanner sc = new Scanner(txtfile);
			boolean b = sc.hasNextLine();
			while(b)
			{
				int i=sc.nextInt();
				sum=sum+i;
				b = sc.hasNextLine();
				if(b)
					str=str+i+"+";
				else
					str=str+i;
			}
			System.out.println("read text from file ..");
			System.out.println(str+"="+sum);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}