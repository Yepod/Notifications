package se.jensen.william.notificationdemo;

import java.time.LocalDateTime;

public class SMSNotification extends Notification{
    final private String senderName;

    public SMSNotification(String recipient, String subject, String message, LocalDateTime createdAt, String senderName) {
        super(recipient, subject, message, createdAt);
        this.senderName = senderName;
    }

    public void send() {
        System.out.println("\nSent from: " + senderName +
                           ".\nRecipient: " + getRecipient() +
                           ".\nSubject: " + getSubject() +
                           "\nMessage: " + getMessage() +
                           "?\nSent at: " + getCreatedAt());
    }
}
