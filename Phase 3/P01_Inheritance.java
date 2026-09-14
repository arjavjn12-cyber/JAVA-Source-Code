class Animal{

    String name = "Animal"; 
    Animal(int a){
        System.out.println(a+"Animal constructor");
    }
    
    void sound(){
        System.out.println("Animal Sound");
    }
} // Base/Super class

class Dog extends Animal{ // this is how we take the inheritance in java
    
    String name = "Dog";
    Dog(){
        super(2);
        System.out.println("Dog constructor");
    }
    
    void sound(){
        super.sound();
        System.out.println("Bhauu bhauuu");
    }

    void display(){
        System.out.println(name);
        System.out.println(super.name); // by adding this here it will print animal 
    }
} // Child/Sub/Derived class

public class P01_Inheritance {
    public static void main(String[] args){
        Dog d = new Dog(); // object created 
        d.sound();
    }
}

// Creating a new class using an existing class
// that new class will get the properties and methods of old class

// Extends keyword means that inherit from

// Dog Object
// [ inherited Animal part + Dog part ]

// Construtor of the base class cannot be inherit in derived class
// private also is not accessible in derived class
// We can inherit multiple levels

// How JVM internally works for inheritance
// when we give d.eat() then JVM searches 
// Dog?
//  ↓
// Not found
// Animal?
//  ↓
// Found
// Then executes method
// So inheritance is relationship-based, not code-copying