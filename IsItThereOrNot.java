import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot
{
    public static void main(String args[])
    {
        Random random_number = new Random();

        int array_1[] = new int[10];
        int count = 0;

        System.out.println("The numbers are: ");

        for (int i = 0; i < 10; i++)
        {
            array_1[i] = 1 + random_number.nextInt(100);

            System.out.print(array_1[i] + "  ");
        }

        System.out.println("\n");

        System.out.println("Enter the number you want to search: ");
        Scanner InputFromUser = new Scanner(System.in);
        int number = InputFromUser.nextInt();

        for (int i = 0; i < 10; i++)
        {
            if (number == array_1[i])
            {
               count++;
            }
        }
        
        if (count > 0)
        {
            System.out.println("The number " + number + " is present " + count + " time/times");
        }

        else
        {
            System.out.println("The number " + number + " is not present");
        }
    }
}