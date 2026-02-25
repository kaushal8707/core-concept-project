package com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter;

// What you have (incompatible)  - Adaptee (Legacy Class) : This is the old or third-party class that has the functionality you need but an incompatible method name or signature

public class LegacyPrinter{
    public void printDocument() {
        System.out.println("Printing a documents through Legacy Printer...");
    }
}
