package Command;
import flower.*;
import java.util.Scanner;

public class CreateNewFlowerCommand implements Command {
    private Bouquet bouquet;
    private Scanner scanner;

    public CreateNewFlowerCommand(Bouquet bouquet, Scanner scanner) {
        this.bouquet = bouquet;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Введіть назву квітки: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Введіть свіжість (1-10): ");
        int freshness = scanner.nextInt();
        System.out.println("Введіть довжину стебла: ");
        double stemLength = scanner.nextDouble();
        System.out.println("Введіть ціну: ");
        double price = scanner.nextDouble();
        Flower newFlower = new Flower(name, freshness, stemLength, price);
        bouquet.addFlower(newFlower);
        System.out.println("Квітка додана до букета.");
    }
    @Override
    public String getDesc(){
        return "Створити і добавити квітку";
    }
}