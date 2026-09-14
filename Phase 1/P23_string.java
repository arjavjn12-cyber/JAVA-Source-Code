public class P23_string {
    public static void main(String[] args){
        String name = "Tony";
        char grade ='A';
        String name2 = "Stark";

        System.out.println(name + " " +  name2 + 3); // call as concatenation
        System.out.println(grade);
    }
}

// string length --> name.length()
// for character accessing --> name.chartAt(0)

// String is also a class like Scanner and primitive datatype 

// String is immutable
// string name = "tony"
// name = "stark"
// this is not possible because java doesn't allow it
// tony will still exits, java ne usko modify nhi kiya
// bas reference shift ho gaya

// this are main reasons:
// 1. Security
// 2. String pool
// 3. Thread safety
