package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton.break_and_prevent;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance = Singleton.getInstance();
        Singleton clonedInstance = (Singleton) instance.clone();

        System.out.println("Instance : "+instance);
        System.out.println("Cloned Instance : "+clonedInstance);
    }
}
