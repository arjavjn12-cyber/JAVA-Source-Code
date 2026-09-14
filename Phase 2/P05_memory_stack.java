public class P05_memory_stack {

    public static void greet(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        greet();
    }
}

// The question is when greet complete hone ke baad uske 
// variables kaha jaate hain?

// Memory ke 2 parts hote h 
// Stack memory , Heap memory

// STACK MEMORY
// Follow in LIFO
// Jab method call hota hai, java ek box banati h, us box ko stack frame bolte h

// STACK:
// program start
// +--------+
// | main() |
// +--------+

// greet() called so new frame
// STACK
// +---------+
// | greet() |
// +---------+
// | main()  |
// +---------+

// After the execution the method removes from the stack

// Why return works ?
// Beacue when return send the value before it or frame get destroyed
