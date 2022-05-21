package com.uraneptus.ambience_expansion.core.data;

import com.uraneptus.ambience_expansion.AmbienceExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelProvider;

public class AEDatagenUtil {
    public static final String GENERATED = "item/generated";
    private static final String HANDHELD = "item/handheld";

    public static String name(Block block) {
        return block.getRegistryName().getPath();
    }

    public static String name(Item item) {
        return item.getRegistryName().getPath();
    }

    public static ResourceLocation modBlockLocation(String path) {
        return new ResourceLocation(AmbienceExpansion.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    public static ResourceLocation modItemLocation(String path) {
        return new ResourceLocation(AmbienceExpansion.MOD_ID, ModelProvider.ITEM_FOLDER + "/" + path);
    }

    public static ResourceLocation vanillaBlockLocation(String path) {
        return new ResourceLocation("minecraft", ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    public static ResourceLocation vanillaItemLocation(String path) {
        return new ResourceLocation("minecraft", ModelProvider.ITEM_FOLDER + "/" + path);
    }

    //Textures
}
