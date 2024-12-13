package Command;
import flower.*;
import java.util.Scanner;

public class CreateNewAccessoryCommand implements Command {
    private Bouquet bouquet;
    private Scanner scanner;

    public CreateNewAccessoryCommand(Bouquet bouquet, Scanner scanner) {
        this.bouquet = bouquet;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Введіть назву аксесуара: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Введіть ціну: ");
        double price = scanner.nextDouble();
        Accessories newAccessory = new Accessories(name, price);
        bouquet.addAccessory(newAccessory);
        System.out.println("Аксесуар додано до букета.");
    }

    @Override
    public String getDesc(){
        return "Створити і добавити аксесуар";
    }
}