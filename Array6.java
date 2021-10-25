import java.util.Scanner;
import java.util.Random;

public class Array6
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FirstName = InputFromUser.next();
        String LastName = InputFromUser.next();

        Random random_number = new Random();

        int array_1[] = new int[10];

        for (int i = 1; i <= 5; i++)
        {
            array_1[i] = 1 + random_number.nextInt(100);

        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++)
        {
            array_2[i] = array_1[i];
            System.out.println("At position " + i + " the number is " + array_1[i]);
        }
    }
}