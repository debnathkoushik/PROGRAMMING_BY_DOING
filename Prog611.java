import javax.swing.*;

public class Prog611
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are  you? " + name);
        
        int age = Integer.parseInt(input);

        System.out.println("Hello, " + name + " ");
        System.out.println("Next year you wil be " + (age + 1));

        System.exit(0);

    }
}