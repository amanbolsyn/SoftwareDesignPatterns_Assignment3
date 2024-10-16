public class Main {
    public static void main(String[] args) {
        // Create a mediator
        DispatcherMediator mediator = new DispatcherMediator();

        // Create clients
        Client client1 = new Client("Alice", mediator);
        Client client2 = new Client("Bob", mediator);
        mediator.registerClient(client1);
        mediator.registerClient(client2);

        // Create drivers
        Driver driver1 = new Driver("Charlie", mediator);
        Driver driver2 = new Driver("Dave", mediator);
        mediator.registerDriver(driver1);
        mediator.registerDriver(driver2);

        // Client requests a ride
        client1.requestRide("123 Main St");
    }
}
