package net.chaotic.epicbattlefantasymod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ClubOfWithering extends SwordItem {
    public ClubOfWithering(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20, 1));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20, 0));
        return false;
    }
}
