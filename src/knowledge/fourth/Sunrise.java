package knowledge.fourth;

import coffee.shop.WhiteCoffee;

import java.math.BigDecimal;

public class Sunrise {

    // passing by value

    public void changeName(String name) {
        name = name.concat("abc");
    }

    // only this method change parameter
    // because it doesn't reassign param to a different object
    public void changeWhiteCoffee(WhiteCoffee coffee) {
        coffee.setName("americano");
        coffee.setMilk(false);
    }

    public void changeInt(int x) {
        x++;
    }

    public void changeInteger(BigDecimal x) {
        x = x.add(new BigDecimal("10"));
    }

    public static void main(String[] args) {
        String name = "the sun";
        Sunrise sunrise = new Sunrise();
        sunrise.changeName(name);
        System.out.println(name);
        WhiteCoffee whiteCoffee = new WhiteCoffee();
        sunrise.changeWhiteCoffee(whiteCoffee);
        System.out.println(whiteCoffee);
        int a = 10;
        BigDecimal b = new BigDecimal(20);
        sunrise.changeInt(a);
        System.out.println(a);
        sunrise.changeInteger(b);
        System.out.println(b);
    }
}
