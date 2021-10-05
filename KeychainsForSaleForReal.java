import java.util.Scanner;

public class KeychainsForSaleForReal
{
    public static void main(String args[])
    {
        int choice = 0;
        int total = 0;

        System.out.println("Ye Olde Keychain Shoppe.");
        System.out.println();

        while (choice >= 0 && choice <= 4)
        {
            System.out.println("1. Add Keychains to Order \n2. Remove Keychains from Order \n3. View Current Order \n4. Checkout");
            System.out.println();
            System.out.print("Enter your choice: ");

            Scanner InputFromUser = new Scanner(System.in);
            choice = InputFromUser.nextInt();

            //System.out.println(total);

            if (choice == 1)
            {
               total = addKeychainsToOrder(total);
            }

            else if (choice == 2)
            {
                total = removeKeychainsFromOrder(total);
            }

            else if (choice == 3)
            {
                viewCurrentOrder(total);
            }

            else if (choice == 4)
            {
                checkout(total);
            }
        }

    }
    
    public static int addKeychainsToOrder(int total)
    {
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.print("Add keychains. ");

        Scanner InputFromUser = new Scanner(System.in);
        int numberOfKeychains = InputFromUser.nextInt();

        total = total + numberOfKeychains;

        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.println();
         return total;
    }

    public static int removeKeychainsFromOrder(int total)
    {
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.print("How many keychains you want to remove? ");

        Scanner InputFromUser = new Scanner(System.in);
        int numberOfKeychains = InputFromUser.nextInt();

        total = total - numberOfKeychains;
        
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.println();

        return total;
    }

    public static void viewCurrentOrder(int total)
    {
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.println();
    }

    public static void checkout(int total)
    {
        System.out.println("CHECKOUT\n");
        
        System.out.println("What is your name?");
        Scanner InputFromUser = new Scanner(System.in);
        String NameOfCustomer = InputFromUser.nextLine();

        System.out.println("Hey! " + NameOfCustomer + " you have " + total + " keychain/s.");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Total cost is " + '$' + total * 10);
        System.out.println("Thanks for your order, " + NameOfCustomer);

        System.exit(0);
    }
}