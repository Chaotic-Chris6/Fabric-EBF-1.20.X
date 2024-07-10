package net.chaotic.epicbattlefantasymod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
    public static final FoodComponent CUPCAKE = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(0.5f).build();
    public static final FoodComponent BEER = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1),1f).build();
    public static final FoodComponent COLA = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 1),1f).build();
    public static final FoodComponent IRON_BREW = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1),1f).build();
    public static final FoodComponent ENERGY_DRINK = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1),1f).build();
    public static final FoodComponent CHILI_PEPPER = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 4),1f).build();
    public static final FoodComponent ORANGE_JUICE = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 4),1f).build();
    public static final FoodComponent CRISPS = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1.0f).build();
    public static final FoodComponent CHIPS = new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).snack().build();
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().hunger(20).saturationModifier(20.0f).build();
    public static final FoodComponent PIZZA = new FoodComponent.Builder().hunger(20).saturationModifier(20.0f).snack().build();
}
