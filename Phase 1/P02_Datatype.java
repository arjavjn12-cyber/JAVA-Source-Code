// Java has 2 categories of data types:
// 1. Primitive Data types
// 2. Non-Primitive Data types

// Primitive Data Types:
// 1. byte: 8 bits, range: -128 to 127 or 0 to 255
// 2. short: 16 bits, range: -32,768 to 32,767
// 3. int: 32 bits, range: -2,147,483,648 to 2,147,483,647
// 4. long: 64 bits, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// 5. float: 32 bits, range: ±1.4E-45 to ±3.4028235E38
// 6. double: 64 bits, range: ±4.9E-324 to ±1.7976931348623157E308
// 7. char: 16 bits, range: '\u0000' (or    0) to '\uffff' (or 65,535)
// 8. boolean: 1 bit, values: true or false


public class P02_Datatype {
    public static void main(String[] args){

        int age = 20;
        float price = 19.999f; // float literals must end with 'f' or 'F'
        double pi = 3.14159;
        char grade = 'A';
        boolean passed = true;
        String name = "Tony";

        System.out.println(age);
        System.out.println(price);
        System.out.println(pi);
        System.out.println(grade);
        System.out.println(passed);
        System.out.println(name);
    }    
}


// | Type    | Size          | Example      |
// | ------- | ------------- | ------------ |
// | byte    | 1 byte        | 100          |
// | short   | 2 bytes       | 20000        |
// | int     | 4 bytes       | 20           |
// | long    | 8 bytes       | 10000000000L | L suffix is used to indicate a long literal
// | float   | 4 bytes       | 3.14f        |
// | double  | 8 bytes       | 3.14         |
// | char    | 2 bytes       | 'A'          |
// | boolean | JVM dependent | true         |

// whole numbers store krne ke trike
// | Type  | Bottle Size   |
// | ----- | ------------- |
// | byte  | Small bottle  |
// | short | Medium bottle |
// | int   | Large bottle  |
// | long  | Tank          |

// IMP = K3B == byte + byte becomes int