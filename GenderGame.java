import java.util.Scanner;

public class GenderGame
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("What's your first name?");
        String FirstName = InputFromUser.next();

        System.out.println("What's your last name?");
        String LastName = InputFromUser.next();

        System.out.println("Are you a male or female?");
        String gender = InputFromUser.next();

        System.out.println("What's your age?");
        int age = InputFromUser.nextInt();

        String GenderMale = "male";
        String GenderFemale = "female";
        String yes = "yes";

        if (gender.equals(GenderMale))
        {
            if (age >= 20)
            {
                System.out.println("Mr. " + FirstName + " " + LastName);
            }

            else
            {
                System.out.println(FirstName + " " + LastName);
            }
        }

        else if (gender.equals(GenderFemale))
        {
            if (age >= 20)
            {
               System.out.println("Are you married?");
               String answer = InputFromUser.next();

               if (answer.equals(yes))
               {
                   System.out.println("Mrs. " + FirstName + " " + LastName);
               }

               else
               {
                   System.out.println("Ms. " + FirstName + " " + LastName);
               }
            }

            else
            {
                System.out.println(FirstName + " " + LastName);
            }
        }

        else
        {
            System.out.println("Try again");
        }
    }
}