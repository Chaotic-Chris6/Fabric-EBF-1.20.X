package net.chaotic.epicbattlefantasymod.item;

import net.chaotic.epicbattlefantasymod.EpicBattleFantasyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPRING = registerItem("spring", new Item(new Item.Settings()));
    public static final Item EARTH_BALL = registerItem("earth_ball", new Item(new Item.Settings()));
    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings()));
    public static final Item AN_HERB = registerItem("an_herb", new Item(new Item.Settings()));
    public static final Item BELT_BUCKLE = registerItem("belt_buckle", new Item(new Item.Settings()));
    public static final Item BIO_VIRUS = registerItem("bio_virus", new Item(new Item.Settings()));
    public static final Item BONE_SPIKE = registerItem("bone_spike", new Item(new Item.Settings()));
    public static final Item BUTTERFLY_WING = registerItem("butterfly_wing", new Item(new Item.Settings()));
    public static final Item COPPER_PIPE = registerItem("copper_pipe", new Item(new Item.Settings()));
    public static final Item DARK_MATTER = registerItem("dark_matter", new Item(new Item.Settings()));
    public static final Item DARK_RUNE = registerItem("dark_rune", new Item(new Item.Settings()));
    public static final Item DRAGON_SCALES = registerItem("dragon_scales", new Item(new Item.Settings()));
    public static final Item FINE_FUR = registerItem("fine_fur", new Item(new Item.Settings()));
    public static final Item FLOPPY = registerItem("floppy", new Item(new Item.Settings()));
    public static final Item GAME_CHILD  = registerItem("game_child", new Item(new Item.Settings()));
    public static final Item GASH_ROOT  = registerItem("gash_root", new Item(new Item.Settings()));
    public static final Item GEODE  = registerItem("geode", new Item(new Item.Settings()));
    public static final Item GLASS_SHARDS  = registerItem("glass_shards", new Item(new Item.Settings()));
    public static final Item GOLD_PLATE  = registerItem("gold_plate", new Item(new Item.Settings()));
    public static final Item HAND_BOMB  = registerItem("hand_bomb", new Item(new Item.Settings()));
    public static final Item IRON_PLATE  = registerItem("iron_plate", new Item(new Item.Settings()));
    public static final Item JUNGLE_FLOWER  = registerItem("jungle_flower", new Item(new Item.Settings()));
    public static final Item LECKO_BRICK  = registerItem("lecko_brick", new Item(new Item.Settings()));
    public static final Item LIQUID_ICE  = registerItem("liquid_ice", new Item(new Item.Settings()));
    public static final Item MAGMA_CHUNK  = registerItem("magma_chunk", new Item(new Item.Settings()));
    public static final Item METAL_GEAR  = registerItem("metal_gear", new Item(new Item.Settings()));
    public static final Item MOON_PEARL  = registerItem("moon_pearl", new Item(new Item.Settings()));
    public static final Item MYTHRIL_SHARDS  = registerItem("mythril_shards", new Item(new Item.Settings()));
    public static final Item NANO_FIBRE  = registerItem("nano_fibre", new Item(new Item.Settings()));
    public static final Item OPAL  = registerItem("opal", new Item(new Item.Settings()));
    public static final Item P2_PROCESSOR  = registerItem("p2_processor", new Item(new Item.Settings()));
    public static final Item PLASTIC  = registerItem("plastic", new Item(new Item.Settings()));
    public static final Item PLUTONIUM_CORE  = registerItem("plutonium_core", new Item(new Item.Settings()));
    public static final Item RAINBOW_ORE  = registerItem("rainbow_ore", new Item(new Item.Settings()));
    public static final Item RAZOR_CLAW  = registerItem("razor_claw", new Item(new Item.Settings()));
    public static final Item RUBY  = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item SACRED_RUNE  = registerItem("sacred_rune", new Item(new Item.Settings()));
    public static final Item SAPPHIRE  = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item SATIN  = registerItem("satin", new Item(new Item.Settings()));
    public static final Item SEA_SHELL  = registerItem("sea_shell", new Item(new Item.Settings()));
    public static final Item SHURIKEN  = registerItem("shuriken", new Item(new Item.Settings()));
    public static final Item SILK  = registerItem("silk", new Item(new Item.Settings()));
    public static final Item SILVER_PLATE  = registerItem("silver_plate", new Item(new Item.Settings()));
    public static final Item SOFT_WOOD  = registerItem("soft_wood", new Item(new Item.Settings()));
    public static final Item SOLID_WATER  = registerItem("solid_water", new Item(new Item.Settings()));
    public static final Item STAR_FRAGMENT  = registerItem("star_fragment", new Item(new Item.Settings()));
    public static final Item STEEL_PLATE  = registerItem("steel_plate", new Item(new Item.Settings()));
    public static final Item SUPER_TAPE  = registerItem("super_tape", new Item(new Item.Settings()));
    public static final Item THE_HOLY_GRAIL  = registerItem("the_holy_grail", new Item(new Item.Settings()));
    public static final Item TITANIUM  = registerItem("titanium", new Item(new Item.Settings()));
    public static final Item TOPAZ  = registerItem("topaz", new Item(new Item.Settings()));
    public static final Item HEAVENS_GATE = registerItem("heavens_gate", new SwordItem(SteelToolMaterial.STEEL_PLATE, 3, -3.3f, new Item.Settings()));
    public static final Item BERSERKER = registerItem("berserker", new SwordItem(BrickToolMaterial.BRICK, 6, -3.4f, new Item.Settings()));
    public static final Item INFERNO = registerItem("inferno", new Inferno(FireToolMaterial.FIRE, 5, -3f, new Item.Settings()));
    public static final Item ICE_NEEDLE = registerItem("ice_needle", new IceNeedle(IceToolMaterial.ICE, 2, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD = registerItem("lightning_shard", new SwordItem(TopazToolMaterial.TOPAZ, 1, -2.0f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT = registerItem("sapphire_saint", new SwordItem(SapphireToolMaterial.SAPPHIRE, 4, -2.9f, new Item.Settings()));
    public static final Item BLACK_FANG = registerItem("black_fang", new BlackFang(OpalToolMaterial.OPAL, 0, -3.0f, new Item.Settings()));
    public static final Item THE_CHOPPER = registerItem("the_chopper", new AxeItem(WoodToolMaterial.SOFT_WOOD, 0, -3.0f, new Item.Settings()));
    public static final Item GIANT_SLAYER = registerItem("giant_slayer", new SwordItem(SteelToolMaterial.STEEL_PLATE, 11, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL = registerItem("hyper_drill", new PickaxeItem(DrillToolMaterial.STEEL_PLATE, 2, -3.0f, new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(SPRING);
        entries.add(EARTH_BALL);
        entries.add(AMBER);
        entries.add(AN_HERB);
        entries.add(BELT_BUCKLE);
        entries.add(BIO_VIRUS);
        entries.add(BONE_SPIKE);
        entries.add(BUTTERFLY_WING);
        entries.add(COPPER_PIPE);
        entries.add(DARK_MATTER);
        entries.add(DARK_RUNE);
        entries.add(DRAGON_SCALES);
        entries.add(FINE_FUR);
        entries.add(FLOPPY);
        entries.add(GAME_CHILD);
        entries.add(GASH_ROOT);
        entries.add(GEODE);
        entries.add(GLASS_SHARDS);
        entries.add(GOLD_PLATE);
        entries.add(HAND_BOMB);
        entries.add(IRON_PLATE);
        entries.add(JUNGLE_FLOWER);
        entries.add(LECKO_BRICK);
        entries.add(LIQUID_ICE);
        entries.add(MAGMA_CHUNK);
        entries.add(METAL_GEAR);
        entries.add(MOON_PEARL);
        entries.add(MYTHRIL_SHARDS);
        entries.add(NANO_FIBRE);
        entries.add(OPAL);
        entries.add(P2_PROCESSOR);
        entries.add(PLASTIC);
        entries.add(PLUTONIUM_CORE);
        entries.add(RAINBOW_ORE);
        entries.add(RAZOR_CLAW);
        entries.add(RUBY);
        entries.add(SACRED_RUNE);
        entries.add(SAPPHIRE);
        entries.add(SATIN);
        entries.add(SEA_SHELL);
        entries.add(SHURIKEN);
        entries.add(SILK);
        entries.add(SILVER_PLATE);
        entries.add(SOFT_WOOD);
        entries.add(SOLID_WATER);
        entries.add(STAR_FRAGMENT);
        entries.add(STEEL_PLATE);
        entries.add(SUPER_TAPE);
        entries.add(THE_HOLY_GRAIL);
        entries.add(TITANIUM);
        entries.add(TOPAZ);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(HEAVENS_GATE);
        entries.add(BERSERKER);
        entries.add(INFERNO);
        entries.add(ICE_NEEDLE);
        entries.add(LIGHTNING_SHARD);
        entries.add(SAPPHIRE_SAINT);
        entries.add(BLACK_FANG);
        entries.add(THE_CHOPPER);
        entries.add(GIANT_SLAYER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EpicBattleFantasyMod.MOD_ID, name), item);
    }

    public static  void registerModItems(){
        EpicBattleFantasyMod.LOGGER.info("Registering Mod Items for " + EpicBattleFantasyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
