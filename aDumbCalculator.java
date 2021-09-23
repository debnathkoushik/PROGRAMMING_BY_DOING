import java.util.Scanner;

public class aDumbCalculator
{
    public static void main(String args[])
    {
    Scanner InputFromUser = new Scanner(System.in);

    int firstNumber, secondNumber, thirdNumber;
    double  average;

    System.out.print("Enter the first number: ");
    firstNumber = InputFromUser.nextInt();

    System.out.print("Enter the second number: ");
    secondNumber = InputFromUser.nextInt();

    System.out.print("Enter the third number: ");
    thirdNumber = InputFromUser.nextInt();

    average = (firstNumber + secondNumber + thirdNumber) / 2;

    System.out.println("(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ")" + "/" + 2 + " is...." + average);
    }
}