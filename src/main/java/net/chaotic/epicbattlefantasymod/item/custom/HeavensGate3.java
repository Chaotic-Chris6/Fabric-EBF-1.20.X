package net.chaotic.epicbattlefantasymod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HeavensGate3 extends SwordItem {
    public HeavensGate3(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        target.clearStatusEffects();
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 50, 0));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1));
        return false;
    }
}