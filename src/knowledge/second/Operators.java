package knowledge.second;

public class Operators {

    /*
    Post-unary operators        expression++, expression--
    Pre-unary operators         ++expression, --expression
    Other unary operators       +, -, !
    Multiplication/Division/Modulus *, /, %
    Addition/Subtraction         +, -
    Shift operators              <<, >>, >>>
    Relational operators         <, >, <=, >=, instanceof
    Equal to/not equal to        ==, !=
    Logical operators            &, ^, |
    Short-circuit logical operators &&, ||
    Ternary operators            boolean expression ? expression1 : expression2
    Assignment operators         =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
     */

    public void numericPromotionRules() {
        int a = 10;
        double b = 11;
        double c = a * b;

        byte b1 = 1;
        byte c1 = 1;
        short b2 = 2;
        short c2 = 2;
        char b3 = 3;
        char c3 = 3;

        int a1 = b1 + c1;
        int a2 = b2 + c2;
        int a3 = b3 + c3;
    }

    public static void incrementAndDecrement() {
        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0
    }

    public static void test() {
        int a = 10, b = 10;
        int b20 = a++ * 2;
        int b22 = ++b * 2;
        System.out.println(b20);
        System.out.println(b22);
    }

    public static void coumpaundAssigments() {
        long x = 10;
        int y = 5;
//        y = y * x;
        y *= x;

        if (false ^ true) {
            System.out.println("Tadam!");
        }
    }

    public static void main(String[] args) {
        incrementAndDecrement();
        test();
        coumpaundAssigments();
    }
}
