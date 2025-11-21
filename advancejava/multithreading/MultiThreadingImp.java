package advancejava.multithreading;

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("World");
        }
    }
}

/*
 * Parallel execution of the methods is handled by the thread scheduler.
 * Each thread (Hello and World) is executed concurrently because they are
 * running in separate threads. The operating system's thread scheduler
 * decides when each thread gets CPU time, allowing the "Hello" and "World"
 * prints to occur simultaneously.
 */

public class MultiThreadingImp {
    public static void main(String[] args) {
        Hello obj1 = new Hello();
        World obj2 = new World();
        obj1.start();
        obj2.start();
    }
}
