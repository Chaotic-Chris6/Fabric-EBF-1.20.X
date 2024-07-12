package net.chaotic.epicbattlefantasymod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.chaotic.epicbattlefantasymod.EpicBattleFantasyMod;
import net.chaotic.epicbattlefantasymod.entity.custom.ShurikenProjectileEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<ShurikenProjectileEntity> SHURIKEN_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(EpicBattleFantasyMod.MOD_ID, "shuriken_projectile"),
            FabricEntityTypeBuilder.<ShurikenProjectileEntity>create(SpawnGroup.MISC, ShurikenProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

}