import java.util.Scanner;

public class MonthOffset
{
    public static String MonthName(String MonthNumber)
    {
        String Answer;

        if (MonthNumber.equals("1"))
        {
            Answer = "1";
            return Answer;
        }

        if (MonthNumber.equals("2"))
        {
            Answer = "4";
            return Answer;
        }

        if (MonthNumber.equals("3"))
        {
            Answer = "4";
            return Answer;
        }

        if (MonthNumber.equals("4"))
        {
            Answer = "0";
            return Answer;
        }

        if (MonthNumber.equals("5"))
        {
            Answer = "2";
            return Answer;
        }

        if (MonthNumber.equals("6"))
        {
            Answer = "5";
            return Answer;
        }

        if (MonthNumber.equals("7"))
        {
            Answer = "0";
            return Answer;
        }

        if (MonthNumber.equals("8"))
        {
            Answer = "3";
            return Answer;
        }

        if (MonthNumber.equals("9"))
        {
            Answer = "6";
            return Answer;
        }

        if (MonthNumber.equals("10"))
        {
            Answer = "1";
            return Answer;
        }

        if (MonthNumber.equals("11"))
        {
            Answer = "4";
            return Answer;
        }

        if (MonthNumber.equals("12"))
        {
            Answer = "6";
            return Answer;
        }

        else
        {
            Answer = "ERROR";
            return Answer;
        }
    }
    
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        System.out.println("Input a number between 1-12 to know the name of the month:");
        String MonthNumber = InputFromUser.next();

        while (MonthNumber.compareTo("0") == 0)
        {
            System.exit(0);
        }
        String OffsetNumber = MonthName(MonthNumber); 
        System.out.println("The month offset is " + OffsetNumber);
    }
}