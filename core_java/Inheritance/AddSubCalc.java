package Inheritance;



public class AddSubCalc {

    public int add(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public int subtract(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }
}
