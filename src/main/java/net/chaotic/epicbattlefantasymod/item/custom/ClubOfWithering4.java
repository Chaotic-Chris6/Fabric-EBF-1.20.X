package net.chaotic.epicbattlefantasymod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ClubOfWithering4 extends SwordItem {
    public ClubOfWithering4(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200, 1));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 2));
        return false;
    }
}
