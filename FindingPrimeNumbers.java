import java.util.Scanner;

public class FindingPrimeNumbers
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        System.out.println("Input the last integer");
        System.out.println("upto which you want to find the list of prime numbers");
        int LastNumber = InputFromUser.nextInt();

        int Factor = 0;

        for (int FirstNumber = 2; FirstNumber < LastNumber; FirstNumber++)
        {
            Factor = isPrime( FirstNumber, LastNumber, Factor);
        }

        if (Factor > 1)
        {
            System.out.println(LastNumber + " is not a prime number.");
        }

        else
        {
            System.out.println(LastNumber + " is a prime number.");
        }
    }

    public static int isPrime( int FirstNumber, int LastNumber, int Factor)
    {
        if (LastNumber % FirstNumber == 0)
        {
           return Factor ++;
        }

        else
        {
            return Factor;
        }
    }
}