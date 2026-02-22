package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

/*** In this, object of class is created when it is loaded to the memory by JVM. the instance is not too large in terms of resources and time. /**
     Pros: May lead to resource wastage. Because instance of class is created always, whether it is required or not.
     Exception handling is not possible.
 */
public class SingletonEagerInstantiation {

    private static SingletonEagerInstantiation instance = new SingletonEagerInstantiation();
    private SingletonEagerInstantiation(){}
    public static SingletonEagerInstantiation getInstance() {
        return instance;
    }

}
