import java.io.File;

public class P10_File_Handling{
    public static void main(String[] args){
        File file = new File("Student.txt");
        System.out.println(file.exists());
    }
}

// So far our java programs mostly work with data while the program is running.
// That data exists in memory while the program is running.
// When the program ends:
// Program ends
//      |
// variable disappears

// But what if we want the data to stay even after the program closes?
// We can store it in a file:
// student.txt
// Then:
// Java Program
//      ↕
//    File
//      ↕
// student.txt
// That's file handling.

// .exists() --> if the file exists then true or else false

// File file = new File("student.txt");
// Java isn't opening the file.
// It's basically creating an object containing information about a path.
// Something conceptually like:
// file
//  ↓
// path = "student.txt"
// Then:
// file.exists()
// asks the operating system:
// "Does something exist at this path?"