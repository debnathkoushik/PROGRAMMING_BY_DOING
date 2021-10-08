public class IndividualNumber
{
    public static void main(String args[])
    {
        System.out.println("The combinations are: ");

        for (int x = 10; x < 100; x++)
        {
            int FirstNumber = x / 10;
            int SecondNumber = x % 10;

            System.out.println( x + " , " + FirstNumber + " + " + SecondNumber + " = " + (FirstNumber + SecondNumber) );
        }
    }
}