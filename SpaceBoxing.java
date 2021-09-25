import java.util.Scanner;

public class SpaceBoxing
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        System.out.println("What's your weight on earth (in pounds)?");
        double weight = InputFromUser.nextDouble();

        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus " + "\n" +  "2. Mars " + "\n" + "3. Jupiter"
        + "\n" + "4. Saturn" + "\n" + "5. Uranus" + "\n" + "6. Neptune");

        System.out.println("Tell me on which planet do you want to fight?");
        int choice = InputFromUser.nextInt();

        if (choice == 1)
        {
            System.out.println("Your weight would be " + (weight = weight * 0.78) + " on that planet.");
        }

        else if (choice == 2)
        {
            System.out.println("Your weight would be " + (weight = weight * 0.39) + " on that planet.");
        }

        else if (choice == 3)
        {
            System.out.println("Your weight would be " + (weight = weight * 2.65) + " on that planet.");
        }

        else if (choice == 4)
        {
            System.out.println("Your weight would be " + (weight = weight * 1.17) + " on that planet.");
        }

        else if (choice == 5)
        {
            System.out.println("Your weight would be " + (weight = weight * 1.05) + " on that planet.");
        }

        else if (choice == 6)
        {
            System.out.println("Your weight would be " + (weight = weight * 1.23) + " on that planet.");
        }

        else
        {
            System.out.println("Please enter a valid number.");
        }
    }
}