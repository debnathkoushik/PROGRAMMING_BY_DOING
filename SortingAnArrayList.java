import java.util.*;

public class SortingAnArrayList
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
        System.out.println("before: " + list_1);

        for (int i = 0; i < list_1.size(); i++)
        {
            for (int j = 1; j < list_1.size(); j++)
            {
                if (list_1.get(i) > list_1.get(j))
                {
                    swap(list_1,  i, j);
                }
            }
        }
        
        System.out.println("after: " + list_1);
        
    }

    public static void swap(ArrayList <Integer> list_1, int i, int j)
    {
            int temp = list_1.get(i);
            list_1.set(i, list_1.get(j));
            list_1.set(j, temp);
    }
}