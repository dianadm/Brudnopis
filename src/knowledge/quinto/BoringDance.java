package knowledge.quinto;

interface Standard {

    String getName();

    default void playSomeMusic() {
        System.out.println("...");
    }
}

interface Balroom {
    static void playSomeMusic() {
        System.out.println("m.u.s.i.c.");
    }
}

public class BoringDance implements Standard, Balroom {

    public void playSomeMusic() {
        System.out.println("...");
    }

    @Override
    public String getName() {
        return null;
    }
}