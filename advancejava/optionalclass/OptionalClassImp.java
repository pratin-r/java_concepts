/* 
The Optional class in Java was introduced in Java 8 as part of the java.util package. Its primary purpose is to avoid null references and to provide a more expressive and safer way to handle optional values
*/
package advancejava.optionalclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassImp {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Robert", "Liebert");
        Optional<String> name = nameList.stream().filter(str -> str.contains("o")).findFirst();
        System.out.println(name.orElse("No such names found"));
        List<String> msgList = Arrays.asList("Hi", "Vanakkam");
        /*
         * findFirst() method which belongs to Stream Interface returns Optional<T>.
         * orElse() method belongs to Optional class and its return type is T.
         */
        String msg = msgList.stream().filter(str -> str.contains("i")).findFirst()
                .orElse("No such word found");
        System.out.println(msg);
    }
}
