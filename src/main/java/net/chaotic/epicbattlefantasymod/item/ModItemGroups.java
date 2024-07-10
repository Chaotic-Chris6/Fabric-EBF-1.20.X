package net.chaotic.epicbattlefantasymod.item;

import net.chaotic.epicbattlefantasymod.EpicBattleFantasyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EBF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EpicBattleFantasyMod.MOD_ID, "ebf"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ebf"))
                    .icon(() -> new ItemStack(ModItems.HEAVENS_GATE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EARTH_BALL);
                        entries.add(ModItems.SEA_SHELL);
                        entries.add(ModItems.IRON_PLATE);
                        entries.add(ModItems.SHURIKEN);
                        entries.add(ModItems.JUNGLE_FLOWER);
                        entries.add(ModItems.SPRING);
                        entries.add(ModItems.SOFT_WOOD);
                        entries.add(ModItems.HAND_BOMB);
                        entries.add(ModItems.AN_HERB);
                        entries.add(ModItems.COPPER_PIPE);
                        entries.add(ModItems.SUPER_TAPE);
                        entries.add(ModItems.GEODE);
                        entries.add(ModItems.GASH_ROOT);
                        entries.add(ModItems.GLASS_SHARDS);
                        entries.add(ModItems.FINE_FUR);
                        entries.add(ModItems.BUTTERFLY_WING);
                        entries.add(ModItems.RAINBOW_ORE);
                        entries.add(ModItems.LIQUID_ICE);
                        entries.add(ModItems.SOLID_WATER);
                        entries.add(ModItems.BELT_BUCKLE);
                        entries.add(ModItems.STEEL_PLATE);
                        entries.add(ModItems.MAGMA_CHUNK);
                        entries.add(ModItems.FLOPPY);
                        entries.add(ModItems.SILK);
                        entries.add(ModItems.METAL_GEAR);
                        entries.add(ModItems.PLASTIC);
                        entries.add(ModItems.AMBER);
                        entries.add(ModItems.BIO_VIRUS);
                        entries.add(ModItems.RAZOR_CLAW);
                        entries.add(ModItems.SACRED_RUNE);
                        entries.add(ModItems.BONE_SPIKE);
                        entries.add(ModItems.SILVER_PLATE);
                        entries.add(ModItems.SATIN);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.GOLD_PLATE);
                        entries.add(ModItems.DARK_RUNE);
                        entries.add(ModItems.P2_PROCESSOR);
                        entries.add(ModItems.NANO_FIBRE);
                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.LECKO_BRICK);
                        entries.add(ModItems.MOON_PEARL);
                        entries.add(ModItems.DRAGON_SCALES);
                        entries.add(ModItems.GAME_CHILD);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.DARK_MATTER);
                        entries.add(ModItems.PLUTONIUM_CORE);
                        entries.add(ModItems.THE_HOLY_GRAIL);
                        entries.add(ModItems.MYTHRIL_SHARDS);
                        entries.add(ModItems.STAR_FRAGMENT);

                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.DRAGON_FRUIT);

                        entries.add(ModItems.HEAVENS_GATE);
                        entries.add(ModItems.BERSERKER);
                        entries.add(ModItems.INFERNO);
                        entries.add(ModItems.ICE_NEEDLE);
                        entries.add(ModItems.LIGHTNING_SHARD);
                        entries.add(ModItems.SAPPHIRE_SAINT);
                        entries.add(ModItems.BLACK_FANG);
                        entries.add(ModItems.THE_CHOPPER);
                        entries.add(ModItems.GIANT_SLAYER);
                        entries.add(ModItems.HYPER_DRILL);
                        entries.add(ModItems.EMERALD_SMASHER);
                        entries.add(ModItems.DEVILS_FORK);
                        entries.add(ModItems.ULTRA_PRO);
                        entries.add(ModItems.CLUB_OF_WITHERING);
                        entries.add(ModItems.CRIMSON_RAZORBACK);
                        entries.add(ModItems.DRAGONS_FEATHER);
                        entries.add(ModItems.GOLDEN_AXE);
                        entries.add(ModItems.DARK_STALKER);
                        entries.add(ModItems.FUSION_BLADE);
                        entries.add(ModItems.SOUL_EATER);
                        entries.add(ModItems.LOVE_BLADE);
                    }).build());

    public static void registerItemGroups(){
        EpicBattleFantasyMod.LOGGER.info("Registering Item Groups for "+ EpicBattleFantasyMod.MOD_ID);
    }
}
