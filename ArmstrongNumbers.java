public class ArmstrongNumbers
{
    public static void main(String args[])
    {
        System.out.println("The combination/s are: ");

        for (int x = 100; x < 1000; x++)
        {
            int FirstNumber = x / 100;
            int SecondNumber = (x % 100) / 10;
            int ThirdNumber = (x % 100) % 10;

            if ( ( Math.pow(FirstNumber, 3) + Math.pow(SecondNumber, 3) + Math.pow(ThirdNumber, 3) ) == x)
            System.out.println( x );
        }
    }
}