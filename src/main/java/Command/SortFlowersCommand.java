package Command;

import flower.Bouquet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortFlowersCommand implements Command {
    private static final Logger logger = LoggerFactory.getLogger(SortFlowersCommand.class);
    private Bouquet bouquet;

    public SortFlowersCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        logger.info("Виконується команда сортування квітів.");
        bouquet.sortFlowersByFreshness();
        logger.info("Квіти успішно відсортовані.");
    }

    @Override
    public String getDesc() {
        return "Сортування квітів за свіжістю";
    }
}
