import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.print("Input a number to start: ");
        int StartNumber = InputFromUser.nextInt();

        System.out.print("Input a number upto which you want to count: ");
        int EndNumber = InputFromUser.nextInt();

        System.out.print("Input a number by which it needs to be incremented: ");
        int IncrementNumber = InputFromUser.nextInt();
        

        for ( ; StartNumber <= EndNumber; StartNumber = StartNumber + IncrementNumber)
        {
            System.out.println(StartNumber);
        }
    }
}