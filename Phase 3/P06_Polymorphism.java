class A{
    int age = 10;
    void s(){
        System.out.println("Hiii");
    }
}

class B extends A{
    int age = 20;
    @Override
    void s(){
        System.out.println("Hello");
    }
}

public class P06_Polymorphism{
    public static void main(String[] args){
        A a = new B();
        a.s();
    }
}

// we can see that even after reference type is A(Animal)
// But the object type is B(Dog)
// still the output was of B

// Dog Object
// +----------------------+
// | Animal Part          |
// +----------------------+
// | Dog Part             |
// +----------------------+

// so what is happening here is that reference ka kaam sirf object address hold krna h 

//Animal Reference
//         │
//         ▼
// +----------------------+
// |      Dog Object      |
// +----------------------+
// so that animal refernce is pointing towards dog
// This allowed cuzz Dog is a animal but vice versa not allowed

// Continuation in next file p07