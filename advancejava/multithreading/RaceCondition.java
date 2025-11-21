package advancejava.multithreading;

class Finishes {
    int finishes;

    // public void increment() {
    // finishes++;
    // }
    public synchronized void increment() {
        /*
         * The 'synchronized' keyword ensures that only one thread can access this
         * method at a time, preventing race conditions when modifying the shared
         * resource 'finishes'.
         */
        finishes++;
    }

}

public class RaceCondition {
    public static void main(String[] args) {
        Finishes f1 = new Finishes();
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                f1.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                f1.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(f1.finishes);
    }
}
