package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;
/***  To make a singleton class thread safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously /**
 *Pros: getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
 The main problem is if 2 thread parallely come to instance == null so both will lock at same time if we have 1000 line of code
 inside synchronization method at that time second thread need to wait to come out first thread so in this case better to go for synchronization block */

public class SingletonMultithreadEnv {

    private static SingletonMultithreadEnv instance;
    private SingletonMultithreadEnv(){}
    public static synchronized SingletonMultithreadEnv getInstance() {
        if(instance==null) {
            instance = new SingletonMultithreadEnv();
        }
        return instance;
    }
}
