public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler checkCarAvailability = new CheckCarAvailabilityHandler();
        Handler checkClientBalance = new CheckClientBalanceHandler();
        Handler checkLocation = new CheckLocationHandler();

        // Set up the chain of responsibility
        checkCarAvailability.setNext(checkClientBalance).setNext(checkLocation);

        // Sample request
        Request request = new Request(true, 20.0, 15.0, true);

        // Process the request
        String result = checkCarAvailability.handle(request);
        System.out.println(result);
    }
}
