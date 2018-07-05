package knowledge;

import coffee.shop.Black;

public class MyVariables {

    public void myMethod() {
        String s1, s2;
        String s3 = "yes", s4 = "Hello";
        Black b = new Black(), b2 = new Black();
        Black b22 = new Black(), b23;
        int abc77a;
        int abc_dj$;
    }

    /**
     * local variables - in scope from declaration to end of block
     * instance variables - in scope from declaration until object garbage collected
     * class variables - in scope from declaration until program ends
     */
    public void myScope() {
        int a = 0;
        if (a == 0) {
            int b = 22;
        } else {
            double b = 32.00;
        }
    }

    public static void main(String[] args) {

        double d = 11.0d;
        int i = 11;
        long l = 22l;

        if (d == i) {
            System.out.println("!!!");
        }
        if (i > l) {
            System.out.println("bleee");
        }

        if (d <= l) {
            System.out.println("---");
        }

    }
}
