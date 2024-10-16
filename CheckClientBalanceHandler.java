public class CheckClientBalanceHandler extends Handler {
    @Override
    public String handle(Request request) {
        System.out.println("Checking client balance...");
        if (request.getClientBalance() >= request.getFare()) {
            return nextHandler != null ? nextHandler.handle(request) : "Request processed successfully: Car dispatched!";
        } else {
            return "Insufficient balance.";
        }
    }
}
