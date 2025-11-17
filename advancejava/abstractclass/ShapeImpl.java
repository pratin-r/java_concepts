package advancejava.abstractclass;

import java.util.Scanner;

abstract class Shape {
    int length;
    int breadth;
    int radius;

    abstract void area();

    void sayHello() {
        System.out.println("Hellooo");
    };
}

class Rectangle extends Shape {
    Scanner sc;

    public Rectangle() {
        sc = new Scanner(System.in);
    }

    void area() {
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();
        System.out.println("The area of Rectangle is: " + length * breadth);
    }
}

public class ShapeImpl {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();  // can only access the methods and variable 
        s1.area();
        s1.sayHello();
    }
}
