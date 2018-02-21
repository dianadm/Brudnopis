package knowledge.quinto;

public abstract class Dance {

    private String musicType;

    // default or protected can be accessed
    boolean classic;

    public Dance(String type) {
        this(type, false); // this has to be the first statement
    }

    public Dance(String type, boolean classic) {
        this.musicType = type;
        this.classic = classic;
    }
}
