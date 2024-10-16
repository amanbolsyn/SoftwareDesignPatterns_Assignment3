public class Request {
    private boolean carAvailable;
    private double clientBalance;
    private double fare;
    private boolean locationValid;

    public Request(boolean carAvailable, double clientBalance, double fare, boolean locationValid) {
        this.carAvailable = carAvailable;
        this.clientBalance = clientBalance;
        this.fare = fare;
        this.locationValid = locationValid;
    }

    public boolean isCarAvailable() {
        return carAvailable;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public double getFare() {
        return fare;
    }

    public boolean isLocationValid() {
        return locationValid;
    }
}
