public class P29_interrupt {
    public static void main(String[] args) {

        Thread worker = new Thread(() -> { // case 1

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Worker is working...");
            }

            System.out.println("Worker stopped.");
        });

        worker.start();

        worker.interrupt();
    }
}


//           MAIN THREAD
    //            |
    //            |
    //    worker.interrupt()
    //            |
    //            v
    //  Interruption signal sent
    //            |
    //            v
    //      WORKER THREAD
    //            |
    //            v
    //   Checks interruption
    //            |
    //            v
    //  Decides to stop working


// Case 2:-

// Thread worker = new Thread(() -> {
//     while (true) {
//         System.out.println("Working...");
//     }
// });
// worker.start();
// worker.interrupt();


// Case 3:-

// public class Main {
//     public static void main(String[] args) {
//         Thread worker = new Thread(() -> {

//             try {
//                 System.out.println("Worker going to sleep...");
//                 Thread.sleep(5000);
//                 System.out.println("Worker woke up normally.");
//             } catch (InterruptedException e) {
//                 System.out.println("Worker was interrupted!");
//             }
//         });

//         worker.start();
//         worker.interrupt();
//     }
// }


// | Case                                             | Working                                                           | `interrupt()` ka effect                                                   | Result                                                                                         |
// | ------------------------------------------------ | ----------------------------------------------------------------- | ------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
// | **Case 1: Thread interruption check karta hai**  | Thread `isInterrupted()` se interrupt status check karta hai.     | Interrupt status set ho jaata hai.                                        | Thread condition check karke apna kaam stop kar sakta hai.                                     |
// | **Case 2: Thread interruption check nahi karta** | Thread `while(true)` jaise loop mein continuously kaam karta hai. | Interrupt status set hota hai, lekin thread automatically stop nahi hota. | Thread loop continue kar sakta hai.                                                            |
// | **Case 3: Thread `sleep()` kar raha hai**        | Thread `Thread.sleep()` se temporarily paused hai.                | Sleep ke dauran interrupt hone par `InterruptedException` throw hoti hai. | Control `catch` block mein jaata hai; uske baad thread ka behaviour code par depend karta hai. |
