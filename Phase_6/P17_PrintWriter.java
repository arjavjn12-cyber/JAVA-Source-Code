import java.io.PrintWriter;
import java.io.IOException;

public class P17_PrintWriter {
    public static void main(String[] args) throws IOException{
        PrintWriter writer = new PrintWriter("PrintWriter.txt"); // will overwrite the file's existing content.
        
        writer.println("Hello Java");
        writer.print("Welcome to file Handling");
        writer.println("This is PrintWriter");
        
        int age = 18;

        writer.printf("The age is: %d",age);

        writer.close();
    }
}


// FileWriter
//     ↓
// "I want to write characters"

// BufferedWriter
//     ↓
// "I want efficient repeated writing"

// PrintWriter
//     ↓
// "I want writing to feel like System.out.print/println/printf"