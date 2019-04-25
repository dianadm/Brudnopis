package knowledge.fourth;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MustBeFunny {

    public static void main(String[] args) {
        List<MoneyMoney> list = new ArrayList<>();
        MoneyMoney m1 = new MoneyMoney(new BigDecimal(100), 1);
        MoneyMoney m2 = new MoneyMoney(new BigDecimal(400), 2);
        MoneyMoney m3 = new MoneyMoney(null, 1);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        Optional<BigDecimal> result =
                list.stream().filter(m -> m.amount != null)
                    .filter(m -> m.count.equals(1))
                    .map(m -> m.amount).reduce(BigDecimal::add);
        System.out.println(result);
    }
}
