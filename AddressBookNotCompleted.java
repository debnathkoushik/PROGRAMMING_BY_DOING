import java.util.Scanner;

public class AddressBookNotCompleted
{
    static Scanner InputFromUser = new Scanner(System.in);

    static int size_of_array = 10;
    static int entries = 0;

    static String first_name[] = new String[size_of_array];
    static String last_name[] = new String[size_of_array];
    static String email_address[] = new String[size_of_array];
    static String address[] = new String[size_of_array];

    public static void main(String args[])
    {    
        int choice = 0;

        do
        {
            System.out.println("1. Add an entry\n2. Display\n3. Delete an entry\n4. Edit an entry\n5. Sort\n6. Search for a specific entry\n7. Quit");
            System.out.print("What do you want to do with the database ? ");

            choice = InputFromUser.nextInt();

            if (choice == 1)
            {
                addAnEntry();
            }

            else if (choice == 2)
            {
                // System.out.println(first_name[0] + " " + last_name[0]);
                display();
            }

            else if (choice == 3)
            {
                delete();
            }

            else if (choice == 4)
            {
                edit();
            }

            else if (choice == 5)
            {
                sort();
            }

        }

        while(choice != 7);
    }

    public  static void  addAnEntry()
    {   
        System.out.println("\nEnter your first name:");
        first_name[entries] = InputFromUser.next();

        System.out.println("\nEnter your last name:");
        last_name[entries] = InputFromUser.next();

        System.out.println("\nEnter your email address:");
        email_address[entries] = InputFromUser.next();

        System.out.println(InputFromUser.nextLine() );

        System.out.println("\nEnter your address:");
        address[entries] = InputFromUser.nextLine();

        concatenation();
        
        entries++;
        
        System.out.println();
    }

    public static void concatenation()
    {
        String string_1 = first_name[entries].concat(last_name[entries]);
        String string_2 = email_address[entries].concat(address[entries]);
        String string_3 = string_1.concat(string_2);
    }

    public static void display()
    {
        int size_of_name = first_name.length;
        
        for (int i = 0; i < size_of_name; i++)
        {
            if ( first_name[i] != null )
            {
                System.out.println("\nUser " + (i + 1) + ": " + first_name[i] + " " + last_name[i]);
                System.out.println("Email address: " + email_address[i] );
                System.out.println("Address: " + address[i] );
            }
        }
        System.out.println();
    }

    public static void delete()
    {
        Scanner InputFromUser = new Scanner(System.in);
        int size_of_name = first_name.length;
        
        System.out.print("Enter a position to delete: ");
        int position = InputFromUser.nextInt();

        if (position > 0 && position <= size_of_name)
        {
            first_name[position - 1] = "";
            last_name[position - 1] = "";
            email_address[position - 1] = "";
            address[position - 1] = "";

        }

        else
        {
            System.out.println("Such position doesn't exist!");
        }
    }

    public static void edit()
    {
        Scanner InputFromUser = new Scanner(System.in);

        int size_of_name = first_name.length;
        
        System.out.print("Enter the position you want to edit: ");
        int position = InputFromUser.nextInt();

        if (position > 0 && position <= size_of_name)
        {
            System.out.print("Enter the position of the element you want to edit: ");
            System.out.println("1. First name\n2. Last name\n3. Email address\n4. Address");

            int choice = InputFromUser.nextInt();

            if (choice == 1)
            {
                System.out.println("Enter your new first name:");
                first_name[position - 1] = InputFromUser.next();
            }

            else if (choice == 2)
            {
                System.out.println("Enter your new last name:");
                last_name[position - 1] = InputFromUser.next();
            }

            else if (choice == 3)
            {
                System.out.println("Enter your new email address:");
                email_address[position - 1] = InputFromUser.next();
            }

            else if (choice == 4)
            {
                System.out.println("Enter your new address:");
                address[position - 1] = InputFromUser.next();
            }

            else
            {
                System.out.println("Wrong input! Now you will be redirected to the main menu.");
            }

        }

        else
        {
            System.out.println("Such position does not exist!");
        }
    }

    public static void sort()
    {
        for (int i = 0; i < last_name.length; i++)
        {
            for (int j = i + 1; j < last_name.length; j++)
            {
                if ( last_name[i].compareTo(last_name[j]) > 0)
                {
                    String temp_1 = first_name[i];
		            first_name[i] = first_name[j];
		            first_name[j] = temp_1;

                    String temp_2 = last_name[i];
		            last_name[i] = last_name[j];
		            last_name[j] = temp_2;

                    String temp_3 = email_address[i];
		            email_address[i] = email_address[j];
		            email_address[j] = temp_3;

                    String temp_4 = address[i];
		            address[i] = address[j];
		            address[j] = temp_4;
                }
            }
        }

        System.out.println();
    }

}