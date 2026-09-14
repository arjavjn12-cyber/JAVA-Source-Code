public class P07_Dynamic_Dispatch_Method {
    public static void main(String[] args){
        // Variables 
        // Reference type dekha jata h 

        // Mehtods (overridden)
        // object type dekha jata hai
        A a = new B();
        System.out.println(a.age);
        a.s();
    }
}
// now why all this happen 
// cuzz variables are Resolved at compile time:-
// compiler will see animal a and say animal ref. h 
// then a.age means animal.age

// methods are resolved at runtime 
// compiler sirf itna check krta h 
// animal me sound() exist krta h ?
// yes compile successful 
// ab runtime pr jvm dekhti h 
// reference kis object ko point kar rha h == dog object 

// Reference →
// Dog Object
// ↓
// Dog class me sound()?
// ↓
// YES
// ↓
// Execute Dog.sound()

// if child class have any extra method which is apperently not in parent class then it will show error 
// cause reference is from parent class toh vo check krta h 

            //         COMPILE TIME
            //              │
            //              ▼
            //   ┌────────────────────┐
            //   │ Reference = Animal  │
            //   │ Does Animal have    │
            //   │ sound()?            │
            //   └─────────┬──────────┘
            //             │ YES
            //             ▼
            //         COMPILE OK
            //             │
            //             ▼
            //          RUNTIME
            //             │
            //             ▼
            //   ┌────────────────────┐
            //   │ Actual Object      │
            //   │ = Dog              │
            //   └─────────┬──────────┘
            //             │
            //             ▼
            //   Dog overrides sound()?
            //             │
            //            YES
            //             │
            //             ▼
            //       Dog.sound()