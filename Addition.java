import java.lang.Math;

class Number
{
    int a =10;// GLOBAL_VARIABLE

    public static int sum(int a,int b)//a and b are LOCAL_VARIABLE
    {
        // int add = a + b;
        return a+b;//here the value of a is 15 and 10 because
                    // a is present in local scope and local varible
                    // gets the first preference
    }

    public int square(int a)
    {
        return (int)Math.pow(a, 2);
    }

    public int sumOfSquare(int a, int b)
    {
        int sq_a = square(a);
        int sq_b = square(b);
        int sum = sum(sq_a, sq_b);
        return sum;
    }
}

public class Addition
{
    public static void main(String args[])
    {
        Number number = new Number();
        int add = Number.sum(15, 20);
        int result = number.square(5);
        int resultOfSumOfSquare = number.sumOfSquare(5, 2);
        
        System.out.println(add);
        System.out.println(result);
        System.out.println(resultOfSumOfSquare);
    }
}