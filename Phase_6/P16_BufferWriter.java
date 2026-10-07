import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P16_BufferWriter {
    public static void main(String[] args) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));

        writer.write("\n\nHello java");
        writer.newLine();  // instead of \n we can use this function
        writer.write("Welocme to file handling");
        writer.newLine();
        writer.write("This is BufferedWriter");

        writer.close();
    }
}


// here also append mode works

// BufferedWriter
// Your program
//      ↓
// BufferedWriter
//      ↓
//    BUFFER
//      ↓
// FileWriter
//      ↓
//    File
// BufferedWriter beech mein ek temporary memory area (buffer) rakhta hai.
// Main purpos is Efficiency only (can handle too many things easily)
