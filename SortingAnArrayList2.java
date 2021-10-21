import java.util.*;

public class SortingAnArrayList2
{
    public static void main(String args[])
    {
        ArrayList <String> list_1 = new ArrayList <String>();

        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Enter total number of inputs: ");
        int number = InputFromUser.nextInt();

        String items = "";

        for (int i = 0; i < number; i++)
        {
            items = InputFromUser.next();
            list_1.add(items);
        }
        System.out.println("before: " + list_1);

        for (int i = 0; i < list_1.size(); i++)
        {
            for (int j = i + 1; j < list_1.size(); j++)
            {
                if ( list_1.get(i).compareTo( list_1.get(j) ) > 0)
                {
                    swap(list_1,  i, j);
                }
                System.out.println(i + "," + j + list_1);
            }
        }
        
        System.out.println("after: " + list_1);
        
    }

    public static void swap(ArrayList <String> list_1, int i, int j)
    {
            String temp = list_1.get(i);
            list_1.set(i, list_1.get(j));
            list_1.set(j, temp);
    }
}