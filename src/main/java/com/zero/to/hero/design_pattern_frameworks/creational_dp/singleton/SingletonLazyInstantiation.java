package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

/**
 This is also a sub part of Eager initialization. The only difference is object is created in a static block so that we can have access on its creation, like exception handling. In this way also, object is created at the time of class loading.
 It can be used when there is a chance of exceptions in creating object with eager initialization. */
/** Pros: No need to implement getInstance() method. Instance can be accessed directly.
   Exceptions can be handled in static block. May lead to resource wastage. Because instance of class is created always, whether it is required or not. */

public class SingletonLazyInstantiation {
    private static SingletonLazyInstantiation instance;
    private SingletonLazyInstantiation(){}
    public static SingletonLazyInstantiation getInstance() {
        if(instance==null) {
            instance = new SingletonLazyInstantiation();
        }
        return instance;
    }
}
