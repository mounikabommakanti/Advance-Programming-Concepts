import java.util.*;
import java.io.*;
public class DecisionFusion
{	
	private String filename;
	public void load(String filename)
	{	int m=0,n=0;
		
		double sum1=0.0d,sum2=0.0d;
		String Dec="";
		int no_of_dec=0,count=0;
		
		String s1=new String();
		try{
				File txtfile=new File(filename);
				Scanner in = new Scanner(txtfile);
				Random r=new Random();
				boolean b=in.hasNextLine();
				while(b&& (in.nextLine())!=null) 
				{
					m= count++ ;
					b=in.hasNextLine();
					//System.out.println(b);
				}
	
				txtfile=new File(filename);
				in = new Scanner(txtfile);
				b=in.hasNextLine();
				if(b&&(in.next()!=null))
				{
				s1 =  in.nextLine();
				
							String[] tokens = s1.split("\t");
							n=tokens.length;	
				}
				String[][] A=new String[m+1][n+1];
				
				double[] w=new double[n];
					for(int j=1;j<n;j++)
						w[j]=r.nextInt(1001)/1000d;

				txtfile=new File(filename);
				in = new Scanner(txtfile);	
				b=in.hasNextLine();
				int i=-1,k=0;
				for(i = 0 ; i < m ; i++){
					s1 =  in.nextLine();
					String[] tokens = s1.split("\t");
					A[i][0]=tokens[0];
					A[i][1]=tokens[1];
					A[i][2]=tokens[2];
					A[i][3]=tokens[3];
					A[i][4]=tokens[4];
				}
				 //float[] temp={ 0.0f,0.0f};
				// k++;
				float acc=0.0f;
				float temp1=0.0f;
				float temp2=1.0f;
				int c=0;
			//	while(temp[k]>=temp[k-1] && temp[k]<=100.0f)
				while(temp2>temp1 && temp2<100 )
				{
					no_of_dec=0;
					temp1=temp2;
					for(i=1;i<m;i++)
					{
						for(int j=1;j<n;j++)
						{
							//System.out.println("A[i][j]:"+A[i][j]);
							if(A[i][j].equals("Y"))
								sum1=sum1+w[j];
							else if(A[i][j].equals("N"))
								sum2=sum2+w[j];
						}
					//System.out.println(sum1 + sum2);
						if(sum1>sum2)
								Dec="Y";
							else if(sum2>sum1)
								Dec="N";
					//	System.out.println(Dec);
						//System.out.println("a:"+A[i][n]);
						if(Dec.equals(A[i][n]))
							no_of_dec++;
						
					}
					
				System.out.println(no_of_dec);
					//System.out.println(m);
					
					float ac=(no_of_dec/(m-1f));
					acc=ac*100f;
					temp2=acc;
					for(int j=1;j<n;j++)
						w[j]+=0.00001;

						
				}
				System.out.println("accuracy="+temp2);
				for(int j=1;j<n;j++)
				
						System.out.println("weight for the Decision"+ j +"is:" + w[j]);
						
					
					
		}
		catch (IOException e)
		{
         System.out.println("Error: " +
                            e.getMessage());
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("enter name of your text file ");
	String filename=sc.next();
	DecisionFusion D=new DecisionFusion();
	D.load(filename);
	}
}
	
	