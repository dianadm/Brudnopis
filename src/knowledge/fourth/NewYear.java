package knowledge.fourth;

class NewYearsEve {

    static {
        System.out.println("1");
    }

    {
        System.out.println("3");
    }

    public NewYearsEve() {
        System.out.println("4. Constructor 1");
    }

}

class NewYearsEveInJune extends NewYearsEve {

    {
        System.out.println("5");
    }

    static {
        System.out.println("2");
    }

    public NewYearsEveInJune() {
        System.out.println("6. Constructor 2");
    }

}

public class NewYear {

    public static void main(String[] args) {
        NewYearsEve ny = new NewYearsEveInJune();

        double x = 0.0/0.0;
        System.out.println(Double.isNaN(x));
        Double a = 11.1;
        System.out.println(a.isNaN());

        char[ ] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1);
        sb.append('0');
        sb.append("8");
        System.out.println(sb);
    }
}
