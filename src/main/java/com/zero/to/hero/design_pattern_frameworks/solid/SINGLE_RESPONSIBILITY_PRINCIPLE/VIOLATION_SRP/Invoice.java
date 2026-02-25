package com.zero.to.hero.design_pattern_frameworks.solid.SINGLE_RESPONSIBILITY_PRINCIPLE.VIOLATION_SRP;

// VIOLATION: This class has multiple reasons to change.
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Responsibility 1: Business Logic (Tax Calculation)
    public double calculateTotalWithTax() {
        return amount * 1.20; // 20% tax
    }

    // Responsibility 2: Persistence (Database Logic)
    public void saveToDatabase() {
        System.out.println("Saving invoice to MySQL database...");
    }

    // Responsibility 3: Notification (Email Logic)
    public void sendEmailNotification() {
        System.out.println("Sending invoice email to customer...");
    }
}