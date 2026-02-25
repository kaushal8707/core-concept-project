package com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.ABSTRACTION;

import com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.INTERFACE.CreditCardPayment;
import com.zero.to.hero.design_pattern_frameworks.solid.OPEN_CLOSED_PRINCIPLE.FOLLOWING_OCP.INTERFACE.PaymentMethod;

public class MainApp {
    public static void main(String[] args) {
        PaymentMethod paymentMethod=new CreditCardPayment();
        new PaymentProcessor(paymentMethod).process(120);
    }
}
