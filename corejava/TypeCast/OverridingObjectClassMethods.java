/* 

---   IMPORTANT NOTE   ---

UPCASTING is done when we want to access methods of super class. Once we dont want to access or if there is any need for us to access the sub class variables or methods, we can DOWNCAST it. 

It will be really useful in creating projects where there will be a need to up cast the type when we want to access parent class and we can downcast it when there is no need

For user defined class, we need to override methods of Object class like toString(), equals(), hashCode(), clone() etc,. if you are going to use it for displaying, comparing, copying etc 

Or else, when we use those methods, we will be getting the default implementation which is written in Object class

*/

package TypeCast;

public class OverridingObjectClassMethods {

    String firstName;
    String lastName;
    int age;

    public OverridingObjectClassMethods() {
        this("Pratin", "R", 22);
    }

    public OverridingObjectClassMethods(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Name of the person: " + firstName + " " + lastName + " | " + "Age: " + this.age;
    }

    // public boolean equals(OverridingObjMethods obj) {
    // if (this == obj) {
    // return true;
    // }
    // return compareString(this.firstName + this.lastName, obj.firstName +
    // obj.lastName);
    // }

    // private boolean compareString(String name1, String name2) {
    // if (name1 == null || name2 == null) {
    // return false;
    // }
    // if (name1.length() != name2.length()) {
    // return false;
    // }
    // int left = 0;
    // while (left < name1.length()) {
    // if (name1.charAt(left) != name2.charAt(left)) {
    // return false;
    // }
    // left++;
    // }
    // return true;
    // }

    @Override
    public boolean equals(Object obj) /* upcasting */ {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        OverridingObjectClassMethods object = (OverridingObjectClassMethods) obj; // down casting

        /*
         * firstName and lastName are accessing the equals method of String class since
         * these two are of type String.
         */
        return firstName.equals(object.firstName) && lastName.equals(object.lastName);

    }

    @Override
    public int hashCode() {
        return (firstName + lastName).hashCode();
    }

    public static void main(String[] args) {
        OverridingObjectClassMethods obj1 = new OverridingObjectClassMethods("Varshni", "RR", 22);
        OverridingObjectClassMethods obj2 = new OverridingObjectClassMethods("Varshni", "RR", 22);
        System.out.println(obj1.equals(obj2)); // obj2 is first up casted and then it is down casted
        System.out.println(obj1.hashCode());

    }
}
