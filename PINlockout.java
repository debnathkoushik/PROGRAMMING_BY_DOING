import java.util.Scanner;

public class PINlockout
{
    public static void main(String args[])
    {
        System.out.println("Set Password:");
        Scanner InputFromUser = new Scanner(System.in);
        String SetPassword = InputFromUser.nextLine();

        System.out.println("Input Password:");
        String InputPassword = InputFromUser.nextLine();
        int tries = 0;
        tries++;
        System.out.println(tries);

        while (InputPassword.compareTo(SetPassword) != 0 && tries < 3)
        {
            System.out.println("SORRY! TRY AGAIN!");
            System.out.println("\n");
            System.out.println("Input Password:");
            InputPassword = InputFromUser.nextLine();
            tries++;
        }

        if (InputPassword.compareTo(SetPassword) == 0)
        {
            System.out.println("PASSWORD MATCHED!");
        }

        else
        {
            System.out.println("MAXIMUM WRONG ATTEMPT REACHED!");
        }
    }
}