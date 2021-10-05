import java.util.Scanner;

public class KeychainsForSale
{
    public static void main(String args[])
    {
        int choice = 0;

        System.out.println("Ye Olde Keychain Shoppe.");
        System.out.println();

        while (choice >= 0 && choice <= 4)
        {
            System.out.println("1. Add Keychains to Order \n2. Remove Keychains from Order \n3. View Current Order \n4. Checkout");
            System.out.println();
            System.out.print("Enter your choice: ");

            Scanner InputFromUser = new Scanner(System.in);
            choice = InputFromUser.nextInt();

            if (choice == 1)
            {
                addKeychainsToOrder();
            }

            else if (choice == 2)
            {
                removeKeychainsFromOrder();
            }

            else if (choice == 3)
            {
                viewCurrentOrder();
            }

            else if (choice == 4)
            {
                checkout();
            }
        }

    }
    
    public static void addKeychainsToOrder()
    {
        System.out.println("ADD KEYCHAINS TO ORDER.");
    }

    public static void removeKeychainsFromOrder()
    {
        System.out.println("REMOVE KEYCHAINS FROM ORDER.");
    }

    public static void viewCurrentOrder()
    {
        System.out.println("VIEW CURRENT ORDER.");
    }

    public static void checkout()
    {
        System.out.println("CHECKOUT");
        System.exit(0);
    }
}