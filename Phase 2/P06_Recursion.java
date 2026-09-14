public class P06_Recursion {
    
    public static void test(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        test(n-1);
    }

    public static void main(String[] args){
        test(5);
    }
}

// Recursion means a method call itself in that method
// If we dont put any condition and run it so it will run infinite time, 
// But after some time JVM will say STACKOVERFLOWERROR beacuse every time it run it take one frame 

// +--------+
// | test() |
// +--------+
// | test() |
// +--------+
// | test() |
// +--------+

// So the most important condition:
// 1.) Base case: Stopping condition
// 2.) Recursive call: Calling ownselves
