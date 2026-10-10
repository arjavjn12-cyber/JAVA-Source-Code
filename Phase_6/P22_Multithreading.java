public class P22_Multithreading {
    public static void main(String[] args){
        Thread t = new Thread(()-> { // Thread object initialization
            System.out.println("Worker thread is running");
        });
        t.start(); // Thread start executing.
        System.out.println("Main thread is running");
        // The main thread doesn't automatically wait for the worker to finish.

        // Therefore, the print statements can appear in either order.
        // The operating system schedules the threads, so we shouldn't assume a fixed execution order.
    }
}


// When a java application starts the JVM creates a main thread that begins executing ur main() method.
//            Java Application
        //           |
        //           v
        //       Main Thread
        //           |
        //           v
        //      main() method
        //           |
        //   +-------+-------+
        //   |       |       |
        //   v       v       v
        // Task 1  Task 2  Task 3

// Think of a thread as an independent path of execution within a program.

// Suppose your program has these tasks:
// Download a file.
// Play music.
// Update a progress indicator.

// You could execute them sequentially:
// Download → Play Music → Update Progress

// Instead,we can create multiple threads:
//                  Application
//                       |
//           +-----------+-----------+
//           |           |           |
//           v           v           v
//        Thread 1    Thread 2    Thread 3
//           |           |           |
//           v           v           v
//        Download    Play Music   Update UI

// IMPORTANT: Multiple threads don't necessarily execute at the exact same instant. 
// They can make progress concurrently through scheduling, or execute in parallel on different CPU cores.


// Process VS Thread
// | Process                                                                     | Thread                                                 |
// | --------------------------------------------------------------------------- | ------------------------------------------------------ |
// | Running instance of a program                                               | Execution path within a process                        |
// | Has its own process memory space                                            | Shares the process's memory space with other threads   |
// | Processes are isolated from each other by default                           | Threads can access shared objects within their process |
// | Communication between processes generally requires inter-process mechanisms | Threads can communicate through shared memory          |
// | Creating and managing a process generally involves more overhead            | Threads are generally lighter-weight than processes    |
