package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SearchFlowersCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addFlower(new Flower("Пюльпан", 8, 25.0, 12.0));
        SearchFlowersCommand command = new SearchFlowersCommand(bouquet, 20, 30);
        command.execute();
        List<Flower> result = bouquet.searchFlowersByStemLength(20, 30);
        assertEquals(1, result.size());
    }
}