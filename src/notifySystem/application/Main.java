package notifySystem.application;

import java.util.Scanner;
import notifySystem.model.entities.SystemNotify;
import notifySystem.model.services.EmailNotify;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SystemNotify systemNotify = new SystemNotify();

        systemNotify.setNotify(new EmailNotify());
        System.out.println(systemNotify.send("Hello World"));
    }
}
