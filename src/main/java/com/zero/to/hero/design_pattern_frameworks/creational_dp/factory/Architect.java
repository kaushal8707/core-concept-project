package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public class Architect implements Employee {
    @Override
    public String employeeType() {
        return "Employee Type  - Architect";
    }
    @Override
    public double checkRating() {
        return 3.7;
    }
}
