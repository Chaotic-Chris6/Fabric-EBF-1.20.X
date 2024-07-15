package net.chaotic.epicbattlefantasymod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class TheChopper4 extends AxeItem {
    public TheChopper4(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 2));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 1));
        target.isWet();
        return true;
    }
}
