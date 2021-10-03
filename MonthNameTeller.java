import java.util.Scanner;

public class MonthNameTeller
{
    public static String MonthName(String MonthNumber)
    {
        String Answer;

        if (MonthNumber.equals("1"))
        {
            Answer = "JANAURY";
            return Answer;
        }

        if (MonthNumber.equals("2"))
        {
            Answer = "FEBRUARY";
            return Answer;
        }

        if (MonthNumber.equals("3"))
        {
            Answer = "MARCH";
            return Answer;
        }

        if (MonthNumber.equals("4"))
        {
            Answer = "APRIL";
            return Answer;
        }

        if (MonthNumber.equals("5"))
        {
            Answer = "MAY";
            return Answer;
        }

        if (MonthNumber.equals("6"))
        {
            Answer = "JUNE";
            return Answer;
        }

        if (MonthNumber.equals("7"))
        {
            Answer = "JULY";
            return Answer;
        }

        if (MonthNumber.equals("8"))
        {
            Answer = "AUGUST";
            return Answer;
        }

        if (MonthNumber.equals("9"))
        {
            Answer = "SEPTEMBER";
            return Answer;
        }

        if (MonthNumber.equals("10"))
        {
            Answer = "OCTOBER";
            return Answer;
        }

        if (MonthNumber.equals("11"))
        {
            Answer = "NOVEMBER";
            return Answer;
        }

        if (MonthNumber.equals("12"))
        {
            Answer = "DECEMBER";
            return Answer;
        }

        else
        {
            Answer = "Wrong input";
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
        String NameOfMonth = MonthName(MonthNumber); 
        System.out.println("The month is " + NameOfMonth);
    }
}