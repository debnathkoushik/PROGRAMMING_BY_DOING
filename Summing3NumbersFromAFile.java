// import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;// for Charset class

public class Summing3NumbersFromAFile
{
    public static void main(String args[])
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = FileSystems.getDefault().getPath("", "Name1.txt");
        String s = "1 2 3";
        int a = (int)s.charAt(0);
        System.out.println(a);
        try{
            BufferedWriter writer = Files.newBufferedWriter(path, charset);
            writer.write(s);
            writer.close();
        }
        catch (IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }   
    }
}