package se.jensen.william.notificationdemo;

import java.time.LocalDateTime;

public class PushNotification extends Notification{
    final private String deviceToken;

    public PushNotification(String recipient, String subject, String message,
                            LocalDateTime createdAt, String deviceToken) {

        super(recipient, subject, message, createdAt);
        this.deviceToken = deviceToken;
    }

    public void send() {
        System.out.println("\nSent from: " + deviceToken +
                           ".\nNotification to: " + getRecipient() +
                           ".\nSubject: " + getSubject() +
                           ".\nMessage: " + getMessage() +
                           ".\nSent at: " + getCreatedAt());
    }
}
