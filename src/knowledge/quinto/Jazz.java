package knowledge.quinto;

public class Jazz extends Dance {

    public Jazz(String type) {
        super(type); // super has to be the first statement
        this.classic = false;
    }

    @Override
    void count() {

    }
}
