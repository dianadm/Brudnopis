package knowledge.quinto;

interface Standard2 {

    abstract String getName();

    static void play() {
        System.out.println("st Standard2");
    }

}

abstract class Balroom2 {

    static void play() {
        System.out.println("st balroom_2");
    }

}


public class HipHop2 extends Balroom2 implements Standard2 {

    @Override
    public String getName() {
        return null;
    }

    static void play() {
        System.out.println("st HipHop2");
    }

    public static void main(String[] args) {
        HipHop2 hh = new HipHop2();
        hh.play();
    }
}