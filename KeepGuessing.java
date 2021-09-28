import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int SecretNumber = 1 + RandomNumber.nextInt(10);

        System.out.println("Guess a number betweeen \"1\" to \"10\" :");
        Scanner InputFromUser = new Scanner(System.in);
        int answer = InputFromUser.nextInt();
        

        while(answer != SecretNumber)
        {
            System.out.println("TRY AGAIN! The number was " + SecretNumber);
            System.out.println("\n");

            SecretNumber = 1 + RandomNumber.nextInt(10);
            
            System.out.println("Guess a number betweeen \"1\" to \"10\" :");

            answer = InputFromUser.nextInt();            
        }

        System.out.println("YOU GOT IT RIGHT!");
    }
}