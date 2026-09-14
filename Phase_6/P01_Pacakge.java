import College.Student;

public class P01_Pacakge {
    public static void main(String[] args){
        Student.show();
        // Student s = new Student();
        // s.show();
    }
}

// Imagine you have a class:
// class Student {
// }

// Now another programmer also creates:
// class Student {
// }

// Both classes have the same name.
// How can Java distinguish them?
// That's where packages come in.
// We can put them into different packages:
// college.Student
// school.Student
// Now Java knows they are different classes.

// Simple idea 🧠
// A package gives a class a namespace.
// Think of it like putting files into different folders.
// college
//     └── Student

// school
//     └── Student
// Both can exist because they belong to different packages.

// Package solve the problems:-
// 1.) Same class names
// 2.) organization

// Basic order is :- 
// package
//    ↓
// import
//    ↓
// class

// If we dont want to use import then 
// College.Student s = new College.Student(); like this 

// import java.util.*; this means import the accessible classes directly inside java.util
// so we can use things like 
// Scanner, Random; but does not mean all classes