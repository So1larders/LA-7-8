package flower;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AccessoriesTest {
    @Test
    void testAccessoriesCreation() {
        Accessories accessory = new Accessories("Стрічка", 10.0);
        assertEquals("Стрічка", accessory.getName());
        assertEquals(10.0, accessory.getPrice());
    }

    @Test
    void testAccessoriesToString() {
        Accessories accessory = new Accessories("Стрічка", 10.0);
        assertEquals("Стрічка - 10.0", accessory.toString());
    }
}