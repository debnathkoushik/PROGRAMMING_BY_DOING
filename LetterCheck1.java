import java.util.Scanner;

public class LetterCheck1
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Input a message:");
        String message = InputFromUser.nextLine();

        int MessageLength = message.length(); 

        int StartingNumber = 0;
        int count = 0;
        
        for ( ; StartingNumber < MessageLength ; StartingNumber++)
        {
            if (message.charAt(StartingNumber) == 'A' || message.charAt(StartingNumber) == 'a')
            {
                count++;
            }
        }

        System.out.println("\nYour message contains the letter 'a' " + count + " times. Isn't that interesting?");
    }
}