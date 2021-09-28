import java.util.Scanner;

public class PIN
{
    public static void main(String args[])
    {
        System.out.println("Create your PIN:");
        Scanner InputFromUser = new Scanner(System.in);
        int CreatePIN = InputFromUser.nextInt();

        System.out.println("Enter your PIN:");
        int EnterPIN = InputFromUser.nextInt();

        while (EnterPIN != CreatePIN)
        {
            System.out.println("TRY AGAIN!");

            System.out.println("Enter your PIN AGAIN:");
            EnterPIN = InputFromUser.nextInt();

        }

        System.out.println("ATTEMPT SUCCESSFUL!");
    }
}