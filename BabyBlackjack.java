import java.util.Scanner;

public class BabyBlackjack
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Choose player's first number between 1-10");
        int PlayerCard1 = InputFromUser.nextInt();

        System.out.println("Choose player's second number between 1-10");
        int PlayerCard2 = InputFromUser.nextInt();

        int SumOfPlayer = PlayerCard1 + PlayerCard2;

        System.out.println("Choose dealer's first number between 1-10");
        int DealerCard1 = InputFromUser.nextInt();

        System.out.println("Choose dealer's second number between 1-10");
        int DealerCard2 = InputFromUser.nextInt();

        int SumOfDealer = DealerCard1 + DealerCard2;

        while (SumOfDealer == SumOfPlayer)
        {
            System.out.println("Again choose your first number between 1-10");
            PlayerCard1 = InputFromUser.nextInt();

            System.out.println("Again choose your second number between 1-10");
            PlayerCard2 = InputFromUser.nextInt();

            SumOfPlayer = PlayerCard1 + PlayerCard2;

            System.out.println("Again choose dealer's first number between 1-10");
            DealerCard1 = InputFromUser.nextInt();

            System.out.println("Again choose dealer's second number between 1-10");
            DealerCard2 = InputFromUser.nextInt();

            SumOfDealer = DealerCard1 + DealerCard2;
        }

        if (SumOfPlayer > SumOfDealer)
        {
            System.out.println("PLAYER WINS!");
        }

        else
        {
            System.out.println("DEALER WINS!");
        }
    }
} 