package knowledge.third;


import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    Double d = 20.0;
    double d2 = 20.0;

    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.add(null);

        double first = weights.get(0);
        System.out.println(first);

//        double third = weights.get(2);
//        throws NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(new Integer(1));
        System.out.println(numbers);
    }

}
