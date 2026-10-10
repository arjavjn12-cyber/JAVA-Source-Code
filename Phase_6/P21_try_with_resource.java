// We must close resources when we're done using them.
// Why?
// When Java opens a file for reading or writing, the operating system allocates resources to handle that operation. We should release those resources when we're finished.


import java.io.FileWriter;
import java.io.IOException;

public class P21_try_with_resource {
    public static void main(String[] args) throws IOException{
        try(FileWriter writer = new FileWriter("Student.txt")){
            writer.write("Hello Java!@!");
        }
//      try (Open the resource){
//          Perform operations
//      }
//           ↓
//      try block finishes
//           ↓
//      Resource closes 
//      automaticallyOne important detail: this works for resources that implement AutoCloseable (including file readers and writers).
    }
}
// if any exception even occurs in the try block then 
// File opens
//   ↓
// Text is written
//    ↓
// ArithmeticException occurs
//    ↓
// Java closes FileWriter automatically
//    ↓
// Exception propagates to the caller



// FileWriter writer = new FileWriter("data.txt");
// writer.write("Hello Java!");
// int result = 10 / 0;  // ArithmeticException
// writer.close();

// What happens here?
// Execution goes like this:
// FileWriter opens data.txt
//           ↓
// Text is written
//           ↓
// 10 / 0 executes
//           ↓
// ArithmeticException occurs
//           ↓
// writer.close() is skipped! ❌
// The exception interrupts normal execution, so our close() statement might never execute.
// That's the problem we're solving.


// We can use it with Buffered reader and writer also we can use multiple resource in try block
