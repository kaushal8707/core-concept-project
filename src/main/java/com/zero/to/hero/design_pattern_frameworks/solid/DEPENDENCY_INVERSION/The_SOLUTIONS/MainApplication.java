package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.The_SOLUTIONS;

// In your main application, you "inject" the specific implementation you need. This makes it trivial to swap providers or use "mocks" for testing.

public class MainApplication {
    public static void main(String[] args) {
        // Use Email
        MessageSender email = new EmailSender();
        NotificationService service = new NotificationService(email);
        service.notify("Hello via Email!");

        // Switch to SMS without changing NotificationService code
        MessageSender sms = new SmsSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.notify("Hello via SMS!");
    }
}
