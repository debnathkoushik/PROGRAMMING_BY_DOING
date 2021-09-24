import java.util.Scanner;

public class HowOldAreYou
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Hey, what's your name?");
        String name = InputFromUser.next();
        
        System.out.println("Ok, " + name + ", how old are you?");
        int age = InputFromUser.nextInt();
        
        if (age < 16)
        {
            System.out.println("You can't drive.");
        }

        if (age < 18)
        {
            System.out.println("You can't vote.");
        }

        if (age < 25)
        {
            System.out.println("You can't rent a car.");
        }

        if (age >= 25)
        {
            System.out.println("You can do anything that's legal.");
        }
    }    
}