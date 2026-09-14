public class P11_MultipleInheritance {
    
}

// Multiple inheritance means  one class inherits froom more than one parent class
// class D extends B, C
// ❌ Not allowed.

// so basically one class can extend only one class

// Now the diamond problem
//         Animal
//     /     \
//    /       \
//  Dog       Cat
//    \       /
//     \     /
//     Hybrid


    //              JAVA

    //     CLASS INHERITANCE
    //             │
    //             ▼
    //    Only ONE parent class
    //             │
    //             ▼
    //   Avoids multiple inheritance
    //          ambiguity


    //     INTERFACE IMPLEMENTATION
    //             │
    //             ▼
    //   Multiple interfaces allowed
    //             │
    //             ▼
    //     Abstract methods?
    //             │
    //           No issue
    //             │
    //             ▼
    //   Class implements method


    //     Default method conflict?
    //             │
    //             ▼
    //     Class MUST override
    //             │
    //             ▼
    //    Explicitly resolve conflict