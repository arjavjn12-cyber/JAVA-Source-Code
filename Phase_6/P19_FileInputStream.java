import java.io.FileInputStream;
import java.io.IOException;

public class P19_FileInputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("Student.txt");
        int data;

        while ((data = input.read()) != -1) {
            System.out.println(data);
        }

        input.close();
    }
}


// FileReader
//     ↓
// characters / text

// FileInputStream
//     ↓
// raw bytes

// |                    | `FileReader`                    | `FileInputStream`      |
// | ------------------ | ------------------------------- | ---------------------- |
// | Works with         | Characters                      | Bytes                  |
// | Best for           | Text                            | Binary/raw data        |
// | Example            | `.txt`                          | `.jpg`, `.mp3`, `.pdf` |
// | `read()`           | Character data                  | Byte data              |
// | Encoding awareness | Yes, through character decoding | No character decoding  |
