import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println("02 13 2000 => " + weekday(02,12,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int total;
        int yy = yyyy - 1900;
		total = yy / 4;
        total = total + yy;
        total = total + dd;
        total = total + month_offset(mm);

        boolean answer = is_leap(yyyy);
        int result = Boolean.compare(answer, true);
        if (result == 0)
        {
            if (mm == 1 || mm == 2)
            {
                total = total - 1; 
            }
        }
        
        total = total % 7;

		String date = weekday_name(total) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

		return date;
	}

    public static String month_name(int mm)
    {
        String Answer;

        if (mm == 1)
        {
            Answer = "Janaury";
            return Answer;
        }

        if (mm== 2)
        {
            Answer = "February";
            return Answer;
        }

        if (mm== 3)
        {
            Answer = "March";
            return Answer;
        }

        if (mm== 4)
        {
            Answer = "April";
            return Answer;
        }

        if (mm== 5)
        {
            Answer = "May";
            return Answer;
        }

        if (mm== 6)
        {
            Answer = "June";
            return Answer;
        }

        if (mm== 7)
        {
            Answer = "July";
            return Answer;
        }

        if (mm== 8)
        {
            Answer = "August";
            return Answer;
        }

        if (mm== 9)
        {
            Answer = "September";
            return Answer;
        }

        if (mm== 10)
        {
            Answer = "October";
            return Answer;
        }

        if (mm== 11)
        {
            Answer = "November";
            return Answer;
        }

            Answer = "December";
            return Answer;
    }

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

    public static int month_offset(int mm)
    {
        int Answer;

        if (mm == 1)
        {
            Answer = 1;
            return Answer;
        }

        if (mm == 2)
        {
            Answer = 4;
            return Answer;
        }

        if (mm == 3)
        {
            Answer = 4;
            return Answer;
        }

        if (mm == 4)
        {
            Answer = 0;
            return Answer;
        }

        if (mm == 5)
        {
            Answer = 2;
            return Answer;
        }

        if (mm == 6)
        {
            Answer = 5;
            return Answer;
        }

        if (mm == 7)
        {
            Answer = 0;
            return Answer;
        }

        if (mm == 8)
        {
            Answer = 3;
            return Answer;
        }

        if (mm ==9)
        {
            Answer = 6;
            return Answer;
        }

        if (mm == 10)
        {
            Answer = 1;
            return Answer;
        }

        if (mm == 11)
        {
            Answer = 4;
            return Answer;
        }

       
            return 6;
        
    }


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}