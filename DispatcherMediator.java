import java.util.ArrayList;
import java.util.List;

public class DispatcherMediator {
    private List<Driver> drivers;
    private List<Client> clients;
    private Dispatcher dispatcher;

    public DispatcherMediator() {
        this.drivers = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.dispatcher = new Dispatcher(this);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void notifyDrivers(Client client, String destination) {
        for (Driver driver : drivers) {
            driver.offerRide(destination);
        }
    }

    public void notifyClient(Driver driver, String destination) {
        // In a real scenario, you might check availability or preferences
        // For simplicity, we assign the first available driver
        if (!clients.isEmpty()) {
            Client client = clients.get(0); // Assign to the first client for simplicity
            dispatcher.assignDriver(client, driver);
        }
    }
}
