package knowledge.fourth;


import coffee.shop.CoffeeMachine;
import coffee.shop.WhiteCoffee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambdas {

    // valid syntax
    /*
    () -> true
    a -> a.startsWith("test")
    (String a) -> a.startsWith("test")
    (a, b) -> a.startsWith("test")
    (String a, String b) -> a.startsWith("test")
    (a, b) -> { int c=0; return 5;}
     */


    public static void show(WhiteCoffee wc, Predicate<WhiteCoffee> tester) {
        if (tester.test(wc)) {
            System.out.println("yeah!!!");
        }
    }

    public static void main(String[] args) {
        WhiteCoffee coffee = new WhiteCoffee();
        show(coffee, c -> c.isMilk());

        List<WhiteCoffee> list = new ArrayList<>();
        list.removeIf(s -> s.isMilk());
    }
}
