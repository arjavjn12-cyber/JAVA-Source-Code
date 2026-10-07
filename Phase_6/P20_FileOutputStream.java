import java.io.FileOutputStream;
import java.io.IOException;

public class P20_FileOutputStream {
    public static void main(String[] args) throws IOException {
    
            FileOutputStream output = new FileOutputStream("data.bin");
    
            output.write(65);
            output.write(66);
            output.write(67);
    
            output.close();
        }
}

// FileOutputStream = file mein bytes write karna.
// We can use byte array also byte[]


// eg of binary files:

// FileInputStream input = new FileInputStream("photo.jpg");
// FileOutputStream output = new FileOutputStream("copy.jpg");
// int data;

// while ((data = input.read()) != -1) {
//     output.write(data);
// }

// input.close();
// output.close();

// photo.jpg
//    ↓
// FileInputStream
//    ↓
// bytes
//    ↓
// FileOutputStream
//    ↓
// copy.jpg

// HERE ALSO OVERWRITE HAPPENS SO MAKE SURE TO USE APPEND MODE IF U DONT WANT OT GET UR STUFF OVERWRITE
