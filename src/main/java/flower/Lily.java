package flower;

public class Lily extends Flower {
    private String color;
    public Lily(String name, int freshness, double length, double price, String color) {
        super(name, freshness, length, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() + "  Колір - " + color;
    }
}
