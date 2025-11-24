package advancejava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamImp {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        long startSingleStream = System.currentTimeMillis();
        // stream without delay
        int evenNum = li.stream().filter(v -> v % 2 == 0).mapToInt(v -> v).sum();// mapToInt return type is IntStream
        long endSingleStream = System.currentTimeMillis();
        System.out.println(evenNum);
        System.out.println("Time taken to complete process in milliseconds: " + (endSingleStream - startSingleStream));
        // parallel stream without delay
        long startParallelStream = System.currentTimeMillis();
        int oddNum = li.parallelStream().filter(v -> v % 2 == 1).mapToInt(v -> v).sum();
        long endParallelStream = System.currentTimeMillis();
        System.out.println(oddNum);
        System.out.println(
                "Time taken in to complete process in milliseconds: " + (endParallelStream - startParallelStream));
        // stream with delay
        long startSingleStream2 = System.currentTimeMillis();
        int evenNum2 = li.stream().filter(v -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return v % 2 == 0;
        }).mapToInt(v -> v).sum();
        long endSingleStream2 = System.currentTimeMillis();
        System.out.println(evenNum2);
        System.out.println(
                "Time taken in to complete process (with delay) in milliseconds: "
                        + (endSingleStream2 - startSingleStream2));

        long startParallelStream2 = System.currentTimeMillis();
        int oddNum2 = li.parallelStream().filter(v -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return v % 2 == 1;
        }).mapToInt(v -> v).sum();
        long endParallelStream2 = System.currentTimeMillis();
        System.out.println(oddNum2);
        System.out.println(
                "Time taken in to complete process (with delay) in milliseconds: "
                        + (endParallelStream2 - startParallelStream2));

    }
}
