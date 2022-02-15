package Behaviorial.Observer;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    // Слушатель, рассылающий email-уведомления

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
