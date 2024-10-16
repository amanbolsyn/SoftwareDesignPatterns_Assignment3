import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Command> commandHistory = new ArrayList<>();

    public void takeOrder(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public List<Command> getCommandHistory() {
        return commandHistory;
    }
}
