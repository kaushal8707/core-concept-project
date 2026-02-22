package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

public class SingletonEagerInstantiationStaticBlock {

    public static SingletonEagerInstantiationStaticBlock instance;
    private SingletonEagerInstantiationStaticBlock(){}
    static{
        instance = new SingletonEagerInstantiationStaticBlock();
    }
}
