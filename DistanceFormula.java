import java.lang.Math;

public class DistanceFormula
{
	public static void main( String[] args )
	{
		double d1 = distance(-2, 1, 1, 5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );
 
		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );
 
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1, -2) );
 
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}
 
	public static double distance( double x1, double y1, double x2, double y2 )
	{
        
        double FirstStep = Math.pow((x2 - x1), 2);
        double SecondStep = Math.pow((y2 - y1), 2);
        double FinalStep = FirstStep + SecondStep;
        
        double Answer = Math.sqrt(FinalStep);

        return Answer;
	}
}