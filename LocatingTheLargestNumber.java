import java.util.Random;
import java.util.Scanner;

public class LocatingTheLargestNumber
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

        System.out.println("Finding the largest number!");
        int number = array_1[0];
        int position = 1;

        for (int i = 1; i < 10; i++)
        {
            if (number <array_1[i])
            {
               number = array_1[i];
               position = i + 1;
            }
        }
        System.out.println("The largest number is " + number);
        System.out.println("Its present in slot number " + position);
    }
}