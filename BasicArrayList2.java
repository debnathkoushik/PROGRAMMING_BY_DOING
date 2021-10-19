import java.util.*;

public class BasicArrayList2
{
    public static void main(String args[])
    {
        ArrayList <String> list = new ArrayList <String>();

        Scanner InputFromUser = new Scanner(System.in);

        String items = "";

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter value for slot " + (i + 1) + ": ");
            items = InputFromUser.next();
            list.add(items);
        }
        
        System.out.println("DIspalying all the inputs!");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}