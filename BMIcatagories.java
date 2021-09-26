import java.util.Scanner;

public class BMIcatagories
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Input your weight in kg:");
        double weight = InputFromUser.nextDouble();

        System.out.println("Input your height in meters:");
        double height = InputFromUser.nextDouble();

        double BMI = decider(weight, height);
        System.out.println("Your BMI is: " + BMI);
        if (BMI < 18.5)
        {
            System.out.println("underweight");
        }

        else if (BMI >= 18.5 && BMI <= 24.9)
        {
            System.out.println("normal weight");
        }

        else if (BMI >= 25.0 && BMI <= 29.9)
        {
            System.out.println("overweight");
        }

        else
        {
            System.out.println("obese");
        }
    }

    public static double decider(double weight, double height)
    {
       double BMI = (weight / (height * height));
        return BMI;
    }
}

