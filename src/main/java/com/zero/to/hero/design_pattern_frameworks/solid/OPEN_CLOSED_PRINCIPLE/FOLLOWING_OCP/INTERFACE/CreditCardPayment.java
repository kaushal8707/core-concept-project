package com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.INTERFACE;

public class CreditCardPayment implements PaymentMethod {
    public void process(double amount)
    {
        System.out.println("Processing Credit Card: $" + amount);
    }
}