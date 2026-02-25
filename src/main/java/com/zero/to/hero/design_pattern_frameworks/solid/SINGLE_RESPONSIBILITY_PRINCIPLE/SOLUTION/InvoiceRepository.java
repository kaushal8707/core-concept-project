package com.zero.to.hero.design_pattern_frameworks.solid.SINGLE_RESPONSIBILITY_PRINCIPLE.SOLUTION;

// 2. Specialized Persistence Class
public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}