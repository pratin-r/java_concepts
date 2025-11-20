package advancejava.inputhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandling {

    public void userInput() throws IOException {
        
        InputStreamReader in1 = new InputStreamReader(System.in);
        BufferedReader buf1 = new BufferedReader(in1);
        int num = Integer.parseInt(buf1.readLine());
        System.out.println(num);
        buf1.close();
    }

    public static void main(String[] args) {
        InputHandling obj1 = new InputHandling();
        try {
            obj1.userInput();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}