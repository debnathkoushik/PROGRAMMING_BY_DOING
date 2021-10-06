public class EvennessFunction
{
    public static void main(String args[])
    {
        for (int n = 1; n <= 20; n++)
        {
            if (n % 2 == 0)
            {
                if (n % 3 == 0)
                {
                    System.out.println(n + " <=");
                    System.out.println(isDivisibleBy3(n));
                    System.out.println(isEven(n));
                    System.out.println();
                }

                else
                {
                    System.out.println(n + " <");
                    System.out.println(isEven(n));
                    System.out.println();
                }
            }

            else if (n % 3 == 0)
            {
                System.out.println(n + "=");
                System.out.println(isDivisibleBy3(n));
                System.out.println();
            }

            else
            {
                System.out.println(n);
                System.out.println();
            }
        }

    }

    public static boolean isEven( int n )
    {
            if (n % 2 == 0)
            {
                return true;
            }

            else
            {
                return false;
            }
    }

    public static boolean isDivisibleBy3( int n )
    {
        if (n % 3 == 0)
            {
                return true;
            }

            else
            {
                return false;
            }
    }
}