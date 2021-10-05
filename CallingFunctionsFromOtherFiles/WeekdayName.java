package CallingFunctionsFromOtherFiles;

public class WeekdayName
{
    public static String weekday_name(int total)
    {
        String Answer;

        if (total == 1)
        {
            Answer = "Sunday";
        }

        else if (total == 2)
        {
            Answer = "Monday";
        }

        else if (total == 3)
        {
            Answer = "Tuesday";
        }

        else if (total == 4)
        {
            Answer = "Wednesday";
        }

        else if (total == 5)
        {
            Answer = "Thursday";
        }

        else if (total == 6)
        {
            Answer = "Friday";
        }

        else
        {
            Answer = "Saturday";
        }

        System.out.println("weekday_name: " + (total == 2));

        return Answer;
    }
    
}
