package Inheritance;

public class MulDivCalc extends AddSubCalc {

    public MulDivCalc() {
        System.out.println("Hello user");
    }

    public int multiply(int... nums) {
        int product=1;
        for(int i:nums){
            product*=i;
        }
        return product;
    }
    public int divide(int a,int b) {
        return a/b;
    }

    

    public static void main(String[] args) {
        MulDivCalc calc1 = new MulDivCalc();
    }
}
