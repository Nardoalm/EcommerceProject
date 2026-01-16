package notifySystem.model.entities;

import notifySystem.model.services.Notify;

public class SystemNotify {
    private Notify notify;

    public SystemNotify(){}

    public String send(String message){
        return notify.send(message);
    }

    public void setNotify(Notify notify) {
        this.notify = notify;
    }
}
