import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    { 
        System.out.println( "Type in a message, and I'll display it." );
        System.out.print( "Message: " );
        Scanner InputFromUser = new Scanner(System.in);
        String message = InputFromUser.nextLine();

        System.out.print("Enter number of times: ");
        int number = InputFromUser.nextInt();
        int n;

        for (n = 1; n <= number ; n++ )
        {
            System.out.println( n + ". " + message );
        }
    }
}