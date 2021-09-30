import java.util.Scanner;

public class AddingUsingForLoop
{
    public static void main(String[] args)
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.print("INPUT A NUMBER UPTO WHICH YOU WANT THE SUM: ");
        double EndingNumber = InputFromUser.nextDouble();
        double sum = 0.0;
        double StartingNumber = 1.0;

        for ( ; StartingNumber <= EndingNumber; StartingNumber++)
        {
            sum = sum + StartingNumber;
            System.out.println("THE SUM IS " + sum);
        }
        System.out.println("SO THE FINAL SUM IS " + sum);
    }
}