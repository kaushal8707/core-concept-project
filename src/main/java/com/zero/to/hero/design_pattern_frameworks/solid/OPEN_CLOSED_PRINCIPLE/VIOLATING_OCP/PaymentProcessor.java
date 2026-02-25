package com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.VIOLATING_OCP;

// WRONG: Modification required to add new methods : In this example, every time you add a new payment type (like Google Pay), you must modify the processPayment method. This risks breaking existing, tested code.

class PaymentProcessor {
    public void processPayment(String type, double amount) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing Credit Card: $" + amount);
        } else if (type.equals("PayPal")) {
            System.out.println("Processing PayPal: $" + amount);
        }
    }
}