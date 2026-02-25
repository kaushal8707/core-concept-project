package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example2__When_we_want_a_simplified_version_of_a_complex_or_heavy_object;

public class ExpensiveObjectImpl implements ExpensiveObject{
    ExpensiveObjectImpl() {
        initialConfiguration();
    }

    private void initialConfiguration() {
        System.out.println("loading initial configuration....");
    }

    @Override
    public void process() {
        System.out.println("processing is complete...");
    }
}
