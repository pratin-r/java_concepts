package TypeCast;

/* IMPORTANT NOTE
 * i) A variable can only access variables or methods of ITS TYPE ONLY.
 */
class MobilePhone {
    int no1 = 5;

    public void display() {
        System.out.println("Method from MobilePhone");
    }
}

class Motorola extends MobilePhone {
    int no2 = 10;

    public void display() {
        System.out.println("Method from Motorola");
    }
}

public class NonPrimitiveTypeCasting {
    public static void main(String[] args) {
        /* UP CASTING */
        /*
         * Upcasting: Subclass type is assigned to superclass type. This can be done
         * implicitly, just like casting 'char' to 'int' (primitive types).
         */

        MobilePhone obj = new Motorola(); // Upcasting
        obj.display();

        /*
         * Since 'obj' is a reference of type MobilePhone, we cannot directly access
         * subclass-specific methods unless we downcast it.
         */

        /*
         * obj.display2(); // This will not compile because display2 is not defined in
         * MobilePhone.
         */

        /* DOWN CASTING */
        /*
         * i) Downcasting: Superclass reference is cast to subclass type. This can only
         * be done after upcasting and needs to be explicit.
         * 
         * 
         * ii) You can access both superclass and subclass members ONLY AFTER
         * downcasting —
         * and ONLY IF THE OBJECT IS ACTUALLY AN INSTANCE OF THE SUBCLASS.(meaning the
         * object is of the same type).
         * 
         * 
         * --> imagine if you upcast an object to parent class and downcast it to type
         * of another sub class... this is not possible since this structure itself
         * creates single parent and two child creating multiple inheritance which is
         * not possible using class.
         */

        MobilePhone obj1 = new Motorola(); // Upcasting
        Motorola obj2 = (Motorola) obj1; /*
                                          * Downcasting. Here, we are converting the obj1 to Type Motorola and assigning
                                          * it to obj2 which is of type Motorola(same as object's type).
                                          */
        obj2.display();
        System.out.println(obj2.no1 + obj2.no2); /*
                                                  * done to check if we can able to access both super class and sub
                                                  * class's variables and methods
                                                  */

    }
}
