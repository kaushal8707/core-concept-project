package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.THE_VIOLATION__Tight_Coupling;

// High-level module (Violates DIP)
class NotificationService {
    private EmailSender emailSender = new EmailSender(); // Direct dependency on concretion

    public void notify(String message) {
        emailSender.sendEmail(message);
    }
}

