public class P28_Join {
    public static void main(String[] args) throws InterruptedException{
        Thread worker = new Thread(() -> {
            System.out.println("Worker: Task started");
            System.out.println("Worker: Task completed");
        });

        worker.start();
        worker.join();

        System.out.println("Main: Program completed");
    }
}

// Current thread, worker thread ke terminate hone tak wait karega.
// Yahan current thread main hai, isliye main thread worker ke finish hone tak wait karega.

//            MAIN THREAD
    //             |
    //             v
    //       worker.start()
    //             |
    //             v
    //       worker.join()
    //             |
    //             | Main waits
    //             |
    //     +-------+--------+
    //     |                |
    //     v                v
    // MAIN THREAD      WORKER THREAD
    //   WAITING          Executes task
    //     |                |
    //     |                v
    //     |          Task completed
    //     |                |
    //     |                v
    //     |          Thread terminates
    //     |                |
    //     +<---------------+
    //             |
    //             v
    //    Main continues execution
    //             |
    //             v
    //   "Main: Program completed"



// | Feature                                | `sleep()`                                  | `join()`                                        |
// | -------------------------------------- | ------------------------------------------ | ----------------------------------------------- |
// | Purpose                                | Current thread ko time ke liye pause karna | Kisi doosre thread ke finish hone ka wait karna |
// | Example                                | `Thread.sleep(2000)`                       | `worker.join()`                                 |
// | Wait duration                          | Specified time                             | Normally, jab tak target thread terminate na ho |
// | Thread state while waiting             | `TIMED_WAITING`                            | `WAITING` for ordinary `join()` without timeout |
// | Kya task completion ka wait karta hai? | Nahi                                       | Haan                                            |