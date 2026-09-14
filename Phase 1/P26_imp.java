public class P26_imp {
     public static void main(String[] args) {

        // %6.2f
        // 6  -> Minimum total width of output (NOT 6 spaces)
        // .2 -> Print exactly 2 digits after decimal
        // f  -> Floating-point number (float/double)

        System.out.printf("%6.2f", 12.345);

        /*
         * Step 1:
         * 12.345 -> 12.35   (rounded to 2 decimal places)
         *
         * Step 2:
         * "12.35" has 5 characters:
         * 1 2 . 3 5
         *
         * Width required = 6
         * Current length = 5
         * Extra spaces = 6 - 5 = 1
         *
         * Final Output:
         * " 12.35"
         *  ^
         *  One leading space
         */
    }
}
