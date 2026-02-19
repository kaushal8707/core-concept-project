package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        String employeeType = "Architect";
        Employee empResult = Producer.findEmployee(employeeType);
        System.out.println("Rating of an Employee : "+empResult.checkRating());
        System.out.println("Type of an Employee : "+empResult.employeeType());
        System.out.println("Employee from which Company: "+empResult.getCompany());

        String employeeCheck = "Developer";
        Employee empDetails = Producer.findEmployee(employeeCheck);
        System.out.println("Rating of an Employee : "+empDetails.checkRating());
        System.out.println("Type of an Employee : "+empDetails.employeeType());
        System.out.println("Employee from which Company: "+empDetails.getCompany());


    }
}
