package advancejava.methodreference;

import java.util.Arrays;
import java.util.List;

class Mobiles {
    String mobileName;

    public Mobiles(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public String toString() {
        return "Mobiles [mobileName=" + mobileName + "]";
    }
}

public class MethodRefImp {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ada", "Leon", "Claire", "Sheva");
        System.out.println(names);
        /*
         * instead of giving variables, for every value map() method provides, it gets
         * converted to uppercase
         */
        List<String> upperCasedNames = names.stream().map(String::toUpperCase).toList();
        List<String> lowerCasedNames = names.stream().map(String::toLowerCase).toList();
        upperCasedNames.forEach(System.out::println);
        lowerCasedNames.forEach(System.out::println);
        List<String> mobNames = Arrays.asList("Samsung", "IPhone", "OnePlus");
        /*
         * constructor reference. Used new operator (yes it is an operator to create new
         * instance)
         */
        List<Mobiles> mobilePhones = mobNames.stream().map(Mobiles::new).toList();
        System.out.println(mobilePhones);
    }
}
