package com.codestar.backrooms.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties ALMOND_WATER = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.3f)
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 800), 1).build();

}
