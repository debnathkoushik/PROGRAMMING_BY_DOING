import java.util.Random;

public class RollDice
{
    public static int dice()
    {
        Random RandomNumber = new Random();
        int number = 1 + RandomNumber.nextInt(6);
        
        return number;
    }

    public static void main(String args[])
    {
        int number = dice();

        System.out.println("The number/s is/are: ");

        if (number <= 5)
        {
            System.out.println(number);
        }
        else
        {
           int number2 = dice();
           if(number2 <= 5)
           {
                System.out.println(6 + " " + number2);
           }
           else
           {
               int number3 = dice();
               if(number3 <= 5)
               {
                    System.out.println(6 + " " + 6 + " " + number3);
               } 
               else {
                    System.out.println("You are out of luck!! You have 6 6 6.");
               }
           }
        }
    }
}