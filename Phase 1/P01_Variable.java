// Every variable must have:
// Data Type
// Name
// Java wants JVM to know memory requirements beforehand

// Syntax:
// Datatype variableName = value;

// int age;
// System.out.println(age);
// Compile Error
// Why?
// Java prevents reading uninitialized local variables.
// This removes many bugs.

public class P01_Variable {
    public static void main(String[] args){
        int age = 25;
        System.out.println("Age: "+ age);
    }
}

// if i declare age = 20 after declaring it 25, it will update the value of age to 20.
// Naming of variables: 
// 1. Cannot start with a number
// 2. Cannot contatin spaces
// 3. Cannot be a reserved keyword
// 4. Cannot contain special characters except _ and $
// 5. Cannot be same as class name

