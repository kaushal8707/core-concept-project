package com.zero.to.hero.design_pattern_frameworks.creational_dp.abstractfactory;

public class FreshersFactory extends AbstractFactory{
    @Override
    public Hiring employeeType(String type) {
        if(type.equals("contract")){
            return new FreshersContractual();
        }else {
            return new FreshersFullTime();
        }
    }
}
