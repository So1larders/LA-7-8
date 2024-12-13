package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AddLoadedFlowersCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower("Нарцис", 5, 30.5, 15.0));
        AddLoadedFlowersCommand command = new AddLoadedFlowersCommand(bouquet, flowers);
        command.execute();
        assertEquals(1, bouquet.searchFlowersByStemLength(0, 100).size());
    }

}