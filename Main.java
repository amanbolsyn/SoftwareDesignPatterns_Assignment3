public class Main {
    public static void main(String[] args) {
        // Create a collection of drivers
        DriverCollection driverCollection = new DriverCollection();
        driverCollection.addDriver(new Driver("Alice", 1.0, 2.0));
        driverCollection.addDriver(new Driver("Bob", 2.0, 3.0));
        driverCollection.addDriver(new Driver("Charlie", 0.5, 1.5));

        // Create a client
        Client client = new Client(1.5, 2.5);

        // Use the DriverIterator to find the closest driver
        DriverIterator driverIterator = driverCollection.iterator();
        Driver closestDriver = null;
        double closestDistance = Double.MAX_VALUE;

        while (driverIterator.hasNext()) {
            Driver driver = driverIterator.next();
            double distance = driver.distanceTo(client.getLatitude(), client.getLongitude());
            if (distance < closestDistance) {
                closestDistance = distance;
                closestDriver = driver;
            }
        }

        // Output the closest driver
        if (closestDriver != null) {
            System.out.println("Closest driver: " + closestDriver);
        } else {
            System.out.println("No drivers available.");
        }
    }
}
