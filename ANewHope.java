public class ANewHope
{
    public static void main(String args[])
    {
        System.out.println("The combination/s are: ");

        for (int i = 1; i < 45; i++)
        {
            for (int j = 1; j < 45; j++)
            {
                for (int k = 1; k < 45; k++)
                {
                    for (int l = 1; l < 45; l++)
                    {
                        if ( ( i + j + k + l == 45) &&
                            (i + 2) == (j - 2) &&
                            (j - 2 ) == (k * 2) &&
                            (k * 2) == (l / 2) )
                        {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }   
                    }   
                }
            }   
        }
    }
}