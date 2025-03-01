package com.example.simpleadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.example.simpleadditions.SimpleAdditions;

public class ItemBase extends Item {
    public ItemBase(String name) {
        setRegistryName(name);
        setTranslationKey(SimpleAdditions.MOD_ID + "." + name);
        setCreativeTab(CreativeTabs.MISC);
    }
}