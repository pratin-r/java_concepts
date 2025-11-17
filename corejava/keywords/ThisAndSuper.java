package corejava.keywords;
/* implementation of this, super keyword and this(), super() method */

class A {
    public A() {
        System.out.println("Normal Constructor of A");
    }

    public A(int val) {
        System.out.println("Parameterized Constructor of A");
    }

    public void superKeyWordImp(int val) {
        System.out.println("Accessing Method...");
    }
}

class B extends A {
    public B() {
        System.out.println("Normal Constructor of B");
    }

    public B(int val) {
        super(val); // super() method
        System.out.println("Parameterized Constructor of B");
    }

    public void superKeyWordImp(int val) {
        super.superKeyWordImp(val); // super keyword
    }
}

public class ThisAndSuper {

    public ThisAndSuper() {
        this(0); // this() method
    }

    public ThisAndSuper(int val) {
        System.out.println("Parameterized Constructor");
    }

    public int add() {
        return this.add(0, 0); // this keyword
    }

    public int add(int... values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ThisAndSuper obj1 = new ThisAndSuper();
        System.out.println(obj1.add(1, 2, 3, 4, 5, 6));
        B obj2 = new B();
        B obj3 = new B(1);
        obj2.superKeyWordImp(0);
    }
}
