package advancejava.multithreading;

class Ios extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("IOS better");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Android extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Android better");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
 * You can set the priority of a thread using setPriority(), but it is not
 * guaranteed
 * that the thread scheduler will respect the priority you set. The behavior may
 * depend
 * on the underlying operating system and its thread scheduling policies.
 */

public class ThreadClassImp {
    public static void main(String[] args) {
        Android obj1 = new Android();
        Ios obj2 = new Ios();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
