package flower;

public class Peonies extends Flower {
    private String color;
    public Peonies(String name, int freshness, double length, double price, String color) {
        super(name, freshness, length, price);
        this.color = color;
    }

    public String getColour() {
        return color;
    }

    public String toString() {
        return super.toString() + "  Колір - " + color;
    }
}
