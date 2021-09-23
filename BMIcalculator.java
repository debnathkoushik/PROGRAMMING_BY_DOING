import java.util.Scanner;

public class BMIcalculator
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        double height, weight, BMI;

        System.out.println("Your weight in meters: ");
        height = InputFromUser.nextDouble();

        System.out.println("Your height in kilogram: ");
        weight = InputFromUser.nextDouble();

        BMI = weight / (height * height);

        System.out.println("Your height in meters: " + height);
        System.out.println("Your weight in kilograms: " + weight);
        System.out.println("\n");
        System.out.println("Your BMI is: " + BMI);
    }
}