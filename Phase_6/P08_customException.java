import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class P08_customException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        try{
            if(x<0){
                throw new InvalidAgeException("Age cannot be negative");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

// InvalidAgeException
//         │
//         │ super(message)
//         ▼
// Exception(String message)

// new InvalidAgeException("Age cannot be negative")
//                 ↓
// InvalidAgeException constructor
//                 ↓
// super(message)
//                 ↓
// Exception stores message
//                 ↓
// e.getMessage()
//                 ↓
// "Age cannot be negative"