import java.util.Scanner;

public class AskingTwoQuestions
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");

        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        String choice1 = InputFromUser.next();

        String option1 = "animal";
        String option2 = "vegetable";
        String option3 = "mineral";
        String option4 = "yes";

        if (choice1.equals(option1))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String choice2 = InputFromUser.next();

            if (choice2.equals(option4))
            {
                System.out.println("You might be thinking about moose!");
            }

            else
            {
                System.out.println("Now don't say that you aren't thinking about squirrel.");
            }
        }
        
        else if (choice1.equals(option2))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String choice2 = InputFromUser.next();
            
            if(choice1.equals(option4))
            {
                System.out.println("You're definitely thinking about watermelon");
            }

            else
            {
                System.out.println("Now don't say you're not thinking about carrot");
            }
        }

        else if (choice1.equals(option3))
        {
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String choice2 = InputFromUser.next();

            if(choice2.equals(option4))
            {
                System.out.println("Camaro it is!");
            }

            else
            {
                System.out.println("you're thinking about paperclip");
            }
        }
        
        else
        {
            System.out.println("Please read question carefully.");
        }
    }
}