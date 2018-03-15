package knowledge.sixth;

public class RuntimeExceptions {

    // throws NumberFormatException unnecessary
    public static void test()  {
//        throw new ArithmeticException();
//        throw new ArrayIndexOutOfBoundsException();
//        throw new ClassCastException();
//        throw new IllegalArgumentException(); // thrown by programmer
//        throw new NullPointerException();
        throw new NumberFormatException(); // thrown by programmer

    }

    public static void main(String[] args) {
//        try { unnecessary
            test();
//        } catch (NumberFormatException e) {
//
//        }
    }
}
