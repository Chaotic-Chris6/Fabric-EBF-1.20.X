package net.chaotic.epicbattlefantasymod;

import net.chaotic.epicbattlefantasymod.item.ModItemGroups;
import net.chaotic.epicbattlefantasymod.item.ModItems;
import net.chaotic.epicbattlefantasymod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicBattleFantasyMod implements ModInitializer {
	public static final String MOD_ID = "epicbattlefantasymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		FuelRegistry.INSTANCE.add(ModItems.SOFT_WOOD, 200);
		FuelRegistry.INSTANCE.add(ModItems.GASH_ROOT, 250);
		FuelRegistry.INSTANCE.add(ModItems.PLUTONIUM_CORE, 25600);
		ModLootTableModifiers.modifyLootTables();
	}
}