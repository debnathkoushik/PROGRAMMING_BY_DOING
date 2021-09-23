import java.util.Scanner;

public class TheForgetfulMachine
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        String firstWord, secondWord;
        int firstNumber, secondNumber;

        System.out.println("Give me a word!");
        firstWord = InputFromUser.next();

        System.out.println("Give me a second word!");
        secondWord = InputFromUser.next();

        System.out.println("Great, now your favourite number?");
        firstNumber = InputFromUser.nextInt();

        System.out.println("And your second favourite number is?");
        secondNumber = InputFromUser.nextInt();

        System.out.println("Oops! I forgot what you said");
    }
}