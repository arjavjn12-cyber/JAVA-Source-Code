public class P02_Parameters {

    public static void greet(String name, int age ){ // Name = parameter
        System.out.println("Hello " + name);
        System.out.println("My age is " + age);
    }
    public static void main(String[] args){
        greet("Avnish",44); // Avnish = argument
    }
}

// Jo intput daala function me bracket ke (input)
// parameteres order matters cannot disturb the order of that