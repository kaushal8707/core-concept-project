package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.The_SOLUTIONS;

// Step C: High-Level Module Depends on Abstraction Now, NotificationService doesn't care how the message is sent,
// only that the sender follows the MessageSender contract.

class NotificationService {
    private final MessageSender messageSender;

    // Dependency Injection: Pass the implementation via constructor
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}
