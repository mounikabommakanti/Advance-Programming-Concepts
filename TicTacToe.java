import java.util.Scanner;

public class TicTacToe
{
	//Name :Mounika Bommakanti, Course:MCIS 5103 ADV PRG CONCEPTS ,Section:034, Student number :999992538
	private static char[][] board = new char[3][3];
	public static Scanner keyboard = new Scanner(System.in);
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
		displayBoard2();
		player1();
		
		//player2();

	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] =' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
	
	public static void player1()
	{
		boolean b=true;
		while(b)
		{
		char ch='O';
		System.out.println("O,choose your location (row,col):");
		int  r=keyboard.nextInt();
		 int c=keyboard.nextInt();
		
		if((r<0||r>2)||(c<0||c>2))
		{
			System.out.println("position is invalid,enter right position");
			
		}
		else if(board[r][c]!=' ')
		{
			System.out.println("this place is already occupied by the other player,enter in other place");
			
			
		}
		else{
			board[r][c]=ch;
			displayBoard2();
			boolean t=checkifwon(board[r][c],r,c);
			System.out.println(t);
			if(t)
				System.out.println("player O has won");
			else
			{	boolean bo=isboardfull();
				if(bo)
				System.out.println("game is tie");
				else
				player2();

			}

			b=false;
			
			}
		}
	}
	public static void player2()
	{
		boolean b=true;
		while(b)
		{
		char ch='X';
		System.out.println("X,choose your location (row,col):");
		int  r=keyboard.nextInt();
		 int c=keyboard.nextInt();
		if((r<0||r>2)||(c<0||c>2))
			System.out.println("position is invalid,enter right position");
		else if(board[r][c]!=' ')
		{
			
			System.out.println("this place is already occupied by the other player,enter in other place");
			break;
		}
		else
		{
			board[r][c]=ch;
		displayBoard2();
		boolean t =checkifwon(board[r][c],r,c);
		if(t)
		System.out.println("player X has won");
		else
		{
			boolean boo=isboardfull();
			if(boo)
				System.out.println("game is tie");
			else
				player1();
		}
		b=false;
		}
		}
	}
	public static boolean checkifwon(char ch,int r ,int c)
	{
		boolean v=false;
		if(ch=='O'||ch=='X')
		{
			if( r==0)
			{
				if((board[r][c]==board[r+1][c])&&(board[r+1][c]==board[r+2][c]))
					v=true;
				else if( r==0 &&c==0)
				{
					
					if((board[r][c]==board[r][c+1])&&(board[r][c+1]==board[r][c+2])
						||(board[r][c]==board[r+1][c+1])&&(board[r+1][c+1]==board[r+2][c+2]))
						v=true;
				}
				else if(r==0&&c==1)
				{
					if((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c+1]))
						v=true;
				}
				else if(r==0&&c==2)
				{
					if((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c-2]))
						v=true;
				}
			}
			else if(r==1)
			{
				if((board[r][c]==board[r-1][c])&&(board[r-1][c]==board[r+1][c]))
					v=true;
				else if(r==1&&c==0)
				{
			
					if((board[r][c]==board[r-1][c])&&(board[r-1][c]==board[r+1][c]))
						v=true;
				}
				else if(r==1&&c==1)
				{
					if(((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c+2]))
					||((board[r][c]==board[r-1][c+1])&&(board[r-1][c+1]==board[r+1][c-1]))
					||((board[r][c]==board[r+1][c+1])&&(board[r+1][c+1]==board[r-1][c-1])))
						v=true;
				}
				else if(r==1&&c==2)
				{
					if ((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c-2]))
						v=true;
				}
			}
			else if(r==2)
			{
				if((board[r][c]==board[r-1][c])&&(board[r-1][c]==board[r-2][c]))
					v=true;
				else if(r==2&&c==0)
				{ 
					if(((board[r][c]==board[r][c+1])&&(board[r][c+1]==board[r][c+2]))||
						((board[r][c]==board[r-1][c+1])&&(board[r-1][c+1]==board[r-2][c+2])))
							v=true;
				}
				else if(r==2&&c==1)
				{
					if((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c+1]))
						v=true;
				}
				else if(r==2&&c==2)
				{	
				if(((board[r][c]==board[r][c-1])&&(board[r][c-1]==board[r][c-2]))||
					((board[r][c]==board[r-1][c-1])&&(board[r-1][c-1]==board[r-2][c-2])))
						v=true;
					
				}
			}
		else
				v=false;
		}		
		return v;
			
	}	
	public static boolean isboardfull()
	{
		boolean b=false;
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=2;c++)
			{
				if(board[r][c]!=' ')
					b=true ;
				else
					b=false;
									
			}
		}
	return b;
	}
	
}