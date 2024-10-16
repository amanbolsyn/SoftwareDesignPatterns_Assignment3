public class Dispatcher {
    private DispatcherMediator mediator;

    public Dispatcher(DispatcherMediator mediator) {
        this.mediator = mediator;
    }

    public void assignDriver(Client client, Driver driver) {
        System.out.println("Dispatcher assigns " + driver.getName() + " to " + client.getName());
        driver.receiveNotification("You have been assigned to " + client.getName());
        client.receiveNotification(driver.getName() + " is on the way.");
    }
}
