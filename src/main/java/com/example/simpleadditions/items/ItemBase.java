package com.example.simpleadditions.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.example.simpleadditions.SimpleAdditions;


public class ItemBase extends Item {
    public ItemBase(String name) {
        setRegistryName(name); // 注册名称
        setTranslationKey(SimpleAdditions.MOD_ID + "." + name); // 本地化键
        setCreativeTab(CreativeTabs.MISC); // 设置到创造模式物品栏
    }
}