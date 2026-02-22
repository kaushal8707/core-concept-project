package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton;

public class MainClass {
    public static void main(String[] args) {

        /** Multithreading Scenarios Test for SingletonLazyInstantiation*/
        Thread t1 = new Thread(()-> System.out.println(SingletonLazyInstantiation.getInstance()));
        Thread t2 = new Thread(()-> System.out.println(SingletonLazyInstantiation.getInstance()));
        t1.start();
        t2.start();

        /** Eager Instantiation */
        SingletonEagerInstantiation instance1 = SingletonEagerInstantiation.getInstance();
        SingletonEagerInstantiation instance2 = SingletonEagerInstantiation.getInstance();
        System.out.println(instance1+ "\n--\n"+instance2);         System.out.println("\n\n");

        /** Eager Instantiation Using static Block*/
        SingletonEagerInstantiationStaticBlock instance3 = SingletonEagerInstantiationStaticBlock.instance;
        SingletonEagerInstantiationStaticBlock instance4 = SingletonEagerInstantiationStaticBlock.instance;
        System.out.println(instance3+ "\n--\n"+instance4);         System.out.println("\n\n");

        /** Lazy Instantiation */
        SingletonLazyInstantiation instance5 = SingletonLazyInstantiation.getInstance();
        SingletonLazyInstantiation instance6 = SingletonLazyInstantiation.getInstance();
        System.out.println(instance5+ "\n--\n"+instance6);         System.out.println("\n\n");

        /** Thread Safe Scenario 1 Test*/
        Thread t3 = new Thread(()-> System.out.println(SingletonMultithreadEnv.getInstance()));
        Thread t4 = new Thread(()-> System.out.println(SingletonMultithreadEnv.getInstance()));
        t3.start();
        t4.start();  System.out.println("\n\n");

        /** Thread Safe Scenario 2 Test*/
        Thread t5 = new Thread(()-> System.out.println(SingletonDoubleCheckMultithreadEnv.getInstance()));
        Thread t6 = new Thread(()-> System.out.println(SingletonDoubleCheckMultithreadEnv.getInstance()));
        t5.start();
        t6.start(); System.out.println("\n\n");
    }
}
