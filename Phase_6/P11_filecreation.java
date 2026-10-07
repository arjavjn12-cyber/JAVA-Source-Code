import java.io.File;
import java.io.IOException;

public class P11_filecreation {
    public static void main(String[] args) throws IOException{
        File file = new File("Student.txt");

        if(file.createNewFile()){ // this method always return in boolen
            System.out.println("File created.");
        }
        else{
            System.out.println("File already exists.");
        }
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }   
}

// createNewFile() can cause an I/O-related exception.
// so Java requires us to either handle it with ry and catch or declare

// Now where dies student.txt get created 
// "Create/find student.txt relative to the program's current working directory."
// we can also specify the path of file eg:- File file = new File("data/student.txt");
// but the condition is that data should also exist in the file or directory

// File can represent directories too
// We can check them by folder.isDirectory() and file.isFile()