import java.util.Scanner; 

public class P18_Arrays {
    public static void main(String[] args){
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print(marks[i] + " ");
        }
        sc.close();
    }
}

// Declaration only
// int[] marks;
// marks is an array of integers

// Decleration + Creation
// int[] marks = new int[5];
// This creats 5 int slots in array

// Decleration + initialization
// int[] arr = {10,20,30,40,50};

// Using new + values
// int[] arr = new int[]{10,20,30,40,50};
// no difference it is just another way

//Two Step creation
// int[] arr;
// arr = new int[5];

// IN BOOLEAN DEFAULT VALUES ARE ALWAYS FALSE 

// Functions related to array 
// arr.length
// accessing elements arr[i]

// Enhanced For loop 
// for(int value: arr){
// System.out.println(value);
//}

