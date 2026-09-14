class test{
    int marks;
    char grades;

    test(){
        System.out.println("Hello world");
    }

    test(int m,char g){ // Paramatrized costructor
        marks = m;
        grades = g; 
    }
    // also it is here constructor ovelroading
}

public class P09_Constructor {
    public static void main(String[] args){
        test t = new test();
        test t1 = new test(95,'A');

        System.out.println(t.marks + "\t" + t.grades);
        System.out.println(t1.marks + "\t" + t1.grades);
    }
}

// Constructor = special method
// The function of constructor is same as it was in C++
// Constructor ka bhi overloading bna skte h 

// DESTRUCTOR  doesnt exist in java cuzz java had GARBAGE COLLECTOR (GC)