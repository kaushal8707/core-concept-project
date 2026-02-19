package com.zero.to.hero.design_pattern_frameworks.creational_dp.prototype;
import java.util.Hashtable;

public class InventoryCache {

    public static Hashtable<Integer, InventoryDetails> inventoryItemDetails =
            new Hashtable<>();

    public static InventoryDetails getCloneNewInventroyDetails(int id) {
        InventoryDetails cacheInventoryDetailsInstance = inventoryItemDetails.get(id);
        System.out.println("cache instance object: "+cacheInventoryDetailsInstance);
        return (InventoryDetails) cacheInventoryDetailsInstance.clone();
    }

    public static void load(){
        ElectronicsItem electronicsItem = new ElectronicsItem();
        electronicsItem.id=1;
        inventoryItemDetails.put(electronicsItem.id, electronicsItem);

        HomeAppliances homeAppliances = new HomeAppliances();
        homeAppliances.id=2;
        inventoryItemDetails.put(homeAppliances.id, homeAppliances);

        GroceriesItems groceriesItems = new GroceriesItems();
        groceriesItems.id=3;
        inventoryItemDetails.put(groceriesItems.id, groceriesItems);
    }
}
