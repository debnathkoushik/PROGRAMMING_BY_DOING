import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Adventure
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Choose a name :");
        System.out.println("kitchen or bedroom ?");

        String choice1 = "kitchen";
        String choice2 = "bedroom";
        String choice3 = "eat";
        String choice4 = "drink";
        String choice5 = "sleep";
        String choice6 = "sit";
        String choice7 = "egg";
        String choice8 = "burger";
        String choice9 = "water";
        String choice10 = "juice";
        String choice11 = "bed";
        String choice12 = "floor";
        String choice13 = "sofa";
        String choice14 = "chair";

        String answer = InputFromUser.next();

        if(answer.equals(choice1))
        {
            System.out.println("Choose in between \"eat\" and \"drink\" ");
            answer = InputFromUser.next();

            if (answer.equals(choice3))
            {
                System.out.println("Choose in between \"egg\" and \"burger\" ");
                answer = InputFromUser.next();
                
                if (answer.equals(choice7))
                {
                    System.out.println("Cook and have it");
                }

                else if (answer.equals(choice8))
                {
                    System.out.println("Microwave and have it");
                }

                else
                {
                    System.out.println("Read carefully");
                }
            }

            else if (answer.equals(choice4))
            {
                System.out.println("Choose in between \"water\" and \"juice\" ");
                answer = InputFromUser.next();

                if (answer.equals(choice9))
                {
                    System.out.println("There are bottles available in the fridge as well as on the table.");
                }

                else if (answer.equals(choice10))
                {
                    System.out.println("It's in the fridge");
                }

                else
                {
                    System.out.println("Read carefully");
                }
            }

            else
            {
                System.out.println("Read carefully");
            }
        }

        else if (answer.equals(choice2))
        {
            System.out.println("Choose in between \"sleep\" and \"sit\" ");
            answer = InputFromUser.next();

            if (answer.equals(choice5))
            {
                System.out.println("Choose in between \"bed\" and \"floor\" ");
                answer = InputFromUser.next();

                if (answer.equals(choice11))
                {
                    System.out.println("sleep well");
                }

                else if (answer.equals(choice12))
                {
                    System.out.println("Take the mat from the cupborad");
                }

                else
                {
                    System.out.println("Read carefully");
                }
            }

            else if (answer.equals(choice6))
            {
                System.out.println("Choose in between \"sofa\" and \"chair\" ");
                answer = InputFromUser.next();

                if (answer.equals(choice13))
                {
                    System.out.println("No problem");
                }

                else if (answer.equals(choice14))
                {
                    System.out.println("Just check whether its broken or not");
                }

                else
                {
                    System.out.println("Read carefully");
                }
            }

            else
            {
                System.out.println("Look carefully");
            }
        }

        else
        {
            System.out.println("Read carefully");
        }
    }
}