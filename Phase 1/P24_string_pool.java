public class P24_string_pool {
    public static void main(String[] args){

        String s1 = "Tony";
        String s2 =  "Tony";

        System.out.println(s1 + " " + s2);
    }    
}

// So basically what is the problem when there is different objects 
// are defined but the stored value is same 
// So then it creates problem of memory storage 

// Java ne observe kiya 
// Real programs me same strings bahut repeat hoti hai.

// so java ek special area rakhta h
// STRING POOL

// Visualization:
// ┌──────┐
// │Tony  │
// └──────┘

// In our case the visualization will look like
// String Pool

// ┌──────┐
// │Tony  │
// └──────┘

// s1 ──┐
//      │
//      ▼
//     Tony
//      |
// s2 ──┘

// sirf ek "Tony" object bana

// So toh pool nhi bnne ke liye we use
// String s1 = new String("Tony");
// because new java ko force karta hai naya object bnao, pool use mat kro.

// we can also compare s1.equals(s2), s1 == s2