/*

1) Lambda expression is a feature introduced in Java 8 that allows you to express instances of functional interfaces (interfaces with a single abstract method) using a more compact, readable syntax. It only works with functional interface.

2) A functional interface can have ONLY ONE ABSTRACT METHOD but can have multiple default, static and private methods. This is to ensure the interface can be implemented by a lambda expression, which requires a target type with exactly one abstract method to match the structure of the lambda. 

*/
package advancejava.lambdaexp;

@FunctionalInterface
interface Netflix {
    String show(String name);

}

@FunctionalInterface
interface Message {

    void name();

    default void helloWorld() {
        System.out.println("Hello World");
        helloSolarSystem();
    }

    private void helloSolarSystem() {
        System.out.println("Hello Solar System");
    }

    static void invokeUniverse() {
        System.out.println("Hello Universe");
    }
}

public class LambdaImp {
    public static void main(String[] args) {
        // For method with return type, either you can make a block and define it
        Netflix user1 = name -> {
            System.out.println(name);
            return name;
        };
        // or you can simply return the value
        Netflix user2 = name -> name; /*
                                       * no need to mention return since compiler will automatically understands that
                                       * 'name' is the return value.
                                       */
        user1.show("Breaking Bad");
        user2.show("Better Call Saul");

        Message user3 = () -> System.out.println("Welcome user");
        user3.helloWorld();
        Message.invokeUniverse();
        String root = System.getProperty("user.dir");
        System.out.println(root);
    }
}
