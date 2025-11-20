/* 

try block is used when a line or lines of code might cause error. When error happens, try block throws an error of type Exception. Thats why the catch parameter has Exception or subclass of Exception. 

try block immediately exits when it encounters exception and throws it to catch block. lines present below the exception invoking statement wont get executed.

*/
package advancejava.exceptionhandling;

class CustomException extends Exception {

    public CustomException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 10;
        String s1 = null;
        try {
            j = j / i;
            if (j == 0) {
                /*
                 * throw keyword is used to forcibly throw an exception. When you throw
                 * an exception, catch block gets triggered.
                 */
                throw new CustomException("Value is zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + ": Dividing by zero"); // e.getMessage() prints the parameter passed.
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // catching null pointer exception
        try {
            System.out.println(s1.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid index");
        } catch (NullPointerException e) {
            System.out.println("Insert a string");
        }
    }
}
