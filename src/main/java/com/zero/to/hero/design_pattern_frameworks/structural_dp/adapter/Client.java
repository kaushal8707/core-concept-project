package com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter;

public class Client {
    public static void main(String[] args) {

        // We have a legacy printer
        LegacyPrinter legacyPrinter=new LegacyPrinter();

        // We wrap it in our adapter
        Printer printer = new PrinterAdapter(legacyPrinter);

        // The application uses the standard 'print()' method
        printer.print();
    }
}
