package advancejava.anonymousinnerclass.absandanonymous;

abstract class AbstractClass {
    abstract void displayShow();
}

public class AbstractAndAnonymous {
    public static void main(String[] args) {
        AbstractClass obj1 = new AbstractClass() {
            void displayShow() {
                System.out.println("Current Show:- Breaking Bad");
            }
        };
    }
}
