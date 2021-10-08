import java.util.Scanner;

import java.lang.Math;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double FirstInput, SecondInput, Result = 0;
		String Operator;

		do
		{
			System.out.println("Which mathemaitcal operation you want to perform?");
			System.out.print("> ");
			Operator = keyboard.next();
            
            if (Operator.equals("!"))
            {
                System.out.print("Enter the number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }
                
                else
                {
                    Result = 1;

                    for ( ; FirstInput > 0; FirstInput--)
                    {
                        Result *= FirstInput; 
                    }
                    
                    System.out.println(Result);
                }
            }

            else if (Operator.equals("root"))
            {
                System.out.print("Enter the number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }
                
                else
                {
                    Result = Math.sqrt(FirstInput);

                    System.out.println(Result);
                }
            }

            else if (Operator.equals("negation"))
			{
                System.out.print("Enter the number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }
                
                else
                {
                    Result = (-1 * FirstInput);

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("+") )
            {
                System.out.print("Enter the first number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the second number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = FirstInput + SecondInput;

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("-") )
            {
                System.out.print("Enter the first number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the second number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = FirstInput - SecondInput;

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("*") )
            {
                System.out.print("Enter the first number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the second number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = FirstInput * SecondInput;

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("/") )
            {
                System.out.print("Enter the first number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the second number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = FirstInput + SecondInput;

                    System.out.println(Result);
                }
            }
                
            else if ( Operator.equals("^") )
            {
                System.out.print("Enter the first number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the power number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = Math.pow(FirstInput, SecondInput);

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("%") )
            {
                System.out.print("Enter the dividend number: ");
                FirstInput  = keyboard.nextDouble();

                if (FirstInput == 0 )
                {
                    System.out.println("BYE!");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter the divisor number: ");
                    SecondInput  = keyboard.nextDouble();

                    Result = (FirstInput % SecondInput);

                    System.out.println(Result);
                }
            }

            else if ( Operator.equals("trigonometric") )
            {
                System.out.print("Enter the trigonometric function: ");
                String choice  = keyboard.next();    

                if (choice.equals("sin"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = Math.sin(FirstInput);
                    System.out.println(Result);
                }

                else if (choice.equals("cos"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = Math.cos(FirstInput);
                    System.out.println(Result);
                }

                else if (choice.equals("tan"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = Math.tan(FirstInput);
                    System.out.println(Result);
                }

                else if (choice.equals("cot"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = 1 / Math.tan(FirstInput);
                    System.out.println(Result);
                }

                else if (choice.equals("cos"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = 1 / Math.sin(FirstInput);
                    System.out.println(Result);
                }

                else if (choice.equals("sec"))
                {
                    System.out.print("Enter the number: ");
                    FirstInput  = keyboard.nextDouble();
                    
                    Result = 1 / Math.cos(FirstInput);
                    System.out.println(Result);
                }
            }
                
            else
            {
				System.out.println("Undefined operator: '" + Operator + "'.");
				Result = 0;

                System.out.println(Result);
			}

		}
        
        while ( true );
	}
}
