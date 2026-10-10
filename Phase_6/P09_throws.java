public class P09_throws {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are allowed.");
    }

    public static void main(String[] args) {

        try {
            checkAge(25);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
// "This method may cause/propagate this exception. 
// I'm not handling it here; the caller may need to handle it."


// CASE1:
// public class Main {
//     static void methodC() throws InterruptedException {
//         Thread.sleep(2000);
//     }
//     static void methodB() throws InterruptedException {
//         methodC();
//     }
//     static void methodA() throws InterruptedException {
//         methodB();
//     }

//     public static void main(String[] args) {
//         try {
//             methodA();
//         } catch (InterruptedException e) {
//             System.out.println("Exception handled!");
//         }
//     }
// }

//              main()
    //             |
    //             v
    //          methodA()
    //             |
    //             v
    //          methodB()
    //             |
    //             v
    //          methodC()
    //             |
    //             v
    //     Thread.sleep(2000)
    //             |
    //             |
    //    If InterruptedException
    //             |
    //             v
    //       methodC() throws
    //             |
    //             v
    //       methodB() throws
    //             |
    //             v
    //       methodA() throws
    //             |
    //             v
    //    main() catches exception
    //             |
    //             v
    //    "Exception handled!"




// CASE 2:
// public class Main {
//     public static void main(String[] args) throws InterruptedException {
//         Thread.sleep(2000);
//         System.out.println("Hello");
//     }
// }

//               JVM
    //            |
    //            v
    //          main()
    //            |
    //            v
    //    Thread.sleep(2000)
    //            |
    //            |
    //   If InterruptedException
    //            |
    //            v
    //    main() doesn't catch it
    //            |
    //            v
    //    Exception escapes main()
    //            |
    //            v
    //    JVM reports uncaught exception
    //            |
    //            v
    //    Main thread terminates