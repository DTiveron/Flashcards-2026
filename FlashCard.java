import java.io.*;
import java.util.*;

public class FlashCard
{
    public static void main(String[] args) throws IOException 
    {
        // Create your map, you can assume it will always be <String, String>

        
        // Set up file reading   
        String fileName = "data/numbers.txt";
        FileReader fin = new FileReader(fileName);
        Scanner info = new Scanner(fin);
        // delimiters are # signs, line feeds,carriage returns
        info.useDelimiter("[#\\n\\r]");  
        
        // get information about the first key and value, 
        //which are the meanings of each <key, value> pair
        String keyInfo = "replace this with the appropriate method call";
        String valueInfo = "replace this with the appropriate method call";
        info.nextLine();

        
        String key;
        String value;

        boolean done = false;
        //replace false with the appropriate method call
        while (!done)   // Reads the key/value pairs from the file and puts them into the map   
        {
            key = "replace this with the appropriate method call";  
            value = "replace this with the appropriate method call";
            info.nextLine();
            
            //Add the <key, value> pair to the map
            
        }

        Scanner scan = new Scanner(System.in);
        // Interact with user, getting keys and displaying value
        
    }
} 
