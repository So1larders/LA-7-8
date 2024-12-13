package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class AddLoadedAccessoriesCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        List<Accessories> accessories = new ArrayList<>();
        accessories.add(new Accessories("Декоративне каміння", 10.0));
        AddLoadedAccessoriesCommand command = new AddLoadedAccessoriesCommand(bouquet, accessories);
        command.execute();
        assertEquals(10.0, bouquet.totalPrice());
    }
}