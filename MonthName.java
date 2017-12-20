import java.util.*;
public class MonthName
{
	//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
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


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
}