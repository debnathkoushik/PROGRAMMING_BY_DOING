import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int number = 1 + RandomNumber.nextInt(3);

        System.out.println("Guess the number which is in between 1-10 :");
        Scanner InputFromUser = new Scanner(System.in);
        int answer = InputFromUser.nextInt();

        int tries = 1;

        while (answer != number)
        {
            System.out.println("TRY AGAIN!");
            System.out.println("\n");
            System.out.println("Guess the number:");

            number = 1 + RandomNumber.nextInt(10);
            answer = InputFromUser.nextInt();
            tries++;
        }

        if (answer == number)
        {
            System.out.println("YOU GOT IT RIGHT IN " + tries + " TRY/TRIES!");
        }

        else
        {
            System.out.println("YOU RAN OUT OF TRIES");
        }
    }
}