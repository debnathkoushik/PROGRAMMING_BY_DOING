import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
        char choice = 'X';
        int row_choice = 0;
        int column_choice = 0;
        while(true)
        {
           
            row_choice = keyboard.nextInt();
            column_choice = keyboard.nextInt();
            displayBoard2(row_choice, column_choice, choice);
        }

	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int row=0; row<3; row++ )
			for ( int column=0; column<3; column++ )
				board[row][column] = ' ';
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


	public static void displayBoard2(int row_choice, int column_choice, char choice)
	{
		for ( int row=0; row<3; row++ )
		{
			System.out.print("\t"+row+" ");
			for ( int column=0; column<3; column++ )
			{
				if (row_choice == row && column_choice == column)
                {
                    board[row][column] = choice;
                    System.out.print( board[row][column] );
                }

                else
                {
                    board[row][column] = ' ';
                    System.out.print( board[row][column] );
                }
			}
            System.out.println();
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}