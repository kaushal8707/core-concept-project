package com.zero.to.hero.design_pattern_frameworks.creational_dp.prototype;

public abstract class InventoryDetails implements Cloneable{
    int id;
    public abstract String productDetails();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
