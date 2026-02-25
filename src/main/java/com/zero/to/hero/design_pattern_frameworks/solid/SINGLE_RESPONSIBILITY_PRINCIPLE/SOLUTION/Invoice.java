package com.zero.to.hero.design_pattern_frameworks.solid.SINGLE_RESPONSIBILITY_PRINCIPLE.SOLUTION;

// 1. Data Model
public class Invoice {
    private final double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}