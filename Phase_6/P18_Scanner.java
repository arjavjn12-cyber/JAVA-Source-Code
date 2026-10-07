import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P18_Scanner {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Student.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}


// Scanner scanner = new Scanner(file);
// means: File → Scanner

// scanner.hasNextLine()
// asks: "Is there another line available?"

// Is there another line?
//        ↓
//      YES
//        ↓
// Read it
//        ↓
// Print it
//        ↓
// Is there another line?
//        ↓
//       ...
//        ↓
//      NO
//        ↓
//     STOP

// Scanner scanner = new Scanner(new File("data.txt"));
// String name = scanner.next();
// int age = scanner.nextInt();
// double marks = scanner.nextDouble();