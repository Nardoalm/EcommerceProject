package notifySystem.model.services;

public class SMSNotify implements Notify{
    @Override
    public String send(String message) {
        return "Send from SMS: " + message;
    }
}
