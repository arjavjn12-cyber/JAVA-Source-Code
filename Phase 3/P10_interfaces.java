interface Flyable{
    void fly();
}

class Bird implements Flyable{

    @Override
    public void fly(){
        System.out.println("Bird is flying");
    }
}

public class P10_interfaces {
    public static void main(String[] args){
        Bird b = new Bird();
        b.fly();
    }
}

// interface method is public but you are trying to make the implementation package - private.
// interface cannot be instantiated
// but Flyable f = new Bird() this is valid 
// we can also implements multiple interfaces

// interfaces can also have methods and it can be used as default void show() and can be also override by class

// intereface variables mtlb vo automatically public static final

// interface Constants {
//     int MAX = 100;
// }
// conceptually: public static final int MAX = 100;

// agar interface ke andr static method h toh usko interface ke name se hi call krenge
// and private method ko direct default ke andr ke through call krenge 

// INTERFACE METHODS
// │
// ├── abstract
// │      ↓
// │   No body
// │   Child MUST implement
// │
// ├── default
// │      ↓
// │   Has body
// │   Child MAY override
// │
// ├── static
// │      ↓
// │   Belongs to interface
// │   InterfaceName.method()
// │
// └── private
//        ↓
//     Helper method
//     Only interface ke andar
