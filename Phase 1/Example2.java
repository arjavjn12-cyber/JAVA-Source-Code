import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        int n;
        Scanner val = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = val.nextInt();

        // Even Odd check
        if(n%2==0){
            System.out.println(n + " is a Even number.");
        }
        else{
            System.out.println(n + " is a Odd number.");
        }

        // Palindrome check of a number
        int r, sum=0,digit;

        int temp = n;
        while(n>0){
            digit = n%10;
            sum = sum*10 + digit;
            n=n/10;
        }

        if(sum == temp){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not palindrome.");
        }

        r = sum;
        System.out.println("Reversed number is: " + r);

        val.close();
    }
}
