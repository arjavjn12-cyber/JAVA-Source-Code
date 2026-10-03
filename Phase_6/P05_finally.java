public class P05_finally {
    public static void main(String[] args){
    try {
        int x = 10 / 0;
        System.out.println(x);
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
    finally {
        System.out.println("Finally executed");
    }
    }
}

// Exception occurs
//       ↓
// catch handles it
//       ↓
// Program continues