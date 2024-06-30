package net.chaotic.epicbattlefantasymod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HeavensGate extends SwordItem {
    public HeavensGate(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, 1, 1, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0));
        return true;
    }
}
