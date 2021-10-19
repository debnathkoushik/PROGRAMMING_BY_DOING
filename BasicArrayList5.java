import java.util.*;

public class BasicArrayList5
{
    public static void main(String args[])
    {
        ArrayList <Integer> list_1 = new ArrayList <Integer>();
        ArrayList <Integer> list_2 = new ArrayList <Integer>();


        Scanner InputFromUser = new Scanner(System.in);
        Random random_number = new Random();

        System.out.println("Enter total number of inputs: ");
        int number = InputFromUser.nextInt();

        int items = 0;

        for (int i = 0; i < number; i++)
        {
            items = 1 + random_number.nextInt(100);
            list_1.add(items);
        }
        
        System.out.println("Copying all the random inputs!");
        for (int i = 0; i < list_1.size(); i++)
        {
            if (i == (number - 1) )
            {
                list_2.add(-7);
            }
            else
            {
                int temp = list_1.get(i);
                list_2.add(temp);
            }
        }
        
        //printing using the object
        System.out.println("Array 1: " + list_1);
        System.out.println("Array 2: " + list_2);
    }
}