package net.chaotic.epicbattlefantasymod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LoveBlade3 extends SwordItem {
    public LoveBlade3(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 3));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 3));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 200, 1));
        return false;
    }
}
