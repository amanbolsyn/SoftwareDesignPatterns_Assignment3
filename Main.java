public class Main {
    public static void main(String[] args) {
        // Create a taxi order
        TaxiOrder order = new TaxiOrder("123 Main St");

        // Create command objects
        Command createOrder = new CreateOrderCommand(order);
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "456 Elm St");

        // Create an OrderManager to execute commands
        OrderManager orderManager = new OrderManager();

        // Execute commands
        orderManager.takeOrder(createOrder);
        orderManager.takeOrder(changeDestination);
        orderManager.takeOrder(cancelOrder);
        
        // Show command history
        System.out.println("Command history: " + orderManager.getCommandHistory());
    }
}
