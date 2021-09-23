import java.util.Scanner;

public class AskingQuestions
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        String firstName, lastName;
        int age;
        double weight;

        System.out.println("What is your first name?");
        firstName = InputFromUser.next();

        System.out.println("What is your last name?");
        lastName = InputFromUser.next();
        
        System.out.println("What is your age in years?");
        age = InputFromUser.nextInt();

        System.out.println("What is your weight in kg?");
        weight = InputFromUser.nextDouble();

        System.out.println("I am " + firstName + " " + lastName + " of age " + age + " years. " + "And my weight is " + weight + ".");
    }
}