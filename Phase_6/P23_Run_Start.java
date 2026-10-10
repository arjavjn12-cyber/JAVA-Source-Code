public class P23_Run_Start {
    public static void main(String[] args){
        Thread t = new Thread(() -> {
            System.out.println("Worker task");
        });
        t.start();
        // Calling start() initiates a new thread of execution, which then executes the assigned task.

        t.run();
        // Here, you're simply calling the run() method like an ordinary method.
        // Calling run() directly does not start a new thread.
    }    
}


// t.start()
//     |
//     v
// New thread starts
//     |
//     v
// Task executes on that thread
// The important point is that the main thread doesn't have to wait for the worker thread to finish.
// Both threads can make progress independently.


// t.run()
//     |
//     v
// Ordinary method call
//     |
//     v
// Task executes on current thread

// Notice something interesting: the worker's message always appears first in this example.
// Why?
// The main thread calls run(), executes its code, and returns. Only then does the main thread execute the next statement.
// No new thread of execution is started.


// | Feature                                       | `t.start()`       | `t.run()`                                          |
// | --------------------------------------------- | ----------------- | -------------------------------------------------- |
// | Creates a new thread of execution?            | Yes               | No                                                 |
// | Executes the task?                            | Yes               | Yes                                                |
// | Executes the task on a separate thread?       | Yes               | No, direct call runs on the calling thread         |
// | Does the caller wait for the task to finish?  | Not automatically | Yes, because it's a normal synchronous method call |
// | Can you start the same `Thread` object again? | No                | `run()` can be called again as an ordinary method  |


// Thread.currentThread() gives us the thread currently executing the code.
// .getName() returns that thread's name.