import java.util.Scanner;
import java.util.Random;

public class RandomNumber
{
    public static void main(String args[])
    {
        Random ARandomNumber = new Random();
        int number = 1 + ARandomNumber.nextInt(100);

        System.out.println("Guess a number in between \" 1 to 100\" :");
        Scanner InputFromUser = new Scanner(System.in);
        int GuessedNumber = InputFromUser.nextInt();

        if (GuessedNumber == number)
        {
            System.out.println("You got it right!");
        }

        else
        {
            System.out.println("The number was " + number + ". Better luck next time.");
        }
    }
}