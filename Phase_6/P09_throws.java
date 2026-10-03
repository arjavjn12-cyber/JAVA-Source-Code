public class P09_throws {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are allowed.");
    }

    public static void main(String[] args) {

        try {
            checkAge(25);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
// "This method may cause/propagate this exception. 
// I'm not handling it here; the caller may need to handle it."