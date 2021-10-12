// import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;// for Charset class

public class LetterWrite
{
    public static void main(String args[])
    {
        Charset charset = Charset.forName("US-ASCII");
        Path path = FileSystems.getDefault().getPath("", "Name1.txt");
        String s = "My name is Roni.";
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