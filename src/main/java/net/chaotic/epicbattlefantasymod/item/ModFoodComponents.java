package net.chaotic.epicbattlefantasymod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build();
    public static final FoodComponent DRAGON_FRUIT = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent RASPBERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().build();
    public static final FoodComponent CLOUDBERRIES = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).snack().build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent PRETZEL = new FoodComponent.Builder().alwaysEdible().snack().build();
    public static final FoodComponent CUPCAKE = new FoodComponent.Builder().alwaysEdible().hunger(0).saturationModifier(0.5f).build();
}
