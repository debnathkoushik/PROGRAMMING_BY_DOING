import java.util.Random;

public class Array5
{
    public static void main(String args[])
    {
        Random random_number = new Random();

        int array_1[] = new int[10];
        int array_2[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            array_1[i] = 1 + random_number.nextInt(100);

            if(i == 9 )
            {
                System.out.println("At position " + i + " the number is " + -7);
            }
            else
                System.out.println("At position " + i + " the number is " + array_1[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++)
        {
            array_2[i] = array_1[i];
            System.out.println("At position " + i + " the number is " + array_1[i]);
        }
    }
}