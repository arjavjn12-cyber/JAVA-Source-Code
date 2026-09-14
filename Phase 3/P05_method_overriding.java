class Vehicle{
    void sound(){
        System.out.println("Broommm Broommmm");
    }
}

class Car extends Vehicle{
    @Override
    void sound(){
        System.out.println("Rattatatata");
    }
}

public class P05_method_overriding {
    public static void main(String[] args){
        Car c = new Car();
        c.sound();
    }
}

// Chlid class parent ke method ko apne hisab se dobara implement krti hai
// @override this is not need to be necessary to write every time but it is good practice
// lekin if we write @override vala bkchodi toh jis function ke upr likha h toh uska error detect kr leta h 

// Rules for Mehtod overriding
// 1) Method naem saem hona chahiye 
// 2) Parameters same hona chahiye 
// 3) Return type compatible hona chahiye
// 4) Access level kam restrictive nahi ho skata.

// | Overloading          | Overriding      |
// | -------------------- | --------------- |
// | Same class           | Parent + Child  |
// | Same name            | Same name       |
// | Different parameters | Same parameters |
// | Compile-time         | Runtime         |