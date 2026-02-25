package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example2__When_we_want_a_simplified_version_of_a_complex_or_heavy_object;

public class ExpensiveProxyObjectImpl implements ExpensiveObject{

    ExpensiveObject expensiveObject;
    @Override
    public void process() {
        if(expensiveObject==null){
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();;
    }
}
