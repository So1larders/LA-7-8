package Command;
import flower.*;

public class AddFlowerCommand implements Command {
    private Bouquet bouquet;
    private Flower flower;

    public AddFlowerCommand(Bouquet bouquet, Flower flower) {
        this.bouquet = bouquet;
        this.flower = flower;
    }

    @Override
    public void execute() {
        bouquet.addFlower(flower);
    }

    @Override
    public String getDesc(){
        return "Створити і добавити нову квітку";
    }
}