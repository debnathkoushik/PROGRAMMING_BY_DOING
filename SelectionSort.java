import java.util.Random;

import javax.swing.text.Position;

public class SelectionSort
{
	public static void selection_sort( int[] a )
	{
		for (int i = 0; i < a.length; i++)
        {
            int temp = 0;
            int position = 0;
            int tries = 0;

            for (int j = i+1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[j];
                    position = j;
                    tries++;
                    System.out.println(temp);
                }

            }
            if (tries > 0)
            {
                swap(a, i, temp, position);
            }
        }
	}


	public static void swap( int[] a , int i, int temp, int j )
	{
		a[j] = a[i];
        a[i] = temp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		selection_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}