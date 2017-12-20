import java.util.Scanner;
class PrimeFactors
{
public static void main(String[] args)
{
	System.out.println("Mounika Bommakanti,999992538");
	int i,j,k=0,n1,n2,counter=0,p;
	int ar[]=new int[10];
	String str="";
	System.out.println("enter the number in the range between 100 & 700");
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		n1=sc.nextInt();

		n2=n1;
	if(n1<100||n1>700)
	{	
		System.out.println("enter number only in the range of 100 & 700");
	}
	else 
		break;
	}
	System.out.print("prime factors of \n"+n1+"=");
	for(i=1;i<=n1;i++)
	{
			
		counter=0;
		p=0;
		for(j=1;j<=i;j++)
		{
				
			if(i%j==0)
				counter++;
			else
				continue;
			if(counter==2)
			{
					//System.out.println(i);
				while(n2%i==0)
				{
					n2=n2/i;
					if(n2==1)
						System.out.print(i);
					else
						System.out.print(i+"*");
					
					p++;
				}
				if(p!=0)
				{
					ar[k]=i;
					k++;
					str=str+i+"^"+p+"*";
				}
				break;
			}
			else
				continue;

		}
	}
	System.out.println();
	char[] c=new char[18];
	c=str.toCharArray();
	c[str.length()-1]=' ';
	str=String.valueOf(c);
	System.out.println("power of the divisors form:"+str);
	System.out.println("increasing order of the prime factors are:");
	for(k=0;k<10&&ar[k]!=0;k++)
		System.out.print(" "+ar[k]);
}
}
