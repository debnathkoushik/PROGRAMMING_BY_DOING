import java.util.Scanner;

public class NameAgeAndSalary
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        String firstName;
        int age;
        double salary;

        System.out.println("Hello. What is your name?");
        firstName = InputFromUser.next();

        System.out.println("Hi, " + firstName + "!" + " How old are you?");
        age = InputFromUser.nextInt();

        System.out.println("So you're " + age + " That's not old at all!");
        
        System.out.println("How much do you make, " + firstName + "?");
        salary = InputFromUser.nextDouble();

        System.out.println(salary + "!" + " I hope that's per hour and not per year! LOL!");
    }
}