public class CheckLocationHandler extends Handler {
    @Override
    public String handle(Request request) {
        System.out.println("Checking location...");
        if (request.isLocationValid()) {
            return "Request processed successfully: Car dispatched!";
        } else {
            return "Invalid location";
        }
    }
}
