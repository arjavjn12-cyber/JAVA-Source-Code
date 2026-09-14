class test1{
    int marks;
    char grade;

    test1(int marks,char g){
        this.marks = marks; // same logic here as it was in C++
        grade = g;
    }
}

public class P10_this {
    public static void main(String[] args){
        test1 t = new test1(95,'A');
        System.out.println(t.marks + " " + t.grade);
    }
}

//  object.name = parameter.name
