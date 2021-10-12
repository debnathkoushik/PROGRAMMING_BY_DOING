// import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;// for Charset class

public class LetterRevisited
{
    public static void main(String args[])
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = FileSystems.getDefault().getPath("", "Name.txt");
        try{
            BufferedReader reader = Files.newBufferedReader(path, charset);
            String line = reader.readLine();
            System.out.println(line);
        }
        catch (IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }   
    }
}