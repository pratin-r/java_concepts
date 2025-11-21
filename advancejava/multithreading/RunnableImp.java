package advancejava.multithreading;

class MarvelRivals implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Marvel Rivals loading...");
            Thread.sleep(2000);
            System.out.println("Marvel Rivals running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class RunnableImp {
    public static void main(String[] args) {
        MarvelRivals obj1 = new MarvelRivals();
        Thread threadObj1 = new Thread(obj1); // Upcasting 'MarvelRivals' object to 'Runnable' interface type, as Thread
                                              // requires a Runnable.
        threadObj1.start();
        System.out.println("Hello"); // This will print first, as it's executed in the main thread before the new
                                     // thread starts.

        Runnable obj2 = () -> {
            try {
                Thread.sleep(3000);
                System.out.println("Valorant loading...");
                Thread.sleep(1000);
                System.out.println("Valorant running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread threadobj2 = new Thread(obj2);
        threadobj2.start();
    }
}
