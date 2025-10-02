package se.jensen.william.notificationdemo;

import java.time.LocalDateTime;

public class EmailNotification extends Notification{
    final private String fromAddress;

    public EmailNotification(String recipient, String subject, String message,
                             LocalDateTime createdAt, String fromAddress) {

        super(recipient, subject, message, createdAt);
        this.fromAddress = fromAddress;
    }

    public void send() {
        System.out.println("\nMail sent from: " + fromAddress + ".\nRecipient: " + getRecipient()+
                           ".\nSubject: " + getSubject() + ".\nMessage: " + getMessage() +
                           ".\nSent at: " + getCreatedAt());
    }
}
