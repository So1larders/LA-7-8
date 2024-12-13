package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

class LoadAccessoriesCommandTest {
    @Test
    void testExecute() throws IOException {
        List<Accessories> accessories = new ArrayList<>();
        String filename = "accessories.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Стрічка,10.0\n");
            writer.write("Кошик,5.0\n");
        }
        LoadAccessoriesCommand command = new LoadAccessoriesCommand(accessories, filename);
        command.execute();
        assertEquals(2, accessories.size());
        new File(filename).delete();
    }

}