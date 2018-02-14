package knowledge.fourth;

public class NotImmutable {

    private StringBuilder builder;

    public NotImmutable(StringBuilder builder) {
        this.builder = builder;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

//  to keep immutable
//    public StringBuilder getBuilder() {
//        return new StringBuilder(builder);
//    }

    public String getValue() {
        return builder.toString();
    }
}
