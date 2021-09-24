import java.util.Scanner;

public class ElseAndIf
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        int numberOfPeople, numberOfCars, numberOfBuses;
         
        System.out.println("Enter number of people:");
        numberOfPeople = InputFromUser.nextInt();
        
        System.out.println("Enter number of cars:");
        numberOfCars = InputFromUser.nextInt();

        System.out.println("Enter number of buses:");
        numberOfBuses = InputFromUser.nextInt();

        if (numberOfCars > numberOfPeople)
        {
            System.out.println("We should take cars.");
        }

        else if (numberOfCars < numberOfPeople)
        {
            System.out.println("We shouldn't take cars.");
        }

        else
        {
            System.out.println("We can't decide.");
        }

        if (numberOfBuses > numberOfCars)
        {
            System.out.println("That's too many buses.");
        }

        else if (numberOfBuses < numberOfCars)
        {
            System.out.println("Maybe we could take buses.");
        }

        else
        {
            System.out.println("We still can't decide.");
        }

        if (numberOfPeople > numberOfBuses)
        {
            System.out.println("All right, lets just take buses.");
        }

        else
        {
            System.out.println("Fine, lets stay home then.");
        }
    }
}