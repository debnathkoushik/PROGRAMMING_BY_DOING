import java.util.Scanner;

public class RefresherChallenge
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        System.out.print("Input user name: ");
        String Name = InputFromUser.next();

        int NumberOfTimes = checkName(Name);

        for (int i = 1; i <= NumberOfTimes; i++)
        {
            System.out.println(Name);
        }
    }

    public static int checkName(String Name)
    {
        if (Name.equals("Mitchell"))
        {
            return 5;
        }

        return 10;
    }
}