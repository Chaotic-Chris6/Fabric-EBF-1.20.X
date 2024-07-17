package net.chaotic.epicbattlefantasymod.item.custom;

import net.chaotic.epicbattlefantasymod.entity.custom.ShurikenProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class Shuriken extends Item {
    public Shuriken(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.NEUTRAL, 0.2f, 1.6f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (!world.isClient) {
            ShurikenProjectileEntity shurikenProjectileEntity = new ShurikenProjectileEntity(user, world);
            shurikenProjectileEntity.setItem(itemStack);
            shurikenProjectileEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.5f, 2.5f, 1.0f);
            world.spawnEntity(shurikenProjectileEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}