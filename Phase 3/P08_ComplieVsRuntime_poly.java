// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
//     double add(double a, double b) {
//         return a + b;
//     }
// }

// This is compile time polymorphism Method overloading
// And jo animal class and dog class ke ka apas me relation ke thorugh overriding ho rhi h use Runtime bolte h
// But variables cannot be overridden like methods

// Static, Private, Final do not participates in runtime polymorphism

public class P08_ComplieVsRuntime_poly {
    
}

// Polymorphism simply means:
// Same method name/ interface, but different behavior depending on the situation

// Polymorphism
// │
// ├── Compile-Time
// │     └── Method Overloading
// │
// └── Runtime
//       └── Method Overriding

// |                          | Compile-Time                          | Runtime                |
// | ------------------------ | ------------------------------------- | ---------------------- |
// | Main mechanism           | Overloading                           | Overriding             |
// | Decision                 | Compiler                              | Runtime                |
// | Inheritance required?    | ❌                                     | ✅                      |
// | Parameters               | Different                             | Same                   |
// | Actual object important? | Generally no                          | **Yes**                |
// | Example                  | `add(int,int)` / `add(double,double)` | `Animal a = new Dog()` |