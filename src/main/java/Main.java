import flower.*;
import Command.*;
import Email.*;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Email emailService = new Email();
    private static boolean exit = false;

    public static void main(String[] args) {
        logger.info("Програма запущена.");

        Bouquet bouquet = new Bouquet();
        Invoker invoker = new Invoker();
        Scanner scanner = new Scanner(System.in);
        List<Flower> flowers = new ArrayList<>();
        List<Accessories> accessories = new ArrayList<>();

        Map<Integer, Command> commandMap = new HashMap<>();
        commandMap.put(1, new SortFlowersCommand(bouquet));
        commandMap.put(2, new SearchFlowersCommand(bouquet, 0,1));
        commandMap.put(3, new ShowBouquetCommand(bouquet));
        commandMap.put(4, new CreateNewFlowerCommand(bouquet, scanner));
        commandMap.put(5, new CreateNewAccessoryCommand(bouquet, scanner));
        commandMap.put(6, new LoadFlowersCommand(flowers, "flowers.txt"));
        commandMap.put(7, new LoadAccessoriesCommand(accessories, "accessories.txt"));
        commandMap.put(8, new AddLoadedFlowersCommand(bouquet, flowers));
        commandMap.put(9, new AddLoadedAccessoriesCommand(bouquet, accessories));

        Integer option;
        do {
            printMenu(commandMap);
            System.out.print("Операція: ");
            option = scanner.nextInt();
            scanner.nextLine();
            try {
                Command command = commandMap.get(option);
                if (command != null) {
                    logger.info("Виконано команду: {}", command.getDesc());
                    command.execute();
                } else if (!option.equals(0)) {
                    logger.warn("Користувач вибрав некоректну дію: {}", option);
                    System.out.println("Такої дії не існує");
                }
            } catch (Exception e) {
                logger.error("Критична помилка: ", e);
                emailService.sendErrorEmail("Критична помилка у програмі!", e.getMessage());
            }
        } while (!option.equals(0));

        logger.info("Програма завершується.");
        System.out.println("Вихід");
        scanner.close();
    }

    private static void printMenu(Map<Integer, Command> commandMap) {
        System.out.println("\nМеню:");
        for (Map.Entry<Integer, Command> entry : commandMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getDesc());
        }
        System.out.println("0: Вихід");
    }
}
