package com.zero.to.hero.design_pattern_frameworks.creational_dp.abstractfactory;

public class MainClass {
    public static void main(String[] args) {
        String hiringFor = "FRESHERS";
        AbstractFactory abstractFactory = AbstractFactoryProducer.hiring(hiringFor);
        Hiring hiring = abstractFactory.employeeType("contract");
        String hiringProcess = hiring.hiring();
        System.out.println("hiring process : "+hiringProcess);
    }
}
