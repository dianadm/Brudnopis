package coffee.shop;

public enum CoffeeType {

    BLACK("no milk"),
    WHITE("with milk"),
    LATE("with milk");

    String description;

    CoffeeType(String desc) {
        description = desc;
    }
}
