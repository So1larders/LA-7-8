package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SortFlowersCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addFlower(new Flower("Тюльпан", 8, 25.0, 12.0));
        SortFlowersCommand command = new SortFlowersCommand(bouquet);
        command.execute();
        List<Flower> sortedFlowers = bouquet.searchFlowersByStemLength(0, 100);
        assertEquals("Роза", sortedFlowers.get(0).getName());
    }
}