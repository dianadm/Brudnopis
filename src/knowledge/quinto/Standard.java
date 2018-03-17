package knowledge.quinto;

public interface Standard {

    String getName();

    default void playSomeMusic() {
        System.out.println("...");
    }
}
