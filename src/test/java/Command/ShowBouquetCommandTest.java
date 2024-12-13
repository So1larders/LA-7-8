package Command;
import flower.*;
import org.junit.jupiter.api.Test;

class ShowBouquetCommandTest {
    @Test
    void testExecute() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower("Роза", 5, 30.5, 15.0));
        bouquet.addAccessory(new Accessories("Стрічка", 10.0));
        ShowBouquetCommand command = new ShowBouquetCommand(bouquet);
        command.execute();
    }

}