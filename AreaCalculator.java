import java.lang.Math;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class AreaCalculator
{
    public static void main(String args[])
    {
        Scanner ImportFromUser = new Scanner(System.in);
        System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
        
        int choice = 0;

        while (choice != 5)
        {
            System.out.println("\n1) Triangle \n2) Rectangle \n3) Square \n4) Circle \n5) Quit");
            choice = ImportFromUser.nextInt();
            if (choice == 1)
            {
                System.out.println("Input base");
                double base = ImportFromUser.nextDouble();
                System.out.println("Input height");
                double height = ImportFromUser.nextDouble();

                double area = area_triangle(base, height);
                System.out.println("The area is " + area);
            }

            else if (choice == 2)
            {
                System.out.println("Input length");
                double length = ImportFromUser.nextDouble();
                System.out.println("Input height");
                double width = ImportFromUser.nextDouble();

                double area = area_rectangle(length, width);
                System.out.println("The area is " + area);
            }

            else if (choice == 3)
            {
                System.out.println("Input side");
                double length = ImportFromUser.nextDouble();

                double area = area_square(length);
                System.out.println("The area is " + area);
            }

            else if (choice == 4)
            {
                System.out.println("Input radius");
                double radius = ImportFromUser.nextDouble();

                double area = area_circle(radius);
                System.out.println("The area is " + area);
            }
        }
        System.out.println("GOODBYE!");
    }

    public static double area_circle( double radius )// returns the area of a circle
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area_rectangle( double length, double width ) // returns the area of a rectangle
    {
        return length * width;
    }  

    public static double area_square( double side )// returns the area of a square
    {
        return side * side;
    }                   

    public static double area_triangle( double base, double height )// returns the area of a triangle
    {
        double area = 0.5 * base *height;
        return area;
    }  
}