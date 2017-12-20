import java.util.*;

public class FourDigit
{
	public static void main( String[] args )
	{
		//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
		int p,q,r,s,l,m,n,t,k;
		System.out.println("four positive integers p,q,r,s where p+q+r+s=45 and p+2=q-2=r*2=s/2:  ");
		for(p=0;p<=45;p++)
		{
			for(q=0;q<=45;q++)
			{
				for(r=0;r<=45;r++)
				{
					for(s=0;s<=45;s++)
					{
						k=p+2;
						l=q-2;
						m=r*2;
						n=s/2;
						t=p+q+r+s;
						if(k==l&&k==m&&k==n&&(t==45))
									System.out.println(p+","+q+","+r+","+s);						
					}
				}
			}
		}
	}
}