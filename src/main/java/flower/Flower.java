package flower;

public class Flower {
    private String name;
    private int freshness;
    private double length;
    private double price;

    public Flower(String name, int freshness, double length, double price) {
        this.name = name;
        this.freshness = freshness;
        this.length = length;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return "Квітка |  Назва - " + name + "  Свіжість - " + freshness + "  Довжина - " + length + "  Ціна - " + price;
    }
}

