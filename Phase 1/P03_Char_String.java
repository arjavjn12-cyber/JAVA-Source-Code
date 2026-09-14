// Char stores a single character and uses single quotes.
// String stores a sequence of characters and uses double quotes.

public class P03_Char_String {
    public static void main(String[] args){
        char grade = 'A';
        char ch = 65; // ASCII value of 'A' is 65
        char unicodeChar = '\u0041'; // Unicode for 'A'
        String name = "Harry Potter";

        System.out.println(grade);  
        System.out.println(ch);
        System.out.println(unicodeChar);
        System.out.println(name);
    }    
}

// char is an integral type in java