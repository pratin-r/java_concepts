package corejava.keywords;

final class FinalClass {
    int num = 0;
}

/* No class can extend a final class */

// class NonFinal extends FinalClass{ // error

// }

class Mobile {
    public final void OnePlus() {
        System.out.println("Owner's name: Pratin");
    }
}

class OnePlus extends Mobile {

    /* No method can override a final method */

    // public void OnePlus(){ // error

    // }
    public void Model() {
        System.out.println("OnePlus 13R");
    }
}

@SuppressWarnings("unused")
public class FinalKeyWord {
    public static void main(String[] args) {
        final int num = 10;
        /* cannot change a variable which is declared as final */
        // num=11; // error
    }
}
