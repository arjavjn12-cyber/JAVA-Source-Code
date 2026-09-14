abstract class Enemy{
    abstract void attack(); // this is called abstract method and they dont have body like that {....}
}

// if child does not implemet the abstract method then compile error will occur
// and if zombie is also a abstract class then it is fine

class Zombie extends Enemy{
    @Override
    void attack(){
        System.out.println("Zombie bites");
    }
}

class Robot extends Enemy{
    @Override
    void attack(){
        System.out.println("Robot shoots");
    }
}

public class P09_Abstraction  {
    public static void main(String[] args){
        Zombie z = new Zombie();
        z.attack();

        Robot r = new Robot();
        r.attack();
    }    
}

// It means showing only the essential details and hiding implementation details.
// Abstract class cannot be instantiated cuzz there is no full defination of method 
// But reference can be Abstract type and point to child object must
// Abstract method must belong to an abstract class and it can have 0 abstract methods

// so abstract class can contain:
// Concrete methods       ✅
// Abstract methods       ✅
// Variables              ✅
// Constructors           ✅ can be called by super through child
// Static members         ✅
