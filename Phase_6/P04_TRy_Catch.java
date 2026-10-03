public class P04_TRy_Catch{
    public static void main(String[] args){
        
        int a = 10;
        int b = 0;
        try{
            int result = a / b;
            System.out.println(result);
            // risky code
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
            System.out.println(e);
            // handle the problem
        }
        System.out.println("Program continues...");
    }
}

// An exception is basically:
// An event that occurs during program execution that disrupts the normal flow of the program.
// Exception occurs
//       ↓
// catch handles it
//       ↓
// Program continues