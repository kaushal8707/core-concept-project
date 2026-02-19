package com.zero.to.hero.design_pattern_frameworks.creational_dp.factory;

import org.apache.catalina.util.StringUtil;
import org.apache.commons.lang3.StringUtils;

public class Producer {
    public static Employee findEmployee(String type) {
        Employee employee;
        switch(type){
            case "Architect":
                employee = new Architect();
                break;
            case "Manager":
                employee = new Manager();
                break;
            case "Tester":
                employee = new Tester();
                break;
            case "Developer":
                employee = new Developer();
                break;
            default:
                return null;
        }
        return employee;
    }
}
