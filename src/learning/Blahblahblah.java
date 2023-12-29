package learning;

import coffee.shop.CoffeeType;

import java.util.Scanner;

public class Blahblahblah {

    public static String text = """
        line 1
        line 2
        line 3
        """;

/*    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }*/;

    public static void main(String[] args) {
        CoffeeType ct = CoffeeType.WHITE;
        int numLetters = switch (ct) {
            case BLACK -> 1;
            case WHITE, LATE -> 2;
            default -> {
                yield 0;
            }
        };
        System.out.println(numLetters);
        System.out.println(text);

        Scanner in = new Scanner(System.in);
        int abc = in.nextInt();

        boolean result = switch (abc) {
            case 100:
            {
                System.out.println("hello 1");
                yield true;
            }
            case 10 : {
                System.out.println("hello 2");
                yield false;
            }
            default: {
                yield false;
            }
        };

        System.out.println(result);

    }
}
