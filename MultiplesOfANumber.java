import java.util.Scanner;

public class MultiplesOfANumber
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        double number = InputFromUser.nextInt();

        int StartingNumber = 1;
        int EndingNumber = 12;
        for ( ; StartingNumber <= EndingNumber; StartingNumber++)
        {
            System.out.println(number + " * " + StartingNumber + " = " + (number * StartingNumber));
        }
    }
}