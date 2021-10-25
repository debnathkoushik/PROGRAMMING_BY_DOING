import java.util.*;

public class BasicArrayList3
{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList <Integer>();

        Random random_number = new Random();

        int items = 0;

        for (int i = 0; i < 10; i++)
        {
            items = 1 + random_number.nextInt(100);
            list.add(items);
        }
        
        System.out.println("Displaying all the random inputs!");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}