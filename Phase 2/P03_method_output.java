import java.util.Scanner;

public class P03_method_output {
    
    public static int add(int a,int b){
        return(a+b); // we are returning here the sum of both numbers
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int d = add(a,b);
        System.out.println(d/*also we can write add(10,20) */);  // return doesnt mean that we not need to print

        sc.close();
    }    
}

// Return type should be same as the type of method 