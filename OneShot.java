import java.util.Random;
import java.util.Scanner;

public class OneShot
{
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int SecretNumber = 1 + RandomNumber.nextInt(100);

        System.out.println("Guess a number inbetween \" 1 to 100\" ");
        Scanner InputFromUser = new Scanner(System.in);
        int answer = InputFromUser.nextInt();

        if (answer >= 0 && answer <= 100)
        {
            if (answer == SecretNumber)
            {
                System.out.println("You got it right!");
            }

            else if (answer > SecretNumber)
            {
                System.out.println("Its greater!");
            }

            else
            {
                System.out.println("Its smaller!");
            }
        }

        else
        {
            System.out.println("Read carefully.");
        }
    }
}