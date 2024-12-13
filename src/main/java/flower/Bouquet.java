package flower;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessories> accessories = new ArrayList<>();


    public void addFlower(Flower flower) {
        flowers.add(flower);
    }


    public void addAccessory(Accessories accessory) {
        accessories.add(accessory);
    }


    public double totalPrice() {
        double totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrice();
        }
        for (Accessories accessory : accessories) {
            totalPrice += accessory.getPrice();
        }
        return totalPrice;
    }


    public void sortFlowersByFreshness() {
        flowers.sort(Comparator.comparing(Flower::getFreshness));
    }


    public List<Flower> searchFlowersByStemLength(double min, double max) {
        List<Flower> matchedFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getLength() >= min && flower.getLength() <= max) {
                matchedFlowers.add(flower);
            }
        }
        return matchedFlowers;
    }


    public void showBouquet() {
        System.out.println("\nБукет:");
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println("\nАксесуари:");
        for (Accessories accessory : accessories) {
            System.out.println(accessory);
        }
        System.out.println("\nЗагальна вартість: " + totalPrice());
    }
}