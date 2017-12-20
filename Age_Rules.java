import java.util.Scanner;

class Age_Rules
{
public static void main(String[] args)
{
	System.out.println("Mounika Bommakanti,999992538");
	int age;
	String name="";
	System.out.println("enter your name:");
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	System.out.println("enter your age in number:");
	while(true)
	{
	age=sc.nextInt();
	if(age<0)
	{
		System.out.println("invalid age  ,enter age positive:");
		continue;
	}
	else
		break;
	}
	if(age<25&&(age<18&&age>16))
	{
				System.out.println("You are not allowed to rent a car at the moment");
				System.out.println("You are not allowed to vote at the moment");
	}
	else if(age<25&&age>=18)
		System.out.println("You are not allowed to rent a car at the moment");
		
	else if(age<=16)
		{
			System.out.println("You are not allowed to rent a car at the moment");
			System.out.println("You are not allowed to vote at the moment");
			System.out.println("You are not allowed to drive at the moment");
		}
	else
			System.out.println("you are allowed to do anything legal");
}
}
	

	