package com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter;

//This class bridges the gap by implementing the Printer interface and wrapping a LegacyPrinter object.
public class PrinterAdapter implements Printer {
    LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        // Translate the call to the adaptee's method
        legacyPrinter.printDocument();
    }
}
