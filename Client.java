public class Client {
    private String name;
    private DispatcherMediator mediator;

    public Client(String name, DispatcherMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void requestRide(String destination) {
        System.out.println(name + " requests a ride to " + destination);
        mediator.notifyDrivers(this, destination);
    }

    public void receiveNotification(String message) {
        System.out.println(name + " received notification: " + message);
    }

    public String getName() {
        return name;
    }
}
