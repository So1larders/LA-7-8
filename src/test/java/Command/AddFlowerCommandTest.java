package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddFlowerCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        Flower flower = new Flower("Роза", 5, 30.5, 15.0);
        AddFlowerCommand command = new AddFlowerCommand(bouquet, flower);
        command.execute();
        assertEquals(1, bouquet.searchFlowersByStemLength(0, 100).size());
    }

}