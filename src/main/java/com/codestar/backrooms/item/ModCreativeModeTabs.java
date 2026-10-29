package com.codestar.backrooms.item;

import com.codestar.backrooms.BackroomsMod;
import com.codestar.backrooms.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomsMod.MODID);

    public static final Supplier<CreativeModeTab> BACKROOMS_COMMON_ITEMS = CREATIVE_MODE_TAB.register("backrooms_common_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALMOND_WATER.get()))
                    .title(Component.translatable("creativetab.backroomsmod.backrooms_common_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALMOND_WATER);
                    })
                    .build());

public static final Supplier<CreativeModeTab> LEVEL_0_BLOCKS = CREATIVE_MODE_TAB.register("level_0_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LEVEL_0_WALLPAPER))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BackroomsMod.MODID, "backrooms_common_items_tab"))
                    .title(Component.translatable("creativetab.backroomsmod.level_0_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.LEVEL_0_CARPET);
                        output.accept(ModBlocks.LEVEL_0_WALLPAPER);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
