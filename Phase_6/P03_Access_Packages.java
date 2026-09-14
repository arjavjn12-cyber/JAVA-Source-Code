import College.Student;

public class P03_Access_Packages {
    public static void main(String[] args){
        Student s = new Student();

        // s.a ❌
        // s.b ❌
        // s.c ❌
        System.out.println(s.d); // ✅
    }
}

// | Modifier    | Same Class | Same Package | Different Package |
// | ----------- | ---------- | ------------ | ----------------- |
// | `private`   | ✅          | ❌            | ❌                 |
// | `default`   | ✅          | ✅            | ❌                 |
// | `protected` | ✅          | ✅            | ⚠️                |
// | `public`    | ✅          | ✅            | ✅                 |

// Even though Child is in another package, it can access the protected member because Child inherits from Student.

// private   → only class
// default   → same package
// protected → same package + subclasses
// public    → everywhere