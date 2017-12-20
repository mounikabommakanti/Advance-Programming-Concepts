//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
import java.util.*;
import java.text.*;
import java.time.*;
import java.io.*;
//import org.joda.time;
public class Adrbook
{	static int size=10,n=0,mem=0,max=0;
	static int i=0;
	
	private  String[][] A=new String[size][5];
	Scanner sc = new Scanner(System.in);
	public  Adrbook()
		{
		load2();}
			// int size=10;
			
			/*A[0][0]="first name";
			A[0][1]="last name";
			A[0][2]="DOB";
			A[0][3]="phone number";
			A[0][4]="email address";
			for(int i=0;i<5;i++)
		{
			System.out.println(A[0][i]);
		}*/
		
	
	public static void main( String[] args )
	{
		
		int ch=0;
		char ans='a';
		
		Adrbook A=new Adrbook();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1) Load from file");
			System.out.println("2) Save to file");
			System.out.println("3) Add an entry");
			System.out.println("4) Remove an entry");
			System.out.println("5) Edit an existing entry");
			System.out.println("6) Sort the address book");
			System.out.println("7) Search for a specific entry");
			System.out.println("8) Quit");
			System.out.println("Please choose what you'd like to do with the database:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						A.load();
						break;
				case 2:
						A.save();
						break;
				case 3:
						A.addEntry();
						break;
				case 4:
						A.load2();
						A.remEntry();
						
						break;
				case 5:
						A.load2();
						A.editEntry();
						break;
				case 6:
						A.load2();
						A.sortAddbuk();
						break;
				case 7:
						A.load2();
						A.searchEntry();
						break;
				case 8:
						A.quit();
						break;
			}
			
		}while(ch != 8);
	}
	public  void addEntry(  )
	{
		
		i++;
		System.out.println("enter first name");
		A[i][0]=sc.nextLine();
		System.out.println("enter last name");
		A[i][1]=sc.nextLine();
		System.out.println("enter DOB");
		Scanner scanner = new Scanner(System.in);
    String str[] = {"year", "month", "day" };
    String date = "";

    for(int s=0; s<3; s++) {
		if(s==2)
		{
				System.out.println("Enter " + str[s] + ": ");
			date=date+sc.nextLine();
		}
		else{ System.out.println("Enter " + str[s] + ": ");
        date = date + sc.nextLine() + "-";}
       
    }
  
 
		A[i][2]=date;
		System.out.println("enter phone number");
		A[i][3]=sc.nextLine();
		System.out.println("enter email address");
		A[i][4]=sc.nextLine();
		//System.out.println(i);
		mem=i;

		
	}
	public void load(  )
	{
		int rawData,l=0,m=0;        // To hold a character code
      char ch;	// To hold a character
		//String str1="",str2="",str3="";
		String date = "";
		try{
		  File txtfile=new File("NewFile.txt");
		Scanner in = new Scanner(txtfile);
		boolean b=in.hasNextLine();
			while (in.hasNext()){
					//System.out.println(l);
					A[l][m] = in.next();
					m++;
					if(m % 5 == 0)
					{
						l++;
						m=0;
					}
				}
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date localdate = new Date();
				
				for (int k = 0; k < l; k++)
				{
						date=A[k][2];
						try{
						 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						
						String output = sdf.format( localdate );
						//System.out.println(A[k][2]);
						int compare=A[k][2].compareTo(output);
						if(compare==0){
						
							System.out.println(A[k][0]+"\t"+A[k][1]+"\t"+"celebrates his/her bday today");
						}
						}
						catch (Exception ex ){
							System.out.println(ex);
						}
				
			
				}
		}
		
	   catch (IOException e)
      {
         System.out.println("Error: " +
                            e.getMessage());
	  }
	 // System.out.println(l);
	  	System.out.println("firstname"+"\t"+"lastname"+"\t"+"DOB"+"\t\t"+"phone_number"+"\t\t"+"email_address");
	  	for (int k = 0; k < l; k++)
         {
			 for(int j=0;j<5 && A[k][j] != null ;j++)
			 {				
				System.out.print(A[k][j]+"\t\t");
				
				}
			System.out.println();
			max=k;
		  }
		  
	}
	public void load2()
	{
		int rawData,l=0,m=0;        // To hold a character code
      char ch;	// To hold a character
	//	String str1="",str2="",str3="";
		try{
		  File txtfile=new File("NewFile.txt");
		Scanner in = new Scanner(txtfile);
		boolean b=in.hasNextLine();
			while (in.hasNext()){
					//System.out.println(l);
					A[l][m] = in.next();
					m++;
					if(m % 5 == 0)
					{
						l++;
						m=0;
					}
				}
			
		}
	   catch (IOException e)
      {
         System.out.println("Error: " +
                            e.getMessage());
	  }
	  max=l;
	}
	
	public  void save(  )
	{
		 try
      {
		  File txtfile=new File("NewFile.txt");
		Scanner in = new Scanner(txtfile);
		FileWriter fwriter = new FileWriter("NewFile.txt",true);
		if(max==size)
		{
			System.out.println("address book is full ,cant save any more");
			
		}
		else
		{
		for (int i = 1; i <=mem; i++)
				{
					for(int j=0;j<5 && A[i][j] != null;j++)
					fwriter.write(String.valueOf(A[i][j])+"\t");		
					fwriter.write("\r\n");
					
					
				}
				max++;
		i=0;
		fwriter.close();
		}
	  }
      catch (IOException e)
      {
         System.out.println("Error: " +e.getMessage());
      }
		
	}
	
	public void remEntry(  )
	{
		System.out.println("enter last name and first name  whose entry to be deleted:");
		String lastname=sc.next();
		String firstname=sc.next();
		for (int a = 0; a < max; a++)
         {
			// System.out.println(A[a][0] + A[a][1]);
			if(A[a][0].equals(firstname)&&A[a][1].equals(lastname))
				{
					A[a][0]="";
			A[a][1]="";A[a][2]="";A[a][3]="";A[a][4]="";
				
			}
		}
		 try
      {
		File txtfile=new File("NewFile.txt");
		Scanner in = new Scanner(txtfile);
		FileWriter fwriter = new FileWriter("NewFile.txt");
		for (int i = 0; i <max; i++)
				{
					for(int j=0;j<5 && A[i][j] != null;j++)
					fwriter.write(String.valueOf(A[i][j])+"\t");		
					fwriter.write("\r\n");
					
					
				}
				max--;
		i=0;
		fwriter.close();
	  }
      catch (IOException e)
      {
         System.out.println("Error: " +e.getMessage());
      }
	}
	public  void sortAddbuk(  )
	{
		int compare=0,index=0;
		String[][] B=new String[size][5];
		String[] temp=new String[5];
		System.out.println("ADDRESS BOOK IS SORTED BY LAST NAME AND SAVED ,SELECT LOAD FROM FILE TO LOOK THE SORTED ADDRESS BOOK"+"\n");
		for(int q=0;q<max-1;q++)
		{
			index=q;
	for (int a = q+1; a < max; a++)
         {
			
				 compare=A[a][1].compareTo(A[index][1]);
				 if(compare<=0)
					index=a;
		 }
		// System.out.println(index);
		 for(int r=0;r<5;r++)
		 {
			 temp[r]= A[index][r];
			 A[index][r] = A[q][r];
			 A[q][r]=temp[r];
		 }
		
			
		}
						try
					  {
						File txtfile=new File("NewFile.txt");
						Scanner in = new Scanner(txtfile);
						FileWriter fwriter = new FileWriter("NewFile.txt");
						for (int i = 0; i <max; i++)
								{
									for(int j=0;j<5 && A[i][j] != null;j++)
									fwriter.write(String.valueOf(A[i][j])+"\t");		
									fwriter.write("\r\n");
								}
						i=0;
						fwriter.close();
					  }
					  catch (IOException e)
					  {
						 System.out.println("Error: " +e.getMessage());
					  }
	}
			
			
	
	public  void searchEntry( )
	{
		System.out.println("enter last name and first name  whose entry to be searched:");
		String lastname=sc.next();
		String firstname=sc.next();
		//System.out.println(max);
		System.out.println("firstname"+"\t"+"lastname"+"\t"+"DOB"+"\t\t"+"phone_number"+"\t\t"+"email_address");
		for (int a = 0; a < max; a++)
         {
			 	if(A[a][0].equals(firstname)&&A[a][1].equals(lastname))
				{
					
					System.out.println(A[a][0]+"\t\t"+A[a][1]+"\t\t"+A[a][2]+"\t\t"+A[a][3]+"\t\t"+A[a][4]+"\t\t");
					
				}
		}
	}
	public void quit(  )
	{
		
	}
	public  void editEntry(  )
	{
		System.out.println("enter last name and first name  whose entry to be edited:");
		String lastname=sc.next();
		String firstname=sc.next();
		int ch=0;
		for (int a = 0; a <max; a++)
         {
			 	if(A[a][1].equals(lastname)&&A[a][0].equals(firstname))
				{
					System.out.println("choose which entry you wanted to change:");
					System.out.println("1.first name"+"\n"+"2.last name"+"\n"+ "DOB"+"phone number"+"\n"+"email address");
					ch=sc.nextInt();
						
						switch(ch)
					{
						case 1:
								System.out.println("enter the new first name ");
								A[a][0]=sc.next();
								break;
						case 2:
								System.out.println("enter the new last name ");
								A[a][1]=sc.next();
								break;
						case 3:
								System.out.println("enter the new DOB");
								A[a][2]=sc.next();
								break;
						case 4:
								System.out.println("enter the new phone number");
								A[a][3]=sc.next();
								break;
						case 5:
								System.out.println("enter the new email address");
								A[a][4]=sc.next();
								break;
						default:
								System.out.println("first and last name not found");
						
						
					}
				}

		 }
						try
					  {
						File txtfile=new File("NewFile.txt");
						Scanner in = new Scanner(txtfile);
						FileWriter fwriter = new FileWriter("NewFile.txt");
						for (int i = 0; i <max; i++)
								{
									for(int j=0;j<5 && A[i][j] != null;j++)
									fwriter.write(String.valueOf(A[i][j])+"\t");		
									fwriter.write("\r\n");
								}
						i=0;
						fwriter.close();
					  }
					  catch (IOException e)
					  {
						 System.out.println("Error: " +e.getMessage());
					  }
	}
}
	
	