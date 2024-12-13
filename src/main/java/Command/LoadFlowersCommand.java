package Command;
import flower.*;
import java.io.*;
import java.util.*;

public class LoadFlowersCommand implements Command {
    private List<Flower> flowers;
    private String filename;

    public LoadFlowersCommand(List<Flower> flowers, String filename) {
        this.flowers = flowers;
        this.filename = filename;
    }

    @Override
    public void execute() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int freshness = Integer.parseInt(parts[1]);
                double stemLength = Double.parseDouble(parts[2]);
                double price = Double.parseDouble(parts[3]);
                Flower flower = new Flower(name, freshness, stemLength, price);
                flowers.add(flower);
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні квітів: " + e.getMessage());
        }
    }

    @Override
    public String getDesc(){
        return "Завантажити квітки з файлу";
    }
}
