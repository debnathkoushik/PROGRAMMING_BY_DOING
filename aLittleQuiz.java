import java.util.Scanner;

public class aLittleQuiz
{
    public static void main(String[] args)
    {
        Scanner InputFromUser = new Scanner(System.in);
        
        System.out.println("Are you ready for a quiz?" + "\n" + "Okay, here it comes!");
        System.out.println("\n");

        System.out.println("Q1) What is the capital of Alaska?" + "\n" + "1) Melbourne" + "\n" + "2) Anchorage" + "\n" + "3) Juneau");
        int choice1 = InputFromUser.nextInt();

        int count = 0;

        if (choice1 == 3)
        {
            System.out.println("That's right");
            count++;
        }

        else
        {
            System.out.println("Wrong");
        }

        System.out.println("Q2)  Can you store the value \"cat\" in a variable of type int?" + "\n" + "1) Yes" + "\n" + "2) No");
        int choice2 = InputFromUser.nextInt();

        if (choice2 == 2)
        {
            System.out.println("That,s right");
            count++;
        }
        else
        {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }

        System.out.println("Q2)  What is the result of 9+6/3?" + "\n" + "1) 5" + "\n" + "2) 11" + "\n" + "3) 15/3");
        int choice3 = InputFromUser.nextInt();

        if (choice3 == 2)
        {
            System.out.println("Good");
            count++;
        }

        else
        {
            System.out.println("Use BODMAS for calculation.");
        }

        System.out.println("So you got " + count + " out of 3 correct.");
    }
}