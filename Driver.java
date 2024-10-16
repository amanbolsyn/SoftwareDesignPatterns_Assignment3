public class Driver {
    private String name;
    private DispatcherMediator mediator;

    public Driver(String name, DispatcherMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void offerRide(String destination) {
        System.out.println(name + " offers a ride to " + destination);
        mediator.notifyClient(this, destination);
    }

    public void receiveNotification(String message) {
        System.out.println(name + " received notification: " + message);
    }

    public String getName() {
        return name;
    }
}
