package knowledge.sixth;

public class FinallyTester {

    public static void test() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            test();
        }
/*        catch (RuntimeException ex) {
            System.out.println("Exception!");
        }*/
        finally {
            System.out.println("Finally");
        }
        System.out.println("End.");
    }

}
