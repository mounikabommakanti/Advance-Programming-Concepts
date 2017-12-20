import java.util.*;
import java.lang.*;
class Threshold
{
public static void main(String[] args)
{
	//Name:Mounika Bommakanti,Stud ID:999992538,course:MCIS 6123,Section:02
	double alpha=0.0,beta=0.0,i,j,temp=20,RMS=0.0;
	double sum=0.0,mean=.48,dev=0.08,cth=0.0,CTh=0.0,Err,Errsq;
	int k;
	double[] Th=new double[]{.8,.65,.7,.7,.75,.72,.76,.78,.77,.75};
	for(i=0;i<=1;)
	{
		for(j=0;j<=1;)
		{
			sum=0.0;
			for(k=0;k<10;k++)
			{
				CTh=i*(mean+dev)+j;
				Err=Th[k]-CTh;
				Errsq=Err*Err;
				sum=sum+Errsq;
			}
			RMS=Math.sqrt(sum);
			if(RMS<=temp)
			{
				cth=CTh;
				temp=RMS;
				alpha=i;
				beta=j;
			}
		j+=0.1;
		}
		i+=0.1;
	}
	System.out.println("computed threshold of john :"+cth);
	System.out.println("alpha and beta values that minimizes values of RMS errors:"+alpha+"\n"+beta);	
}
}