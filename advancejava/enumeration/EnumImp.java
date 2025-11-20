package advancejava.enumeration;

/*  

1) enum is a special data type that represents a fixed set of constants. 

2) It is used to define a collection of related values that are known at compile time and are not expected to change during program execution. 

3) You cannot extend enum to any other class. However, you can create constructors, variables and methods

4)  i) the constructor can either have private access modifier or package-private modifier
    ii) you cannot create object for enum. the reason why constructors exist is to associate the value or data passed inside the constructor with the constants.

5) The constant values should be present on the top. You cant create variables on top and keep the constants below it.

*/

enum Days {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int day;

    private Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

public class EnumImp {
    public static void main(String[] args) {
        Days d1 = Days.SATURDAY;
        d1.setDay(10); /*
                        * changing the value but its not recommended since it would destroy the purpose
                        * of enum which is created specifically for maintaining fixed constants
                        */
        System.out.println(d1 + " " + d1.getDay());
        System.out.println(d1.ordinal()); // returns the index of the constant
        Days[] d2 = Days.values(); // .values() returns enum array
        for (Days d : Days.values()) {
            System.out.printf(d + " is day %d of the week\n", d.getDay());

        }
        switch (d1) {
            case MONDAY:
                System.out.println("Its monday T_T");
                break;
            case TUESDAY:
                System.out.println("Its tuesday T_T");
                break;
            case WEDNESDAY:
                System.out.println("Its wednesday T_T");
                break;
            case THURSDAY:
                System.out.println("Its thursday T_T");
                break;
            case FRIDAY:
                System.out.println("Its friday *_*");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Its the weekend >_<");
            default:
                break;
        }
    }
}
