import java.util.Scanner;

public class P12_User_javabug {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();

        String name = sc.nextLine();

        System.out.println("[" + name + "]" + day);

       sc.close();
    }
}

        // User input:
        // 20↵
        //
        // nextInt() sirf 20 read karega
        // Lekin Enter (\n) buffer me chhod dega

        // Hum expect kar rahe hain ki user yaha "Tony" enter karega
        //
        // Lekin nextLine() se pehle buffer me already
        // ek Enter (\n) pada hua hai jo nextInt() chhod gaya tha
        //
        // nextLine() usi Enter ko read kar lega
        // Aur turant empty string return kar dega

// Solution:
// for eliminating the buffer issue we add an extra nextline() like:-
// int day = sc.nextInt();
// sc.nextLine(); // buffer clear karne ke liye
// String name = sc.nextLine();

