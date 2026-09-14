public class P01_methods{
    
    public static void greet(){ // since it is public then we can access it anywhere
        System.out.println("Hello"); // Static is used here because main() is in static if we dont declare it static then it willgive compiler error 
    }
    public static void main(String[] args){
        greet();
    }
}

// Method = code ka reusable machine

// The main reasons of methods to use:
// 1. Reusability (Ek baar likho, 100 baar use kro)
// 2. Readability (No need to rewrite the codes)
// 3. Maintainability

// Internal Thinking
// Whithout methods:
// Main Method
//  ├─ Code
//  ├─ Code
//  ├─ Code
//  ├─ Code
//  ├─ Code
//  └─ Code  (Huge mess)

// With methods
// Main Method
//  ├─ login()
//  ├─ calculateBill()
//  ├─ printInvoice()
//  └─ logout() (Much cleaner)