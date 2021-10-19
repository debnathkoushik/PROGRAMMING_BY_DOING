import java.util.*;

public class BasicArrayList4
{
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList <Integer>();

        Random random_number = new Random();

        int items = 0;

        for (int i = 0; i < 1000; i++)
        {
            items = 1 + random_number.nextInt(10);
            list.add(items);
        }
        
        System.out.println("Displaying all the random inputs!");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        //printing using the object
        System.out.println(list);
    }
}