public class P07_Final {
    public static void main(String[] args){
        try {
            int x = 10 / 2;
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

// finally contains code that you want to execute after the 
// try/catch process, whether an exception happened or not.

// If there is no catch then writing finally also covers it there is no prblm
