class Student{
    int rollno;
    String name;

    Student(){
    System.out.println("Student created");
    }
}

public class P08_objects {
    public static void main(String[] args){
        Student s1 = new Student(); // s1 is the varible which is holding the object of class student
        // new is keyword means: give a new object in memory
        // Student() is means that object creation
        
        s1.name = "Arush";
        s1.rollno = 101;

        System.out.println("Roll no. is: " + s1.name + "\t" + s1.rollno);

    }
}


// Memory:
// s1
//  |
//  v
// +----------------+
// | name = Arush   |
// | age = 101      |
// +----------------+

// Agr feilds ko kuch assign nhi kre toh java defaults values deti h
// | Type    | Default |
// | ------- | ------- |
// | int     | 0       |
// | double  | 0.0     |
// | boolean | false   |
// | String  | null    |