class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Task is running");
        System.out.println("Downloading file...");
    }
}
// Runnable is inbuilt java interface 
// interface Runnable {
//     void run();
// } for understading; actual JDK mein defined hota h 

public class P25_RunnableInterfaces {
    public static void main(String[] args){
        MyTask m = new MyTask();
        Thread t = new Thread(m); // from here thread will know which task it have to do
        t.start();
        System.out.println("Main thread continues");
    }
}

// Problem: Suppose we want to execute a task but task shoudl be separated from thread
//        TASK
//    What to do?
//         |
//         v
//      Runnable
//         |
//         v
//       Thread
//    How to execute?

// | `Runnable`                                      | `Thread`                                                         |
// | ----------------------------------------------- | ---------------------------------------------------------------- |
// | Task represent karta hai                        | Thread of execution represent karta hai                          |
// | `run()` method define karta hai                 | `start()` method provide karta hai                               |
// | Khud se new thread start nahi karta             | `start()` call karne par new thread of execution start karta hai |
// | Multiple threads ko same task diya ja sakta hai | Har `Thread` object ek particular thread ko represent karta hai  |


// Runnable
//    |
//    v
// Defines WHAT to execute
//    |
//    v
// Thread receives the task
//    |
//    v
// start()
//    |
//    v
// A new thread executes run()

// | Benefit           | Explanation                                           |
// | ----------------- | ----------------------------------------------------- |
// | **Clean code**    | Separates task logic from thread creation.            |
// | **Reusability**   | The same task can be passed to different threads.     |
// | **Flexibility**   | The task is independent of the `Thread` class.        |
// | **Better design** | Follows the principle of separating responsibilities. |
