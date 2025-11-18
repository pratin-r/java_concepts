package advancejava.anonymousinnerclass;
/* 

1) An anonymous class is a local class without a name that is declared and instantiated in a single expression. Anonymous class EXTENDS public class (class which has main method). So, when java file gets compiled, the class file will be named after public class name (check point 3).

2) It is typically used for implementing interfaces or extending abstract classes on the fly, especially when the implementation is short, specific to a particular context, and not intended for reuse elsewhere.  

3) In Java, for every class, a .class file is created. For anonymous class, the class name will be the same as public class name (which is AnonymousClassImpl here) and $1 or $2 or $3 and so on depending on the number of anonymous class created. 
    -> eg:  AnonymousClassImpl.class is the normal class file
            AnonymousClassImpl$1.class and AnonymousClassImpl$2.class is anonymous class created

    The name of anonymous class is AnonymousClassImpl$1.class or AnonymousClassImpl$2.class because the code contains an anonymous class that extends AnonymousClassImpl
*/

class Show {
    void displayShow() {
        System.out.println("Current Show:- Breaking Bad");
    }
}

public class AnonymousClassImpl {
    void helloWorld() {
    }

    public static void main(String[] args) {
        Show obj1 = new Show() { // creates an anonymous class
            @Override
            void displayShow() {
                System.out.println("Current Show:- Better Call Saul");
            }
        };
        Show obj2 = new Show() { // creates an anonymous class
            @Override
            void displayShow() {
                System.out.println("Current Show:- Happiness");
            }
        };
        AnonymousClassImpl obj3 = new AnonymousClassImpl() { // creates an anonymous class
            @Override
            void helloWorld() {
                System.out.println("Hello World");
            }
        };
        obj1.displayShow();
        obj2.displayShow();
        obj3.helloWorld();
    }
}
