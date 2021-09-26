import java.util.Scanner;

public class AgeMessage
{
    public static void main (String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("What's your age?");
        int age = InputFromUser.nextInt();

        if (age < 16)
        {
            System.out.println("You can't drive.");
        }

        else if (age >= 16 && age <= 17)
        {
            System.out.println("You can drive but not vote.");
        }

        else if (age >= 18 && age <= 24)
        {
            System.out.println("You can drive but not rent a car.");
        }

        else
        {
            System.out.println("You can do preety much anything.");
        }

    }
}