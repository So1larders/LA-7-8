package Command;
import flower.*;

public class ShowBouquetCommand implements Command {
    private Bouquet bouquet;

    public ShowBouquetCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }


    @Override
    public void execute() {
        bouquet.showBouquet();
    }

    @Override
    public String getDesc(){
        return "Показати букет";
    }
}

