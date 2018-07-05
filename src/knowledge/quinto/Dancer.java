package knowledge.quinto;

public class Dancer {

    public static void main(String[] args) {
//        Salsa salsa = new Salsa();
        Cubana cubana = new Cubana();
        // overriding methods
//        salsa.count();
        cubana.count();

        // hiding methods
        Salsa.step();
        Cubana.step();

        Rumba rumba = new Rumba();
        Latino latino = new Rumba();
//        latino.staticTest();
//        rumba.staticTest(); static method may be invoke on containing interface only
        Latino.staticTest();

        System.out.println(Latino.c);
    }
}
