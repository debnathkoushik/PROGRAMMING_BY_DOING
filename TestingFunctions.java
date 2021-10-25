public class TestingFunctions
{
    public static void main(String args[])
    {
        TestingFunctions object = new TestingFunctions();
        int s = 0;
        object.sum(2, 2, s);
        System.out.println(s); 
    }

    public  int sum(int a, int b, int s)
    {
        s = a + b;
        return s;
    }
}