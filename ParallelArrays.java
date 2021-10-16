import java.util.Scanner;

public class ParallelArrays
{
    public static void main(String args[])
    {
        Scanner input_from_user = new Scanner(System.in);

        String array_1[] = new String[5];
        String array_2[] = new String[5];
        Double array_3[] = {82.57, 89.56, 83.62, 82.56, 83.71};
        int array_4[] = {12345, 12346, 12347, 12348, 12349};


        for (int i = 0; i < 5; i++)
        {
            System.out.println("User " + (i + 1) );
            System.out.print("Enter your first name: ");
            array_1[i] = input_from_user.next();

            System.out.print("Enter your last name: ");
            array_2[i] = input_from_user.next();


            System.out.println('\n');
        }

        System.out.println("\n\nDisplaying details!");

        for (int i = 0; i < 5; i++)
        {
            System.out.println( array_1[i] + "  " + array_3[i] + " " + array_4[i]);
        }

        System.out.println("\n");

        System.out.print("Enter ID number to view details: ");
        int ID_number = input_from_user.nextInt();
        for (int i = 0; i < 5; i++)
        {
            if (ID_number == array_4[i])
            {
                int count = i + 1;
                System.out.println("\nFound in slot " + count);
                System.out.println("Last name: " + array_2[i] + "\nAverage: " + array_3[i] + "\nID: " + array_4[i]);
                System.exit(0);
            }
        }
    }
}