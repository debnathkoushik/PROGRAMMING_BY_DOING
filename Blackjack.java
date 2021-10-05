import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        Random RandomNumber = new Random();

        System.out.println("LETS PLAY BLACKJACK");
        System.out.println("\n");

        System.out.print("ENTER YOUR FIRST NUMBER: ");
        int FirstNumberUser = InputFromUser.nextInt();
        while (FirstNumberUser < 2 || FirstNumberUser > 11)
        {
            System.out.print("AGAIN ENTER YOUR FIRST NUMBER : ");
            FirstNumberUser = InputFromUser.nextInt();
        }

        System.out.print("NOW ENTER YOUR SECOND NUMBER: ");
        int SecondNumberUser = InputFromUser.nextInt();
        while (SecondNumberUser < 2 || SecondNumberUser > 11)
        {
            System.out.print("AGAIN ENTER YOUR SECOND NUMBER : ");
            SecondNumberUser = InputFromUser.nextInt();
        }

        int SumOfUser = FirstNumberUser + SecondNumberUser;

        System.out.print("DEALER ENTERED ITS FIRST NUMBER: ");
        int FirstNumberDealer = 2 + RandomNumber.nextInt(10);

        System.out.print("DEALER ENTERED ITS SECOND NUMBER: ");
        int SecondNumberDealer = 2 + RandomNumber.nextInt(10);

        int SumOfDealer = FirstNumberDealer + SecondNumberDealer;
        
        System.out.println("The dealer has a " + FirstNumberDealer + " showing, and a hidden card.");
        System.out.print("You get a " + FirstNumberUser + " and a " + SecondNumberUser + ". Your total is " + SumOfUser + ".");
        
        if (SumOfUser > 21)
        {
            System.out.println("USER GOT BUSTED! DEALER WINS!!!");
        }

        else
        {

        }
    }
}