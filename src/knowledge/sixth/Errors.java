package knowledge.sixth;

public class Errors {

    // should not be handled or declared!

    // throws ExceptionInInitializerError unnecessary
    public static void test()  {
//        throw new ExceptionInInitializerError();
//        throw new StackOverflowError();
        throw new NoClassDefFoundError();
    }

    public static void main(String[] args) {
//        try { unnecessary
            test();
//        } catch (ExceptionInInitializerError ex) {
//            ex.printStackTrace();
//        }
    }

}
