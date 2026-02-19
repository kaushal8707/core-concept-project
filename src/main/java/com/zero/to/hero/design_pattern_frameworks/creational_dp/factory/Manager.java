package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public class Manager implements Employee {
    @Override
    public String employeeType() {
        return "Employee Type  - Manager";
    }
    @Override
    public double checkRating() {
        return 4.8;
    }
}
