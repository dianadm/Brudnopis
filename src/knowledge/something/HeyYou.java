package knowledge.something;

import coffee.shop.WhiteCoffee;

import java.util.ArrayList;

public class HeyYou {

    public static void equalsy() {
        int a = 11;
        byte b = 11;

        if (a == b) {
            System.out.println("a == b");
        }

        double d = 11.0;

        if (a == d) {
            System.out.println("a == d");
        }

        Integer i1 = 11;
        Double d1 = 11.0;

        // not compile
/*        if (i1 == d1) {
            System.out.println();
        }*/
        if (i1.equals(d1)) {
            // not
            System.out.println("i1.equals(d1)");
        }

        String s1 = "hello";
        StringBuilder s2 = new StringBuilder("hello");

        // not compile
/*        if (s1 == s2) {
        }*/
        if (s1.equals(s2)) {
            // not
            System.out.println("s1.equals(s2)");
        }

    }

    public static void main(String[] args) {
        ArrayList<WhiteCoffee> lista = new ArrayList();
        lista.add(new WhiteCoffee());
        lista.add(null);

        for (Object s : lista) {
            System.out.println(s);
        }

        Integer a = 2;
        int c = new Integer(a);

            int x = 10;



    }
}
