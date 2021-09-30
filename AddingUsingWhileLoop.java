import java.util.Scanner;

public class AddingUsingWhileLoop
{
    public static void main(String[] args)
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("I WILL GIVE YOU SUM OF THE INPUT NUMBERS.");
        System.out.println("Input numbers except '0'.");
        double number = InputFromUser.nextDouble();
        double sum = 0.0;

        while (number != 0)
        {
            sum = sum + number;
            System.out.println("THE SUM IS " + sum);

            System.out.println("Input numbers except '0'.");
            number = InputFromUser.nextDouble();
        }

        System.out.println("I SAID YOU NOT TO ENTER '0'. BUT YOU DID!");
        System.out.println("SO THE FINAL SUM IS " + sum);
    }
}