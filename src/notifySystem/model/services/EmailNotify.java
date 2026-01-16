package notifySystem.model.services;

public class EmailNotify implements Notify{
    @Override
    public String send(String message) {
        return "Send from Email: " + message;
    }
}
