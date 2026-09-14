// So what does type casting mean,
// It means that to change the datatype of a variable.

// Types of type casting:
// 1. Implicit Type Casting (Widening)
// 2. Explicit Type Casting (Narrowing)

// Implicit Type Casting (Widening):
// Example: 
// int a = 10;
// double b = a;
// int --> double

// Explicit Type Casting (Narrowing):
// Example:

public class P05_TypeCasting {
    public static void main(String[] args){
        double x=16.5;
        int y=(int)x;

        System.out.println(y);
    }    
}
// basically here we are giving the permission to jvm 
// to lose that 0.5 data and convert it to int.
