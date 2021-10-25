import java.net.URL;
import java.util.Scanner;

class Location
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebLocation
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("http://cs.leanderisd.org/txt/fake-Locationes.txt");
		Scanner fin = new Scanner( addys.openStream() );

		Location uno = new Location();
		uno.street = fin.nextLine();
		uno.city   = fin.nextLine();
		uno.state  = fin.next();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Location dos = new Location();
		dos.street = fin.nextLine();
		dos.city   = fin.nextLine();
		dos.state  = fin.next();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Location tre = new Location();
		tre.street = fin.nextLine();
		tre.city   = fin.nextLine();
		tre.state  = fin.next();
		tre.zip    = fin.nextInt();
		fin.skip("\n");
		
		fin.close();
		
		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
	}
}
