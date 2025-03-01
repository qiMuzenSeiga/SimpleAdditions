package com.example.simpleadditions;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.simpleadditions.items.ItemBase;


@Mod(
        modid = SimpleAdditions.MOD_ID,
        name = SimpleAdditions.MOD_NAME,
        version = SimpleAdditions.VERSION
)
@Mod.EventBusSubscriber(modid = SimpleAdditions.MOD_ID)
public class SimpleAdditions {

    // 直接定义常量（如果 Tags 类未生成）
    public static final String MOD_ID = "simpleadditions";
    public static final String MOD_NAME = "SimpleAdditions";
    public static final String VERSION = "1.0.0";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (event.getSide().isClient()) {
            // 检查纹理是否正确加载。注意：传入的路径要与资源文件夹结构匹配
            TextureChecker.checkTexture("simpleadditions", "textures/items/example_item.png");
        }
        LOGGER.info("Hello From {}!", MOD_NAME);
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item exampleItem = new ItemBase("example_item");
        event.getRegistry().register(exampleItem);
    }


}
