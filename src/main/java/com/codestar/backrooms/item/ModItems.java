package com.codestar.backrooms.item;

import com.codestar.backrooms.BackroomsMod;
import com.codestar.backrooms.item.custom.AlmondWaterItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BackroomsMod.MODID);

    public static final DeferredItem<Item> ALMOND_WATER = ITEMS.register("almondwater",
            () -> new AlmondWaterItem(new Item.Properties().food(ModFoodProperties.ALMOND_WATER)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

// public static final Item ALMOND_WATER = (
//        "honey_bottle", new HoneyBottleItem(new Item.Properties().craftRemainder(GLASS_BOTTLE).food(Foods.HONEY_BOTTLE).stacksTo(16))
//    );
