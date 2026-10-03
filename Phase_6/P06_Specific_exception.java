public class P06_Specific_exception {
    public static void main(String[] args){
        try{
            int x = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}

// A try must be followed by at least one:
// catch or finally

// there are many types of inbuilt exception 
// the most knowns are:

// ArithmeticException --> happens with an invalid arithmetic operation
// ArrayIndexOutOfBoundException --> you tru to access an array position that doesn't exist
// NullPointerException --> You try to use an object reference that is null.
// NumberFormatException --> You try to convert something that isn't a valid number.
// InputMismatchException --> very common with scanner (if diff type of input is given).
// StringIndexOutOfBoundsException --> You try to access a character position that doesn't exist.
// ClassCastException --> You try to cast an object to an incompatible type.
