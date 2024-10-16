public class Driver {
    private String name;
    private double latitude;  // Driver's current latitude
    private double longitude; // Driver's current longitude

    public Driver(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Method to calculate distance (simple Euclidean distance)
    public double distanceTo(double clientLatitude, double clientLongitude) {
        return Math.sqrt(Math.pow(latitude - clientLatitude, 2) + Math.pow(longitude - clientLongitude, 2));
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', latitude=" + latitude + ", longitude=" + longitude + "}";
    }
}
