import java.util.*;

public class BasicArrayList10
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
        
        int highest_number = list_1.get(0);
        int position = 1;

        for (int i = 1; i < list_1.size(); i++)
        {
            if (highest_number < list_1.get(i) )
            {
                highest_number = list_1.get(i);
                position = i + 1;
            }
        }

        System.out.println("The highest number is " + highest_number + " and is present at slot " + position);
    }
}