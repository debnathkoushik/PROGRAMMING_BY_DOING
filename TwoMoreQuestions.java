import java.util.Scanner;

public class TwoMoreQuestions
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Does it belong \"inside\" or \"outside\" or \"both\" ?");
        String answer = InputFromUser.next();

        String option1 = "inside";
        String option2 = "outside";
        String option3 = "both";
        String option4 = "yes";

        if (answer.equals(option1))
        {
            System.out.println("Is it alive(answer in \"yes\" or \"no\" ) ?");
            answer = InputFromUser.next();

            if (answer.equals(option4))
            {
                System.out.println("houseplant");
            }

            else
            {
                System.out.println("shower curtain");
            }
        }

        else if (answer.equals(option2))
        {
            System.out.println("Is it alive(answer in \"yes\" or \"no\" ) ?");
            answer = InputFromUser.next();

            if (answer.equals(option4))
            {
                System.out.println("Its a bison.");
            }

            else
            {
                System.out.println("Its a billboard.");
            }
        }

        else if (answer.equals(option3))
        {
            System.out.println("Is it alive(answer in \"yes\" or \"no\" ) ?");
            answer = InputFromUser.next();

            if (answer.equals(option4))
            {
                System.out.println("Its a dog.");
            }

            else
            {
                System.out.println("Its a cellphone.");
            }
        }

        else
        {
            System.out.println("Read carefully");
        }
    }
}