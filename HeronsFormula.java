import java.lang.Math;

public class HeronsFormula
{
	public static void main( String[] args )
	{
		double Area;
		
		Area = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + Area );

		Area = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + Area );
 
		Area = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + Area );

		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
	}
 
	public static double triangleArea( int Side1, int Side2, int Side3 )
	{
		double Side, Area;

		Side = (Side1 + Side2 + Side3) / 2;
		Area = Math.sqrt( Side * (Side - Side1) * (Side - Side2) * (Side - Side3) );

		return Area;
	}
}