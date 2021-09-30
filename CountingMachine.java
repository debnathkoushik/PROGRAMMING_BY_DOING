import java.util.Scanner;

public class CountingMachine
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.print("Input a number upto which you want to count: ");
        int number = InputFromUser.nextInt();
        int count = 0;

        for (int n = 0; n <= number; n++)
        {
            System.out.println(n);
        }
    }
}