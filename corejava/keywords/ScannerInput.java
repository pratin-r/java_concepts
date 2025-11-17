package corejava.keywords;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Boolean b = true;
        System.out.printf("%b\n", b); // returns the result
        System.out.printf("%B\n", b); // %B returns result in upper case
        Scanner sc = new Scanner(System.in);
        ScannerInput obj = new ScannerInput();
        obj.printerInput(sc);
    }

    public void printerInput(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("Number is: " + num);
    }
}
