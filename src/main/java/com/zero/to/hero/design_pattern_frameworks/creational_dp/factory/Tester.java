package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public class Tester implements Employee {
    @Override
    public String employeeType() {
        return "Employee Type  - Tester";
    }
    @Override
    public double checkRating() {
        return 2.6;
    }
}
