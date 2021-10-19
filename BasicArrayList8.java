import java.util.*;

public class BasicArrayList8
{
    public static void main(String args[])
    {
        ArrayList <Integer> list_1 = new ArrayList <Integer>();

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
        System.out.println("Array: " + list_1);
        
        System.out.print("Enter the number to search: ");
        int number_to_search_for = InputFromUser.nextInt();

        for (int i = 0; i < list_1.size(); i++)
        {
            if (number_to_search_for == list_1.get(i) )
            {
                System.out.println("The number " + number_to_search_for + " is available at slot " + (i + 1) );
                System.exit(0);
            }
        }

        System.out.println("The number " + number_to_search_for + " is not available.");
    }
}