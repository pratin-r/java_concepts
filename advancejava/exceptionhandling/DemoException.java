package advancejava.exceptionhandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class DemoException {
    public static void checkAge(int age) throws InvalidAgeException {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Exception caught: Age must be 18 or older");
            }
            System.out.println("Access granted");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
