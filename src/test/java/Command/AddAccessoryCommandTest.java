package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddAccessoryCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        Accessories accessory = new Accessories("Стрічка", 10.0);
        AddAccessoryCommand command = new AddAccessoryCommand(bouquet, accessory);
        command.execute();
        assertEquals(10.0, bouquet.totalPrice());
    }
}