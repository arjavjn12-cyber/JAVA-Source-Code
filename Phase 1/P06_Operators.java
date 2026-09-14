// Arithmetic Operators
// +
// -
// *
// /
// % 

public class P06_Operators {
    public static void main(String args[]){
        int a = 10;
        int b = 3;
        int c = 5;

        c++;
        System.out.println("Value of c after increment: " + c); // Output will be 6

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
    }
}
// Division me point isiliye nahi aata kyunki dono operands int hai,
// agar a ya b me se koi bhi double hota to result me point aata.


// Increment and Decrement Operators

// Increment (++)

// Example:
// int x = 5;
// x++;
// System.out.println(x);
// Output will be 6 because x is incremented by 1.
// Types of Increment:
// 1. Post-increment: x++ (value is used first, then incremented)
// 2. Pre-increment: ++x (value is incremented first, then used


// Decrement (--)
// Example:
// int y = 5;
// y--;
// System.out.println(y);
// Output will be 4 because y is decremented by 1.
// Types of Decrement:
// 1. Post-decrement: y-- (value is used first, then decremented)
// 2. Pre-decrement: --y (value is decremented first, then used


// Once a string appears in the chain, the remaining + operations become concatenation,
// because the left operand is now a String