package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.The_SOLUTIONS;

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}