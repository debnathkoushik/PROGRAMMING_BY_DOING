import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
    public static void main(String args[])
    {
        Random RandomNumber = new  Random();
        int number = 1 + RandomNumber.nextInt(3);

        System.out.println("Which one is the ace among 1, 2 and 3?");
        Scanner InputFromUser = new Scanner(System.in);
        int answer = InputFromUser.nextInt();

        if (answer >= 1 && answer <= 3)
        {
            if (answer == number)
            {
                System.out.println("You got it right!");
            }
        
            else
            {
                System.out.println("Better luck next time!");
            }
        }

        else
        {
            System.out.println("Read carefully.");
        }
    } 
}