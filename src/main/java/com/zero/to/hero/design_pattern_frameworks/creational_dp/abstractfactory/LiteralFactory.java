package com.zero.to.hero.design_pattern_frameworks.creational_dp.abstractfactory;

public class LiteralFactory extends AbstractFactory{
    @Override
    public Hiring employeeType(String type) {
        if(type.equals("contract")){
            return new LiteralsContractual();
        }else {
            return new LiteralFullTime();
        }
    }
}
