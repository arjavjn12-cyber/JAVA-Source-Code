public class P26_ThreadLifecycle {
    public static void main(String[] args){
        Thread t = new Thread(() -> {
            System.out.println("Worker is running");
        });
        System.out.println(t.getState()); // to get the state of thread
        t.start();
        System.out.println(t.getState());
    }    
}


//        NEW
//         |
//         | start()
//         v
//      RUNNABLE
//         |
//         | Thread gets CPU time
//         v
//      EXECUTING
//         |
//         | Task finishes
//         v
//    TERMINATED
// Conceptual diagram not the official one


// The six official thread states
// | State           | Meaning                                                      | Example                                               |
// | --------------- | ------------------------------------------------------------ | ----------------------------------------------------- |
// | 1 `NEW`           | Thread object created, but `start()` hasn't been called.     | `Thread t = new Thread(task);`                        |
// | 2 `RUNNABLE`      | Thread is eligible to run or is currently executing.         | After `t.start()`                                     |
// | 3 `BLOCKED`       | Thread is waiting to acquire a monitor lock.                 | Another thread owns the required `synchronized` lock. |
// | 4 `WAITING`       | Thread is waiting indefinitely for another thread or action. | `t.join()` without a timeout                          |
// | 5 `TIMED_WAITING` | Thread is waiting for a specified period.                    | `Thread.sleep(1000)`                                  |
// | 6 `TERMINATED`    | Thread has finished executing.                               | The `run()` method finishes.                          |

// Once the thread has finished its execution. Then it cannot be restarted
// t.start();
// t.start();  Illegal