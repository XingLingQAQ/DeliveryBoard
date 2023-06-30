package me.deliveryboard.external;

import org.bukkit.inventory.ItemStack;

public abstract class ItemPlugin {
    public abstract String getName();
    public abstract ItemStack generateItem(String itemID, String itemType);
    public abstract boolean isMatching(ItemStack generatedItem, ItemStack submittedItem);

}
