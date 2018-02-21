package knowledge.quinto;

public class Cubana extends Salsa {

    public Cubana() {
        System.out.println("Cubana default constructor");
    }

    public void count() {
        super.count();
        System.out.println("uno dos tres ... siete");
    }

    public static void step() {
        System.out.println("Arriba!");
    }
}
