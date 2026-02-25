package com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.INTERFACE;

// Add new methods without changing existing ones
public class BitcoinPayment implements PaymentMethod {
    public void process(double amount) { System.out.println("Processing Bitcoin: $" + amount); }
}