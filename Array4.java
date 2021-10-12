import java.util.Random;

public class Array4
{
    public static void main(String args[])
    {
        int array[] = new int[1000];
        
        Random random_number = new Random();

        for (int i = 0; i <= 999; i++)
        {
            array[i] = 10 + random_number.nextInt(90);
            System.out.print(array[i] + "  ");
        }
    }
}