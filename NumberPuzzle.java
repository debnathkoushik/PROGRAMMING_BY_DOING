public class NumberPuzzle
{
    public static void main(String args[])
    {
        System.out.println("The combinations are: ");

        for (int x = 10; x < 60; x++)
        {
            for (int y = 10; y < 60; y++)
            {
               if (( x + y == 60 ) && (x - y == 14))
               {
                        System.out.println( "(" + x + ',' + y + ")" );
               }
            }
        }
    }
}