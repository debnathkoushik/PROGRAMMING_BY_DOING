import java.util.Scanner;

public class KeychainsForSaleUltimatePower
{
    public static void main(String args[])
    {
        int choice = 0;
        int total = 0;
        double PricePerKeychain = 10;
        double tax = (8.25 / 100);
        int BaseShipping = 5;
        int PerKeychainShipping = 1;

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
                viewCurrentOrder(total, PricePerKeychain, tax, BaseShipping, PerKeychainShipping);
            }

            else if (choice == 4)
            {
                checkout(total, PricePerKeychain, tax, BaseShipping, PerKeychainShipping);
            }

            else
            {
                System.out.println("WRONG INPUT!");
                choice = 0;
            }
        }

    }
    
    public static int addKeychainsToOrder(int total)
    {
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.print("Add keychains. ");

        Scanner InputFromUser = new Scanner(System.in);
        int numberOfKeychains = InputFromUser.nextInt();
        
        if (numberOfKeychains >= 0)
        {
        total = total + numberOfKeychains;

        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.println();
         return total;
        }

        System.out.println("WRONG INPUT!");
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

    public static void viewCurrentOrder(int total, double PricePerKeychain, double tax, int BaseShipping, int PerKeychainShipping)
    {
        System.out.println("You have " + total + " keychain/s in your order.");
        System.out.println("Price per keychain is " + '$' + PricePerKeychain);
        System.out.println("The shipping charges on the order is " + '$' + ( (total * PerKeychainShipping) + BaseShipping));
        System.out.println("The subtotal before tax is " + '$' + ( (total * PerKeychainShipping) + BaseShipping + (total * PricePerKeychain) ) );
        System.out.println("The tax on the order is " + '$' + (tax * total) );
        System.out.println("The final cost of the order is " + '$' + ( (tax * total) + ( (total * PerKeychainShipping) + BaseShipping + (total * PricePerKeychain) ) ));
        System.out.println();
    }

    public static void checkout(int total, double PricePerKeychain, double tax, int BaseShipping, int PerKeychainShipping)
    {
        System.out.println("CHECKOUT\n");
        
        System.out.println("What is your name?");
        Scanner InputFromUser = new Scanner(System.in);
        String NameOfCustomer = InputFromUser.nextLine();

        System.out.println("Hey! " + NameOfCustomer + " you have " + total + " keychain/s.");
        System.out.println("Price per keychain is " + '$' + PricePerKeychain);
        System.out.println("The shipping charges on the order is " + '$' + ( (total * PerKeychainShipping) + BaseShipping));
        System.out.println("The subtotal before tax is " + '$' + ( (total * PerKeychainShipping) + BaseShipping + (total * PricePerKeychain) ) );
        System.out.println("The tax on the order is " + '$' + (tax * total) );
        System.out.println("The final cost of the order is " + '$' + ( (tax * total) + ( (total * PerKeychainShipping) + BaseShipping + (total * PricePerKeychain) ) ));
        System.out.println();
        System.out.println("Thanks for your order, " + NameOfCustomer);

        System.exit(0);
    }
}