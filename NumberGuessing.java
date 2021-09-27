import java.util.Scanner;

public class NumberGuessing
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Guess a number.");
        int SECRET_NUMBER = 50;

        int number = InputFromUser.nextInt();

        if (number == SECRET_NUMBER)
        {
            System.out.println("You guessed it right.");
        }

        else
        {
            System.out.println("Try again. Better luck next time.");
        }
    } 
}