package advancejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Movie {
    public void show() throws ClassNotFoundException {
        Class.forName("advancejava.exceptionhandling.ExceptionHandling");
        System.out.println("Current Show: Breaking Bad");
    }

    public void tryWithResources() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println("Number entered is: " + num);
            br.close();
        }
    }
}

public class DuckingException {

    public static void main(String[] args) throws ClassNotFoundException, IOException { // not a good practice...
        Movie obj1 = new Movie();
        obj1.show();
        obj1.tryWithResources();
    }
}
