import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Input a starting number:");
        double StartingNumber = InputFromUser.nextDouble();

        System.out.println("Input a ending number:");
        double EndingNumber = InputFromUser.nextDouble();

        for ( ; StartingNumber <= EndingNumber ; StartingNumber++)
        {
            if ((StartingNumber % 3) == 0)
            {
                System.out.println("FIZZ");
            }

            else if ((StartingNumber % 5) == 0)
            {
                System.out.println("BUZZ");
            }

            else
            {
                System.out.println(StartingNumber);
            }
        }
    }
}