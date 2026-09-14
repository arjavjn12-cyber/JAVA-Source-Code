public class P17_Break_Continue {
    public static void main(String[] args) {
        for(int i=1;i<= 10;i++)
        {
            if(i == 3)
            {
                continue; // Skip current iteration (3 print nahi hoga)
            }
            if(i == 8)
            {
                break; // Exit the loop completely
            }
            System.out.println(i);
        }
    }
}

// continue = Skip
// break    = Stop