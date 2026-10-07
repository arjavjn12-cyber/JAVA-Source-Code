import java.io.FileReader;
import java.io.IOException;

public class P13_FileReader {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("Student.txt");
        int data;
        
        while((data = reader.read()) != -1){ // file read krne ka trika
            System.out.print((char) data);
        }
        reader.close();
    }
}

// reader.read() reads one chahracter at a time.
// read() returns character --> its numeric value (according to ascii)
//                end of file --> -1

// hello.txt
//    ↓
// FileReader
//    ↓
// read()
//    ↓
// int value
//    ↓
// (char) value
//    ↓
// print

// Always close the file resource