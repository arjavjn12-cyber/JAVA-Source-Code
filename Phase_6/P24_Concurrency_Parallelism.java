public class P24_Concurrency_Parallelism {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B: " + i);
            }
        });

        t1.start();
        t2.start();
    }    
} // output can vary. Because we haven't specified which thread must execute first or how their outputs must interleave.


// Concurrency ka matlab hai multiple tasks ki execution overlapping periods mein progress kar sakti hai.
// Imagine ek CPU core hai aur do threads hain.
// Time ──────────────────────────►
// Thread A:  A A A       A A A
// Thread B:        B B B       B B B

// Is switching ko context switching kehte hain.
// Important: Concurrency ka matlab zaroori nahi ki tasks simultaneously execute ho rahe hon. 
// Matlab ye hai ki multiple tasks overlapping periods mein progress kar sakte hain.


// Parallelism  ka matlab hai multiple tasks literally same time par execute ho rahe hain.
// Suppose CPU mein multiple cores available hain.

// Time ──────────────────────────►
// Core 1:  A A A A A A A A A
// Core 2:  B B B B B B B B B


// | Feature                      | Concurrency                                           | Parallelism                                            |
// | ---------------------------- | ----------------------------------------------------- | ------------------------------------------------------ |
// | Meaning                      | Multiple tasks make progress over overlapping periods | Multiple tasks execute simultaneously                  |
// | Requires multiple CPU cores? | No                                                    | Typically, yes                                         |
// | Can use one thread?          | Yes, depending on the execution model                 | No, not for executing independent tasks simultaneously |
// | Main idea                    | Managing multiple tasks                               | Simultaneous execution                                 |
// | Java example                 | Switching between threads on one core                 | Two threads executing on separate cores                |
