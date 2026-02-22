package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

/**  * Bill Pugh Singleton Implementation: Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded environment.
 * So, Bill Pugh suggested a concept of inner static classes to use for singleton,
 * When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
 * This is the most widely used approach as it doesn’t use synchronization. **/

public class SingletonClass_BillPugh_SingletonImplementation {
    private SingletonClass_BillPugh_SingletonImplementation(){};
    private static class BillPughSingleton {
       private static final SingletonClass_BillPugh_SingletonImplementation instance =
                new SingletonClass_BillPugh_SingletonImplementation();
    }
    public static SingletonClass_BillPugh_SingletonImplementation getInstance() {
        return BillPughSingleton.instance;
    }

}
