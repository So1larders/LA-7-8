package flower;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BouquetTest {
    @Test
    void testAddFlower() {
        Bouquet bouquet = new Bouquet();
        Flower flower = new Flower("Роза", 5, 30.5, 15.0);
        bouquet.addFlower(flower);
        List<Flower> flowers = bouquet.searchFlowersByStemLength(0, 100);
        assertEquals(1, flowers.size());
        assertEquals(flower, flowers.get(0));
    }

    @Test
    void testAddAccessory() {
        Bouquet bouquet = new Bouquet();
        Accessories accessory = new Accessories("Кошик", 120);
        bouquet.addAccessory(accessory);
        bouquet.showBouquet();
        assertTrue(bouquet.totalPrice() > 0);
    }

    @Test
    void testTotalPrice() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addAccessory(new Accessories("Кошик", 120));
        assertEquals(135.0, bouquet.totalPrice());
    }

    @Test
    void testSortFlowersByFreshness() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addFlower(new Flower("Тюльпан", 8, 25.0, 12.0));
        bouquet.sortFlowersByFreshness();
        assertEquals("Роза", bouquet.searchFlowersByStemLength(0, 100).get(0).getName());
    }

    @Test
    void testSearchFlowersByStemLength() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addFlower(new Flower("Тюльпан", 8, 25.0, 12.0));
        List<Flower> foundFlowers = bouquet.searchFlowersByStemLength(20, 30);
        assertEquals(1, foundFlowers.size());
        assertEquals("Тюльпан", foundFlowers.get(0).getName());
    }
}
