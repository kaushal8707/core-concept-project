package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example2__When_we_want_a_simplified_version_of_a_complex_or_heavy_object;

public class Client {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveProxyObjectImpl();
        object.process();
        object.process();
    }
}
