package sweets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandyBar {


    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        c1.setName("Wedel");
        Chocolate c2 = new Chocolate();
        c2.setName("Milka");
        List<Chocolate> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        List<Chocolate> copyOfList = new ArrayList<>();
        copyOfList.add(new Chocolate());
        copyOfList.add(new Chocolate());

        Collections.copy(copyOfList, list);
        Chocolate r = copyOfList.get(1);
        r.setName("Simon");

        for (Chocolate c : list) {
            System.out.println(c.getName());
        }
    }
}
