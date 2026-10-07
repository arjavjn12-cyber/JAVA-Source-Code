import java.io.File;
import java.io.IOException;

public class P12_fileMethods {
    public static void main(String[] args)throws IOException{
        File file = new File("hello.txt");

        System.out.println(file.exists());
        System.out.println(file.isFile());
    }
}

// file.exists() → does it exist
// file.isFile() → Is it a file?
// file.isDirectory() → Is it a directory?
// file.getName() → Get the name.
// file.getPath() → Get the path you provided.
// file.length() → File size in bytes.
// file.delete() → Delete the file.

// new File()
//     ↓
// "I know where the file is."

// createNewFile()
//      ↓
// "Actually create it."