public class P27_Sleep {
    public static void main(String[] args){
        Thread worker = new Thread(() -> {
            System.out.println("Worker: Started");

            try { // Java requires us to handle that exception or declare that our method can pass it to its caller.
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Worker interrupted");
            }

            System.out.println("Worker: Finished");
        });

        worker.start();

        System.out.println("Main: Finished");
    }    
}
// | Step | What happens?                                 |
// | ---- | --------------------------------------------- |
// | 1    | The main thread prints `Hello`.               |
// | 2    | `Thread.sleep(2000)` pauses the main thread.  |
// | 3    | Approximately 2 seconds pass.                 |
// | 4    | The main thread continues and prints `World`. |



// To pause the thread for sometime we use Sleep(time is in milliseconds)
// pauses the currently executing thread for a specified period.
// sleep() pauses the current thread, not necessarily the thread whose object you happen to be holding.
