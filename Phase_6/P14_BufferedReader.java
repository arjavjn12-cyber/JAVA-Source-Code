import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P14_BufferedReader {
    public static void main(String[] agrs) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }   
}

// BufferedReader is a class that helps us read text efficiently, especially line by line.
// .readLine() reads one complete line from the file
// eg: readLine() → "Hello Java"
//     readLine() → "Welcome to VIT"

// .readLine() returns string thats y we do not use -1 here