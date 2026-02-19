package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public interface Employee {
    String employeeType();
    double checkRating();
    default String getCompany() {
        return "Employee from Persi !!";
    }
}
