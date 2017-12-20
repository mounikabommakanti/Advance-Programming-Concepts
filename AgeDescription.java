import java.util.*;
class AgeDescription{
	public static void main(String[] args){
		//PAVAN KUMAR DUPPALA,Course:MCIS 5103( Advance Programming Concepts),Section:33
		short age;
		String name;
		System.out.println("enter name");
		Scanner s = new Scanner(System.in);
		name = s.next();
		System.out.println("enter your age");
		do{
			age=s.nextShort();
			if(age<0)
				System.out.println("Age should be positive\nEnter your age");
			else if(age>150)
				System.out.println("Age cannot be greaterthan 150.\nEnter your age");
		}while(age<0 || age>150);	
		if(age<16)
			System.out.println("You are not allowed to drive at the moment.");
		if(age<18)	
			System.out.println("You are not allowed to vote at the moment.");
		if(age<25)
			System.out.println("You are not allowed to rent a car at the moment.");
		if(age>=25)	
			System.out.println("You can do anything that is legal.");
	}
}	