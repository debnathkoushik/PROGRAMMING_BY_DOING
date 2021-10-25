import java.util.*;

public class BasicArrayList
{
    public static void main(String args[])
    {
        ArrayList <String> list = new ArrayList <String>();

        Scanner InputFromUser = new Scanner(System.in);

        String items = "K";

        // for (int i = 0; i < 10; i++)
        // {
            items = InputFromUser.next();
            list.add(items);
            String items2 = InputFromUser.next();

        // }
        System.out.println(list);
    }
}