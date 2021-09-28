import java.util.Random;
import java.util.Scanner;

public class HiLoGame
{
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int SecretNumber = 1 + RandomNumber.nextInt(10);

        System.out.println("Guess the number:");
        Scanner InputFromUser = new Scanner(System.in);
        int number = InputFromUser.nextInt();

        int tries = 1;
        tries++;

        while (number != SecretNumber && tries <= 7)
        {
            System.out.println("SORRY! TRY AGAIN!");
            System.out.println("\n");
            System.out.println("Guess the number:");
            number = InputFromUser.nextInt();
            tries++;
        }

        if (number == SecretNumber)
        {
            System.out.println("BOTH THE NUMBERS MATCHED!");
        }

        else
        {
            System.out.println("MAXIMUM WRONG ATTEMPT REACHED!");
        }
    }
}