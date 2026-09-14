class college{
    int regno;
    String name;
    static String collegename = "VIT";
}

public class P11_Static {
    public static void main(String[] args){
        System.out.println(college.collegename); // Object create krni ki jrurt nhi h if static 
        // direct access hota h
        
    }
}

// Static means vo change nhi hoga already define h 
// and ek hi copy hogi static ki not many 
// all objects will share static, unlike non static (regno,name)

// STATIC METHODS
// main() ko bhi static isiliye rkha gya h jb JVM call krta h toh koi object nhi rehta isiliye static use krte h

// Static methods can directly access static variables and cannot directly access non static 
// but non static methods can access anything
// CONSTRUCTOR CAN NEVER BHI STATIC
