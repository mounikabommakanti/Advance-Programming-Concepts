import java.util.*;
import java.io.*;


public class Enc_Dec
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int sum=0;
		char ans='a';
		String name="",file="",pswd="";
		Console cons=System.console();
		char[] pwd=new char[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password:");
		pwd=cons.readPassword();
		 pswd=new String(pwd);
		System.out.println(pswd);
		do
		{
		try
		{
			System.out.println("choose one of the following option:\n1.enter your name and a filename to save or \n"+ 
									"2.enter a file name to load.");
			int i=sc.nextInt();
		
				if(i==1)
				{
					System.out.println("enter your name");
					name=sc.next();
					System.out.println("enter file name");
					file=sc.next();
					File txtfile=new File(file);
					txtfile.createNewFile();
					FileWriter wrt=new FileWriter(txtfile);
					
					for(int j=0,k=0;j<name.length();j++,k++)
						
					{	
						if(k==pswd.length())
						{
							k=0;
							
						}
						  int a = name.toCharArray()[j];
						    int b = pswd.toCharArray()[k];
							
							int c=a^b;
							
							wrt.write(Integer.toString(c));
							wrt.write("\n");
					}
					wrt.close();
				
				}
				else
				{
					String str="",stri="",strn="";
					System.out.println("enter file name to be loaded:");
					file=sc.next();
					File txtfile=new File(file);
					Scanner in = new Scanner(txtfile);
					boolean b = in.hasNextLine();
					int j=0;
							while(b)
							{
							if(j<=pswd.length())
							{
							
								
								int n=in.nextInt();
								if(j==pswd.length())
								{
									j=0;
							
								}
								int p = pswd.toCharArray()[j];
								
								int q=p^n;
								char c=(char)q;
								stri=Character.toString(c);
								
								str=str+stri;
							
								
							}
							b=in.hasNextInt();
							j++;
							}
						
							System.out.println("read text from file ..");
							System.out.println(str);

				}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("do you want to continue,select y or n\n");
		ans=sc.next().charAt(0);
		}while(ans=='y');
		
		
	}
}