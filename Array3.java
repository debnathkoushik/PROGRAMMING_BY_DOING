import java.util.Random;

public class Array3
{   
    public static void main(String args[])
    {
        Random RandomNumber = new Random();
        int array[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            
            array[i] = 1 + RandomNumber.nextInt(100); 
            System.out.println("At position " + i + " the number is " + array[i]);
        }
    }
}