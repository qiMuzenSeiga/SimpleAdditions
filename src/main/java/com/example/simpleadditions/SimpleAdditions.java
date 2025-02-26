package com.example.simpleadditions;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.simpleadditions.items.ItemBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class SimpleAdditions {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);
    public static final String MOD_ID = Tags.MOD_ID;
    public static final String MOD_NAME = Tags.MOD_NAME;

    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", MOD_NAME);
    }

    // 注册物品事件
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item exampleItem = new ItemBase("example_item"); // 使用 Item 类型变量
        event.getRegistry().register(exampleItem);
    }
}