package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public class Developer implements Employee {
    @Override
    public String employeeType() {
        return "Employee Type  - Developer";
    }
    @Override
    public double checkRating() {
        return 2.9;
    }
}
