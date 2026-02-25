package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.The_SOLUTIONS;

// Implement Low-Level Modules
class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}