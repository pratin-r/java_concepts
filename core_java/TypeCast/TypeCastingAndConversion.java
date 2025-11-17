package TypeCast;

public class TypeCastingAndConversion {
    public static void main(String[] args) {
        byte a = 127;
        int b = 258;
        a = (byte) b;
        System.out.println(a);
        float f1 = 5.6f;
        int i1 = (int) f1;
        System.out.println(i1);
    }
}
