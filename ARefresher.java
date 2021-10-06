import java.util.Scanner;

public class ARefresher
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        System.out.print("Input user name: ");
        String Name = InputFromUser.next();

        if (Name.equals("Roni"))
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i + ". Roni");
            }
        }

        else if (Name.equals("Mitchell"))
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i + ". Mitchell");
            }
        }

        else
        {
            System.out.println(Name);
        }
    }
}