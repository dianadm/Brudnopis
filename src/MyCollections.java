import coffee.shop.Drink;
import coffee.shop.WhiteCoffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static ch.lambdaj.Lambda.*;
import static org.hamcrest.Matchers.isIn;

public class MyCollections {

    private static List<String> getCoffees(Collection<? extends Drink> drinks) {
        return extract(drinks, on(Drink.class).getName());
    }

    private static List<String> getCoffees2(Collection<? extends Drink> drinks) {
        return drinks.stream().map(Drink::getName).collect(Collectors.toList());
    }

    private static Collection<? extends Drink> getSupportedDrinks(
            Collection<? extends Drink> drinks, List<String> supportedDrinks) {
        return filter(having(on(Drink.class).getName(), isIn(supportedDrinks)),
                drinks);
    }

    private static Collection<? extends Drink> getSupportedDrinks2(
            Collection<? extends Drink> drinks, List<String> supportedDrinks) {
        return drinks.stream().filter(drink -> supportedDrinks.contains(drink.getName()))
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new WhiteCoffee("one", true));
        drinks.add(new WhiteCoffee("zero", false));
        drinks.add(new WhiteCoffee());
        List<String> supportedDrinks = Arrays.asList("magic");
        Collection<? extends Drink> list = getSupportedDrinks2(drinks, supportedDrinks);
        System.out.printf(list.toString());

    }
}
