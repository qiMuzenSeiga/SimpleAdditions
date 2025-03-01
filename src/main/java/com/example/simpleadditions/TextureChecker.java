////package com.example.simpleadditions;
//
//import com.example.simpleadditions.SimpleAdditions;
//import net.minecraft.client.Minecraft;
//import net.minecraft.util.ResourceLocation;
//import java.io.IOException;
//
//// 注意：确保这段代码只在客户端执行，否则会抛出 NoSuchMethodError
//public class TextureChecker {
//
//    public static void checkTexture(String modid, String texturePath) {
//        // 这里的 texturePath 是相对于 assets/<modid>/ 的路径，例如 "textures/items/example_item.png"
//        ResourceLocation location = new ResourceLocation(modid, texturePath);
//        try {
//            // 尝试加载资源
//            Minecraft.getMinecraft().getResourceManager().getResource(location);
//            SimpleAdditions.LOGGER.info("Texture {} loaded successfully!", location);
//        } catch (IOException e) {
//            SimpleAdditions.LOGGER.error("Texture {} not found or failed to load!", location, e);
//        }
//    }
//}
