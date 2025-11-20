/* 
 * 1) Variables inside interface are final and static in nature
 * 2) Methods inside interface are public and abstract in nature
 * 3) We can also create default, static and private methods inside interface
 * 4) default methods allows us to create methods implementation
 */
package advancejava.interfaceimpl;

interface Mobile {
    int NoOfSimSlot = 1;

    void brand();

    void modelName();

    default void helloWorld() {
        System.out.println("Hello World");
        helloUniverse();
    }

    private void helloUniverse() {
        System.out.println("Hello Universe");
    }

}

interface Tablet {
    void resolution();
}

class OnePlus implements Mobile, Tablet {
    public void brand() {
        System.out.println("Mobile brand: OnePlus");
    }

    public void modelName() {
        System.out.println("Model Name: OnePlus 13R");
    }

    public void resolution() {
        System.out.println("1920 * 1080");
    }
}

public class InterfaceImpl {
    public static void main(String[] args) {
        Mobile m1 = new OnePlus();
        m1.brand();
        m1.modelName();
    }
}
