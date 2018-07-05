package knowledge.quinto;

public class HipHop {
    public static void main(String[] args) {
        Funk f = new Funk();
        System.out.println(f.str);
        System.out.println(f.strNs);
        f.method();
        f.ns();
        System.out.println("---");
        Funk l = new Locking();
        System.out.println(l.str);
        System.out.println(l.strNs);
        l.method();
        l.ns();
    }
}

class Funk {
    public static String str = "funk";
    public String strNs = "funkNs";
    public static void method() {
        System.out.println(str);
    }
    public void ns() {
        System.out.println("Funk variables");
        System.out.println("ns " + str);
        System.out.println("ns " + strNs);
    }
}

class Locking extends Funk {
    public static String str = "lock";
    public String strNs = "lockNs";
    public static void method() {
        System.out.println(str);
    }
    public void ns() {
        System.out.println("Locking variables");
        System.out.println("ns " + str);
        System.out.println("ns " + strNs);
    }
}
