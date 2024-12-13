package Command;
import flower.*;
import java.io.*;
import java.util.*;

public class LoadAccessoriesCommand implements Command {
    private List<Accessories> accessories;
    private String filename;

    public LoadAccessoriesCommand(List<Accessories> accessories, String filename) {
        this.accessories = accessories;
        this.filename = filename;
    }

    @Override
    public void execute() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    accessories.add(new Accessories(name, price));
                }
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні аксесуарів: " + e.getMessage());
        }
    }

    @Override
    public String getDesc(){
        return "Завантажити аксесуари з файлу";
    }
}
