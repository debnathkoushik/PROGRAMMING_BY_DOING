import java.util.Scanner;

public class NoticingEvenNumbers
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
            if ((StartingNumber % 2) == 0)
            {
                System.out.println("EVEN NUMBER: " + StartingNumber);
            }

            else
            {
                System.out.println("ODD NUMBER: " + StartingNumber);
            }
        }
    }
}