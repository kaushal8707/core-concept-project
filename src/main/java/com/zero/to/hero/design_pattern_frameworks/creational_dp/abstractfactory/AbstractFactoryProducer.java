package com.zero.to.hero.design_pattern_frameworks.creational_dp.abstractfactory;

public class AbstractFactoryProducer {
    public static AbstractFactory hiring(String typeOfHiring) {
        if("FRESHERS".equals(typeOfHiring)) {
            return new FreshersFactory();
        }else {
            return new LiteralFactory();
        }
    }
}
