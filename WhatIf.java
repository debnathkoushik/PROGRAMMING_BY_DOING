import java.util.Scanner;

public class WhatIf
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        int numberOfPeople,numberOfCats, numberOfDogs;

        System.out.println("Enter number of people:");
        numberOfPeople = InputFromUser.nextInt();

        System.out.println("Enter number of cats:");
        numberOfCats = InputFromUser.nextInt();

        System.out.println("Enter number of dogs:");
        numberOfDogs = InputFromUser.nextInt();

        if (numberOfPeople < numberOfCats)
        {
            System.out.println("Too many cats! The world is doomed!");
        }

        if (numberOfPeople > numberOfCats)
        {
            System.out.println("Not many cats!  The world is saved!");
        }

        if (numberOfPeople < numberOfDogs)
        {
            System.out.println("The world is drooled on!");
        }

        if (numberOfPeople > numberOfDogs)
        {
            System.out.println("The world is dry!");
        }

        numberOfDogs += 5;
        
        if(numberOfPeople >= numberOfDogs)
        {
            System.out.println("People are greater than or equal to dogs.");
        }

        if(numberOfPeople <= numberOfDogs)
        {
            System.out.println("People are less than or equal to dogs.");
        }

        if(numberOfPeople == numberOfDogs)
        {
            System.out.println("People are dogs.");
        }
    }
}