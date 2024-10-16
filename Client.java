public class Client {
    private double latitude;  // Client's latitude
    private double longitude; // Client's longitude

    public Client(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
