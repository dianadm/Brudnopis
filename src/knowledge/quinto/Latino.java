package knowledge.quinto;

public abstract interface Latino {

    public static final int count = 1;
    int c = 1;

    public abstract String getName();
    String getMusic();

    static void staticTest() {
        System.out.println("nananana");
    }

    public default void method() {
        System.out.println(c);
    }
}
