import java.util.Scanner;

public class P21_2d_array {
    public static void main(String[] args){
        int[][] n = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                n[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

// so we can use basic knowledge and logic same as C++
// n.length --> rows
// n[0].length --> columns