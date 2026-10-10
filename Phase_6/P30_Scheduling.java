public class P30_Scheduling {
    public static void main(String[] args) {
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
}

// Iska matlab ye nahi hai ki t1 poora execute hoga aur uske baad t2 execute hoga.
// Dono threads execution ke liye eligible ho jaate hain.
// Ab scheduling decide karti hai ki unhe execution time kab milega.

// Conceptually:
//            Main Thread
//                 |
//           +-----+-----+
//           |           |
//           v           v
//        Thread A    Thread B
//           |           |
//           +-----+-----+
//                 |
//                 v
//        CPU scheduling decides
//        when each thread runs

// Agar system mein multiple CPU cores hain, toh threads actual mein parallel bhi execute ho sakte hain.
// Agar ek hi CPU core par execute ho rahe hain, toh operating system unke beech execution switch kar sakta hai.
// Important: Multithreading ka matlab ye nahi ki output hamesha alternate hoga. Scheduler ek thread ko kaafi der tak execute hone de sakta hai.


// Java threads ko priorities assign karne ka option bhi deta hai.
// t1.setPriority(Thread.MIN_PRIORITY);
// t2.setPriority(Thread.MAX_PRIORITY);
// Java mein priority values:

// Constant	                Value
// Thread.MIN_PRIORITY	    1
// Thread.NORM_PRIORITY	    5
// Thread.MAX_PRIORITY	    10

