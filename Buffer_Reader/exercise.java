import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferReader is a class for reading input like Scanner
//Scanner class provides parsing and input reading capabilities with built in methods for several datatupes
//BufferReader class reads text from a character input stream
//Error handling - Throws Exception like IOException
//When performance is important,especially for reading large volumes of data or files BufferRead is used
//Performance is faster due to efficient buffering

public class exercise{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int N = Integer.parseInt(r.readLine().trim());

        //trim() = removes any leading or trailing whitespace from the input string
        //The trim() method checks for  Unicode value for space character at the beginning and end of the string and removes them
        //Integer.parseInt() = converts a string into an integer

        for (int i = 1; i <=10; i++) {
            System.out.println(N + " x "+ i + " = " + N*i);
        }

        r.close();


    }
}