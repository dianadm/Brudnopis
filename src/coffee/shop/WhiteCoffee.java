package coffee.shop;

import java.util.Objects;

public class WhiteCoffee implements Drink {

    private String name = "magic";
    private boolean milk = true;

    public WhiteCoffee() {
    }

    public WhiteCoffee(String name, boolean milk) {
        this.name = name;
        this.milk = milk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhiteCoffee that = (WhiteCoffee) o;
        return milk == that.milk &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, milk);
    }

    @Override
    public String toString() {
        return "WhiteCoffee{" +
                "name='" + name + '\'' +
                ", milk=" + milk +
                '}';
    }
}
