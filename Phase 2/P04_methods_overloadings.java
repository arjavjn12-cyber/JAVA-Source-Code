public class P04_methods_overloadings{

    public static int add(int a,int b){
        return (a + b);
    }

    public static int add(int a,int b,int c){
        return (a + b + c);
    }

    public static void show(int number){
        System.out.println("The number is: " + number);
    }

    public static void show(String name){
        System.out.println("The name is: " + name);
    }

    public static void main(String[] args){
        show(34);
        show("Tony");
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
    }
}

// add(a,b)
// addthree(a,b,c)
// addfour(a,b,c,d)
// instead of writing it repeatedly
// this is bad for java compiler so 
// It provides overloading like we can do it
// add(a,b)
// add(a,b,c)
// this number of parameters

// type of parameters ==> datatype different of input parameters
// not the method type]