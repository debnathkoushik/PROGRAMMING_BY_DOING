import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c = 0;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

            if (a == 0 )
            {
                System.exit(0);
            }

            else
            {
                if ( op.equals("+") )
                {
                    c = a + b;
                }

                else if ( op.equals("-") )
                {
                    c = a - b;
                }

                else if ( op.equals("*") )
                {
                    c = a * b;
                }

                else if ( op.equals("/") )
                {
                    c = a / b;
                }
                
                else
                {
				    System.out.println("Undefined operator: '" + op + "'.");
				    c = 0;
			    }
            }   
			System.out.println(c);

		} while ( true );
	}
}
