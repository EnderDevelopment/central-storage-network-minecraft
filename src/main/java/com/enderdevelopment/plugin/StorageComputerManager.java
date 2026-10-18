package com.enderdevelopment.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class StorageComputerManager {

    private static final String STORAGE_COMPUTER_KEY = "storage_computer";
    private static final String STORAGE_DISK_KEY = "storage_disk";
    private static final String CABLE_KEY = "cable";
    private static final String WIRELESS_REMOTE_KEY = "wireless_remote";

    public static void init(JavaPlugin plugin) {
        // Register the storage computer recipe
        registerStorageComputerRecipe(plugin);
        // Register the storage disk recipe
        registerStorageDiskRecipe(plugin);
        // Register the cable recipe
        registerCableRecipe(plugin);
        // Register the wireless remote recipe
        registerWirelessRemoteRecipe(plugin);
    }

    private static void registerStorageComputerRecipe(JavaPlugin plugin) {
        ItemStack storageComputer = new ItemStack(Material.CHEST);
        ItemMeta meta = storageComputer.getItemMeta();
        meta.setDisplayName("Storage Computer");
        storageComputer.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, STORAGE_COMPUTER_KEY);
        ShapedRecipe recipe = new ShapedRecipe(key, storageComputer);
        recipe.shape("III", "ICI", "III");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('C', Material.CHEST);
        Bukkit.addRecipe(recipe);
    }

    private static void registerStorageDiskRecipe(JavaPlugin plugin) {
        ItemStack storageDisk = new ItemStack(Material.DIAMOND);
        ItemMeta meta = storageDisk.getItemMeta();
        meta.setDisplayName("Storage Disk");
        storageDisk.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, STORAGE_DISK_KEY);
        ShapedRecipe recipe = new ShapedRecipe(key, storageDisk);
        recipe.shape("DDD", "DGD", "DDD");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        Bukkit.addRecipe(recipe);
    }

    private static void registerCableRecipe(JavaPlugin plugin) {
        ItemStack cable = new ItemStack(Material.STRING);
        ItemMeta meta = cable.getItemMeta();
        meta.setDisplayName("Cable");
        cable.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, CABLE_KEY);
        ShapedRecipe recipe = new ShapedRecipe(key, cable);
        recipe.shape(" S ", "S S", " S ");
        recipe.setIngredient('S', Material.STRING);
        Bukkit.addRecipe(recipe);
    }

    private static void registerWirelessRemoteRecipe(JavaPlugin plugin) {
        ItemStack wirelessRemote = new ItemStack(Material.COMPASS);
        ItemMeta meta = wirelessRemote.getItemMeta();
        meta.setDisplayName("Wireless Remote");
        wirelessRemote.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, WIRELESS_REMOTE_KEY);
        ShapedRecipe recipe = new ShapedRecipe(key, wirelessRemote);
        recipe.shape(" R ", "RCR", " R ");
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('C', Material.COMPASS);
        Bukkit.addRecipe(recipe);
    }
}