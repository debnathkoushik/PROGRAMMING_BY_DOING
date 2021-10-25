import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;

class Contact
{
    String first_name;
    String last_name;
    String email;
    String address;

    public String getData()
    {
        String return_data = first_name + " " + last_name + " " + email + " " + address;
        return return_data;
    }
}


class ContactList
{
    Contact list_of_contacts[] = new Contact[10];
    int position = 0;

    AddressBook accessing_AddressBook = new AddressBook();

    public void storeInAnArray(Contact accessed)
    {
      list_of_contacts[position] = accessed;
      position++;
      System.out.println(accessed);
    }


    public void edit(int position)
    {
        Contact updated_contact = accessing_AddressBook.inputData();

        list_of_contacts[position] = updated_contact;
    }


    public void deleteAnEntry(int position)
    {
        System.out.println(list_of_contacts[position]);
        list_of_contacts[position] = null;
    }


    public void searchForASpecificEntry(int position)
    {
        Contact contact = list_of_contacts[position];

        if (contact == null)
        {
            System.out.println("EMPTY!");
        }
        else
        {
            System.out.println(contact.getData());
        }
    }

    public void sortTheAddressBook()
    {
        Contact contact [] = list_of_contacts;       //assigning one array to another array, here we addressses of each position of the array is getting stored in another array

        for (int i = 0; i < contact.length; i++)
        {   
            System.out.println(contact[i]);
            if (contact[i] != null)
            {
                for (int j = i + 1; j < contact.length; j++)
                {
                    if (contact[j] != null)
                    {
                        if ( contact[i].getData().compareTo(contact[j].getData() ) > 0)
                        {
                            Contact temp = contact[i];
                            contact[i] = contact[j];
                            contact[j] = temp;
                        }
                    }    
                }
            }
        }
    }


    public void readFromFile()
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = FileSystems.getDefault().getPath("", "SampleAddressBook.txt");
        try
        {
            BufferedReader reader = Files.newBufferedReader(path, charset);
            String line;
            while ((line = reader.readLine() ) != null)
            {
                System.out.println(line);
            }

        }
        catch (IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }
    }


    public void writeToFile()
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = FileSystems.getDefault().getPath("", "SampleAddressBook.txt");
        
        try
        {
            BufferedWriter writer = Files.newBufferedWriter(path, charset);
            BufferedReader reader = Files.newBufferedReader(path, charset);

            Contact contact[] = list_of_contacts;
            for (int i = 0; i < contact.length; i++)
            {
                if (contact[i] != null)
                {
                    String s = contact[i].getData();
                    int tries = 0;
                    while ( reader.readLine() == null && tries == 0)
                    {
                        writer.write(s);
                        writer.write("\n");

                        tries++;
                    }
                }
                
            }
            writer.close();
        }
        catch (IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }
    }

}



public class AddressBook
{
    public static void main(String args[])
    {
        Scanner InputFromUser = new Scanner(System.in);

        AddressBook accessing_Contact = new AddressBook();

        ContactList accessing_ContactList = new ContactList();


        int choice = 0;

        do
        {
            System.out.println("1. Load from file\n2. Save to file\n3. Add an entry\n4. Edit an entry\n5. Delete an entry\n6. Search for a specific entry\n7. Sort the address book\n8. Quit");
            System.out.print("What do you want to do with the database ? ");

            choice = InputFromUser.nextInt();
            if (choice == 1)
            {
                accessing_ContactList.readFromFile();
            }

            else if (choice == 2)
            {
                accessing_ContactList.writeToFile();
            }

            else if (choice == 3)
            {   
                Contact accessed = accessing_Contact.inputData();
                
                accessing_ContactList.storeInAnArray(accessed);
            }

            else if (choice == 4)
            {
                System.out.print("Enter a positon: ");
                int position = InputFromUser.nextInt();

                accessing_ContactList.edit(position);
            }

            else if (choice == 5)
            {
                System.out.print("Enter a positon to delete: ");
                int position = InputFromUser.nextInt();

                accessing_ContactList.deleteAnEntry(position);
            }

            else if (choice == 6)
            {
                System.out.print("Enter a positon to search: ");
                int position = InputFromUser.nextInt();

                accessing_ContactList.searchForASpecificEntry(position);
            }

            else if (choice == 7)
            {
                accessing_ContactList.sortTheAddressBook();
            }

        }

        while (choice != 8);
    }


    public Contact inputData()
    {
        Scanner InputFromUser = new Scanner(System.in);

        Contact accessing_Contact = new Contact();
        
        System.out.println("\nEnter your first name:");
        accessing_Contact.first_name = InputFromUser.next();

        System.out.println("\nEnter your last name:");
        accessing_Contact.last_name = InputFromUser.next();

        System.out.println("\nEnter your email:");
        accessing_Contact.email = InputFromUser.next();

        InputFromUser.nextLine();
        System.out.println("\nEnter your address:");
        accessing_Contact.address = InputFromUser.nextLine();

        return accessing_Contact;
    }
}
