package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.THE_VIOLATION__Tight_Coupling;

// Low-level module
class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }
}

