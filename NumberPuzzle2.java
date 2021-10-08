import java.util.Scanner;

public class NumberPuzzle2
{
    public static void main(String args[])
    {
        do
        {
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10 \n2) Find two digit number minus number reversed which equals sum of digits \nPRESS ANY NUMBER OTHER THAN 1 AND 2 TO QUIT!");

            Scanner InputFromUser = new Scanner(System.in);
            int choice = InputFromUser.nextInt();

            if (choice == 1)
            {
                TwoDigitNumbers();
            }

            else if (choice == 2)
            {
                reverseNumber();
            }

            else
            {
                System.exit(0);
            }
        }

        while (true);
    }

    public static void TwoDigitNumbers()
    {
        for (int i = 10; i <= 56; i++)
        {
            int FirstNumber = i / 10;
            int SecondNumber = i % 10;

            if (FirstNumber + SecondNumber > 10)
            {
                System.out.println(i);
            }
        }

        System.out.println();
    }

    public static void reverseNumber()
    {
        System.out.println("The numbers are:");
        for (int i = 10; i <= 56; i++)
        {
            int FirstNumber = i / 10;
            int SecondNumber = i % 10;

            int ReversedNumber = (SecondNumber * 10 + FirstNumber);

            if ( (FirstNumber + SecondNumber) == (i - ReversedNumber))
            {
                System.out.println(i);
            }
        }

        System.out.println();
    }
}