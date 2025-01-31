package net.chaotic.epicbattlefantasymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.chaotic.epicbattlefantasymod.entity.ModEntities;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class EpicBattleFantasyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.SHURIKEN_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.HAND_BOMB_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
