import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame
{
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int SecretNumber = 1 + RandomNumber.nextInt(100);

        System.out.println("Try to guess a number in between \" 1 to 100 \" :");
        Scanner InputFromUser = new Scanner(System.in);
        int number = InputFromUser.nextInt();

        if (number == SecretNumber)
        {
            System.out.println("CAN YOU PREDICT MY FUTURE? As you have guessed it right!");
        }

        else
        {
            System.out.println("The number I guessed is : " + SecretNumber + ". Better luck next time.");
        }
    }
}