import java.lang.Math;

public class HeronsFormulaNoFunction
{
	public static void main( String[] args )
	{
		int Side1, Side2, Side3;
		double Side, Area;
		
		Side1 = 3;
		Side2 = 3;
		Side3 = 3;
		Side = (Side1 + Side2 + Side3) / 2;
		Area = Math.sqrt( Side * (Side - Side1) * (Side - Side2) * (Side - Side3) );
		System.out.println("A triangle with sides 3,3,3 has an area of " + Area );

		Side1 = 3;
		Side2= 4;
		Side3 = 5;
		Side = (Side1 + Side2 + Side3) / 2;
		Area = Math.sqrt( Side * (Side - Side1) * (Side - Side2) * (Side - Side3) );
		System.out.println("A triangle with sides 3,4,5 has an area of " + Area );
 
		Side1 = 7;
		Side2 = 8;
		Side3 = 9;
		Side = (Side1 + Side2 + Side3) / 2;
		Area = Math.sqrt( Side * (Side - Side1) * (Side - Side2) * (Side - Side3) );
		System.out.println("A triangle with sides 7,8,9 has an area of " + Area );
	}
}