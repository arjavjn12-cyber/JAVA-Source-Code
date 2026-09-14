class practice{
    private int age;
    private String name;

    practice(int a,String n){
        age = a;
        name = n;
    }

    void getDetail(){
        if( age >= 0 && age <= 100){
            System.out.println("The age is: " + age);
            if(name!= null){
                System.out.println("Name: " + name);
            }
        }
    }

}

public class P12_Encapsulation {
    public static void main(String[] args){
        practice p = new practice(18,"Arjav");
        p.getDetail();
    }    
}


// wrapping data methos into a single unit and controlling direct access to data.
// also we can do one more thing like validation(coditions what we want to apply).

// Access Modifiers
// Public: accessible everywhere
// Private: only inside same class
// default: Nothing written (package private level)
// Protected: same logic as in c++ , Inheritance ke time kaam aata hai

// yha agr kuch nhi likha toh access default rhega    