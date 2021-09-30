import java.util.Scanner;

public class CountingByHalves
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.print("Input a number to start: ");
        double StartNumber = InputFromUser.nextDouble();

        System.out.print("Input a number upto which you want to count: ");
        double EndNumber = InputFromUser.nextDouble();

        System.out.print("Input a number by which it needs to be incremented: ");
        double IncrementNumber = InputFromUser.nextDouble();
        

        for ( ; StartNumber <= EndNumber; StartNumber = StartNumber + IncrementNumber)
        {
            System.out.println(StartNumber);
        }
    }
}