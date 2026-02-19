package com.zero.to.hero.design_pattern_frameworks.creational_dp.prototype;

public class MainApp {
    public static void main(String[] args) {
        int productId = 1;
        InventoryCache.load();
        InventoryDetails cloneNewInventroyDetails = InventoryCache.getCloneNewInventroyDetails(productId);
        System.out.println("cloned instance object: "+cloneNewInventroyDetails);
    }
}
