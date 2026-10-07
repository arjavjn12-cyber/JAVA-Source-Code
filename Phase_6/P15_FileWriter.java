import java.io.FileWriter;
import java.io.IOException;

public class P15_FileWriter {
    public static void main(String[] args) throws IOException{

        FileWriter writer = new FileWriter("hello.txt"); // overwrite
        writer.write("Hello from Java\n!");
        writer.write("Hello Java\n");
        writer.write("Welcome to File Handling\n");
        writer.write("This is line three");

        writer.close();
    }
}

// .write() if file is not there then it makes file and write it,
// if the file is there then is just update it

// By default, FileWriter opens the file in overwrite mode.
// s.t. if anything written in the file will get replaced by it 

// if we give multiple things by running .write() more than one type in one program
// it will create new line and write it.

// Append mode
// FileWriter writer = new FileWriter("hello.txt", true);
// this will not replace the existing content in the files