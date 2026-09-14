import java.util.Scanner;
public class P11_User_input {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        int age = val.nextInt();
        System.out.println(age);    
        val.close();
    }
}

// Line 1 -  Scanner class use krni hai

// Line 4 - object creation  that value is a object of scanner class
//        - value ek reference variable hai jo Scanner object ka reference (address-like reference) hold kar raha hai.

// Line 5 - nextInt is taking the input from the user and storing it in age 
//        - nextInt is used for int cuzz age is in int 
//        - if it was in decimal then it would be nextDouble()
//        - for string it if it is single word then it would be next()
//        - for whole line it would be nextLine()

// Line 7 - scanner class ke object ko close krna chahiye jab hum use krna band kr dete hai.