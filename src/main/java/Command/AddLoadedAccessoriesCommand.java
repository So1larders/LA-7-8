package Command;
import flower.*;
import java.util.List;

public class AddLoadedAccessoriesCommand implements Command {
    private Bouquet bouquet;
    private List<Accessories> accessories;

    public AddLoadedAccessoriesCommand(Bouquet bouquet, List<Accessories> accessories) {
        this.bouquet = bouquet;
        this.accessories = accessories;
    }

    @Override
    public void execute() {
        for (Accessories accessory : accessories) {
            bouquet.addAccessory(accessory);
        }
        System.out.println("Аксесуари додано до букета.");
    }

    @Override
    public String getDesc(){
        return "Добавити завантажені аксесуари в букет";
    }
}
