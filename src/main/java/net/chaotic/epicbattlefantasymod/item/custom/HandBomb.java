package net.chaotic.epicbattlefantasymod.item.custom;

import net.chaotic.epicbattlefantasymod.entity.custom.HandBombProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class HandBomb extends Item {
    public HandBomb(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.2f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (!world.isClient) {
            HandBombProjectileEntity handBombProjectileEntity = new HandBombProjectileEntity(user, world);
            handBombProjectileEntity.setItem(itemStack);
            handBombProjectileEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 0.8f, 1.0f);
            world.spawnEntity(handBombProjectileEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}