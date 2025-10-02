package se.jensen.william.notificationdemo;

import java.time.LocalDateTime;

public abstract class Notification {
    private String recipient;
    private String subject;
    private String message;
    private LocalDateTime createdAt;

    public Notification(String recipient, String subject, String message, LocalDateTime createdAt){
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getRecipient() {return recipient;}
    public String getSubject() {return subject;}
    public String getMessage() {return message;}
    public LocalDateTime getCreatedAt() {return createdAt;}

    public abstract void send();

}
