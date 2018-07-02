package knowledge.quinto;

import java.io.FileNotFoundException;
import java.io.IOException;

class SlowWaltz {

    public int dance(String string) throws IOException {
        System.out.println(string);
        return 4;
    }

}

class VienneseWaltz extends SlowWaltz {

    @Override
    public int dance(String string) throws FileNotFoundException {
        System.out.println(string);
        return 3;
    }
}

public class Waltz {

    public static void main(String[] args) {
        SlowWaltz slow = new SlowWaltz();
        VienneseWaltz viennese = new VienneseWaltz();
        try {
            slow.dance("1");
            viennese.dance("2");
        } catch (Exception e) {
            System.out.println("catched");
        }

        int i = 0;
        for (i = 0; i < 5; i++) {

        }
        System.out.println("i=" + i);
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder sb0 = new StringBuilder("Java");
        String s = new String("Java");
        System.out.println(sb.equals(sb0));
        System.out.println(sb.toString().equals(sb0.toString()));
        System.out.println(s.equals(sb));

        Integer [ ] a = new Integer[2];
        a[1] = 10;
        for (Integer I:a)
            System.out.print(I);
    }
}
