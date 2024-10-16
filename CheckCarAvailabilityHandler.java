public class CheckCarAvailabilityHandler extends Handler {
    @Override
    public String handle(Request request) {
        System.out.println("Checking car availability...");
        if (request.isCarAvailable()) {
            return nextHandler != null ? nextHandler.handle(request) : "Request processed successfully: Car dispatched!";
        } else {
            return "No cars available.";
        }
    }
}
