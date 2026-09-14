public class P19_Arr_max_min {
    public static void main(String[] args){
        int[] arr = {10,20,30,50,39};

        //max
        int max = arr[0];
        for(int i=0;i< arr.length; i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }

        // min 
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Max and Min number in arr: " + max + " and " + min);
    }
}
