package Command;
import flower.*;
import java.util.List;

public class SearchFlowersCommand implements Command {
    private Bouquet bouquet;
    private double minLength;
    private double maxLength;

    public SearchFlowersCommand(Bouquet bouquet, double minLength, double maxLength) {
        this.bouquet = bouquet;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public void execute() {
        List<Flower> foundFlowers = bouquet.searchFlowersByStemLength(minLength, maxLength);

        if (foundFlowers.isEmpty()) {
            System.out.println("Не знайдено квітів з цією довжиною стебла.");
        } else {
            System.out.println("\nКвіти з довжиною стебла від " + minLength + " до " + maxLength + ":");
            for (Flower flower : foundFlowers) {
                System.out.println(flower);
            }
        }
    }
    @Override
    public String getDesc(){
        return "Пошук квітки по довжені стебла";
    }
}