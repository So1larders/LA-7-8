package Command;
import flower.*;
import java.util.List;

public class AddLoadedFlowersCommand implements Command {
    private Bouquet bouquet;
    private List<Flower> flowers;

    public AddLoadedFlowersCommand(Bouquet bouquet, List<Flower> flowers) {
        this.bouquet = bouquet;
        this.flowers = flowers;
    }

    @Override
    public void execute() {
        for (Flower flower : flowers) {
            bouquet.addFlower(flower);
        }
        System.out.println("Квіти додано до букета.");
    }

    @Override
    public String getDesc(){
        return "Добавити завантажені квіти в букет";
    }
}



