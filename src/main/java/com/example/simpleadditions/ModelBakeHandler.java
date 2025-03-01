//package com.example.simpleadditions;
//
//import net.minecraft.client.renderer.block.model.IBakedModel;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraftforge.client.event.ModelBakeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
//@Mod.EventBusSubscriber(modid = SimpleAdditions.MOD_ID, value = Side.CLIENT)
//@SideOnly(Side.CLIENT)
//public class ModelBakeHandler {
//
//    @SubscribeEvent
//    public static void onModelBake(ModelBakeEvent event) {
//        ModelResourceLocation modelRL = new ModelResourceLocation("simpleadditions:example_item", "inventory");
//        IBakedModel model = event.getModelRegistry().getObject(modelRL);
//        if (model != null) {
//            SimpleAdditions.LOGGER.info("Model {} baked successfully!", modelRL);
//        } else {
//            SimpleAdditions.LOGGER.error("Model {} is missing in the model registry!", modelRL);
//        }
//    }
//}
