package Command;
import flower.*;

public class AddAccessoryCommand implements Command {
    private Bouquet bouquet;
    private Accessories accessory;

    public AddAccessoryCommand(Bouquet bouquet, Accessories accessory) {
        this.bouquet = bouquet;
        this.accessory = accessory;
    }

    @Override
    public void execute() {
        bouquet.addAccessory(accessory);
    }

    @Override
    public String getDesc(){
        return "Створити і добавити аксесуар";
    }
}