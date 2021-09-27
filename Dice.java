import java.util.Random;

public class Dice
{
    public static void main(String args[])
    {
        int sum = 0;

        for (int count = 1; count <= 2; count++)
        {
            Random RandomNumber = new Random();
            int number = 1 + RandomNumber.nextInt(6);

            System.out.println("ROLL NO. #" + count + ": " + number);
            sum = sum + number;
        }

        System.out.println(sum);
    }
}