package knowledge.quinto;

public class Dancer {

    public static void main(String[] args) {
        Salsa salsa = new Salsa();
        Cubana cubana = new Cubana();
        // overriding methods
        salsa.count();
        cubana.count();

        // hiding methods
        Salsa.step();
        Cubana.step();
    }
}