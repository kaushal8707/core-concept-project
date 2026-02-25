package com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.ABSTRACTION;

import com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.INTERFACE.PaymentMethod;

public class PaymentProcessor {
    PaymentMethod method;

    public PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    public void process(double amount) {
        method.process(amount);
    }
}