package sweets;

public interface Sweet {

    // final static - redundant for interface
    String name = "Something sweet";

    default String getName() {
        return name;
    }

    String getIngredients();
    String getCalories();

}
