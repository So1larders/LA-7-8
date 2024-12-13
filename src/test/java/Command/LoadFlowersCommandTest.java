package Command;
import flower.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

class LoadFlowersCommandTest {
    @Test
    void testExecute() throws IOException {
        List<Flower> flowers = new ArrayList<>();
        String filename = "flowers.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Роза,5,30.5,15.0\n");
            writer.write("Тюльпан,8,25.0,12.0\n");
        }
        LoadFlowersCommand command = new LoadFlowersCommand(flowers, filename);
        command.execute();
        assertEquals(2, flowers.size());
        new File(filename).delete();
    }

}