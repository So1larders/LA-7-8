package flower;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class FlowerTest {
    @Test
    void testFlowerCreation() {
        Flower flower = new Flower("Роза", 5, 30.5, 15.0);
        assertEquals("Роза", flower.getName());
        assertEquals(5, flower.getFreshness());
        assertEquals(30.5, flower.getLength());
        assertEquals(15.0, flower.getPrice());
    }

    @Test
    void testFlowerToString() {
        Flower flower = new Flower("Роза", 5, 30.5, 15.0);
        String expected = "Квітка |  Назва - Роза  Свіжість - 5  Довжина - 30.5  Ціна - 15.0";
        assertEquals(expected, flower.toString());
    }
}