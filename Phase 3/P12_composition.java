class Engine{
    void start(){
        System.out.println("Engine Started");
    }
}

class car{
    Engine e = new Engine();

    void startCar(){
        e.start();
    }
}

public class P12_composition {
    public static void main(String[] args){
        car c = new car();
        c.startCar();
    }
}
// creating a classs using objects of other classes
// one object HAS-A another object.
// car HAS-A Engine , A car is not an engine
// but car IS-A Engine this is wrong 


// Memory map of what happening actually
// Stack
// ┌─────────────┐
// │ car ────────┼──────────────┐
// └─────────────┘              │
//                              ▼
// Heap                     ┌─────────┐
//                          │   Car   │
//                          │         │
//                          │ engine ─┼──────┐
//                          └─────────┘      │
//                                           ▼
//                                      ┌──────────┐
//                                      │  Engine  │
//                                      └──────────┘

// SO BASICALLY while inheritance it is know as IS-A.

// | Inheritance              | Composition                        |
// | ------------------------ | ---------------------------------- |
// | `extends`                | Object reference                   |
// | IS-A                     | HAS-A                              |
// | Strong relationship      | Usually more flexible relationship |
// | Child inherits behavior  | Object delegates behavior          |
// | One parent class in Java | Can contain many objects           |
// | Hierarchy-based reuse    | Component-based reuse              |
