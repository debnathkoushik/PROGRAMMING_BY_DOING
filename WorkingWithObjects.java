import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorkingWithObjects
{
    public static void main( String[] args ) throws Exception
    {
        File f = new File("SampleAddressBook.txt");

        if ( f.exists() == false )
        {
            System.out.println( f.getName() + " not found in this folder. :(");
            System.exit(1);
        }


        ArrayList<String> words = new ArrayList<String>();
        Scanner alpha = new Scanner(f);
        String w = "";
        System.out.print("Reading words from \"" + f.getPath() + "\"... ");
        while ( alpha.hasNext() )
        {
            w = alpha.next();
            
            System.out.println(words.add(w));

        }
        alpha.close();
        System.out.println("done.\n\t");

        Random rng = new Random();
        rng.setSeed(1);

        for ( int n=0; n<3; n++ )
        {
            int i = rng.nextInt( words.size() );
            String s = words.get(i);
            System.out.print( s.toLowerCase() + " " );
        }
        System.out.println();
    }
}