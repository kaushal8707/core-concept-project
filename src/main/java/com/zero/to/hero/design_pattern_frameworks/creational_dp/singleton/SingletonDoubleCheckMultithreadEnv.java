package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

public class SingletonDoubleCheckMultithreadEnv {
    private static SingletonDoubleCheckMultithreadEnv instance;
    private SingletonDoubleCheckMultithreadEnv(){}
    public static SingletonDoubleCheckMultithreadEnv getInstance() {
        if(instance==null) {
            synchronized (SingletonDoubleCheckMultithreadEnv.class){
                if(instance==null){
                    instance = new SingletonDoubleCheckMultithreadEnv();
                }
            }
        }
        return instance;
    }
}

