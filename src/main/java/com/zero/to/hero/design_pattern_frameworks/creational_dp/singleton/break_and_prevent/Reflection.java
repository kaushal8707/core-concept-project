package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton.break_and_prevent;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance = Singleton.getInstance();
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton reflectionInstance = declaredConstructor.newInstance();
        System.out.println("Instance : "+instance);
        System.out.println("Reflection Instance : "+reflectionInstance);
    }
}
