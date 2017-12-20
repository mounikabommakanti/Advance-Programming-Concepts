import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
		System.out.println("You were born on ");
		String date=weekday(mm,dd,yyyy);
		System.out.println(date);
		
	}
	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total=0;
		String date = "",day="";
		yy=yyyy-1900;
		if(is_leap(yyyy))
		{
			if(mm  == 1 )
				total=month_offset(mm)+dd+yy+(yy/4)-1;
			else if(mm ==2)
				total=month_offset(mm)+dd+yy+(yy/4)-1;
		}
		else 
			total=month_offset(mm)+dd+yy+(yy/4);
		int rem=total%7;
		day=weekday_name(rem);

		date = day + ", " + month_name(mm) + " " + ", " + yyyy+"!";

		return date;
	}
	public enum months
		{january,febraury,march,april,may,june,july,august,september,october,november,december}
	public static String month_name( int month )
	{
		String result;
		
		if(month>0 && month<13)
			result= months.values()[month-1].toString();
		else
			result="error";
		return result;
	}
	public static int month_offset(int month)
	{
		
		switch(month)
		{
			case 1:return 1;
				
			case 2:return 4;
				
			case 3:return 4;
				
			case 4:return 0;
				
			case 5:return 2;
				
			case 6:return 5;
				
			case 7:return 0;
				
			case 8:return 3;
				
			case 9:return 6;
				
			case 10:return 1;
				
			case 11:return 4;
				
			case 12:return 6;
			default:return -1;
					
			
		}
		
	}
	public static String weekday_name(int dayofweek)
	{
		
		switch(dayofweek)
		{
			case 2:return "monday";
			case 3:return "Tuesday";
			case 4:return "Wednesday";
			case 5:return "Thursday";
			case 6:return "Friday";
			case 0:return "Saturday";
			case 1:return "Sunday";
			default:return "invalid day";
		}
	}
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}