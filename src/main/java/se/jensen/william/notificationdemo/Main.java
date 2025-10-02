package se.jensen.william.notificationdemo;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        EmailNotification email = new EmailNotification("Axis Communications", "Job Application",
                                                        "I would like to apply", now, "wr@hotmail.com");

        SMSNotification sms = new SMSNotification("Kim Granath", "Game",
                                                  "You wanna play", now, "W.R");

        PushNotification gameNotification = new PushNotification("Williams Phone",
                                                                "Collect resources",
                                                                "Your resources are ready to be collected",
                                                                now, "Samsung S24");

        email.send();
        sms.send();
        gameNotification.send();
    }
}
