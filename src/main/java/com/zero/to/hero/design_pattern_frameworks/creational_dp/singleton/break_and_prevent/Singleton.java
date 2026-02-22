package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton.break_and_prevent;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton INSTANCE;
    private Singleton(){
//        throw new IllegalArgumentException("Constructor not allowed instance creation");
    };
    public static Singleton getInstance() {
        if(INSTANCE==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;  //super.clone();
    }

    Object readResolve() {
        return INSTANCE;
    }
}
