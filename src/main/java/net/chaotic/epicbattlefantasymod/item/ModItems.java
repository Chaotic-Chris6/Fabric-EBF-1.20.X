package net.chaotic.epicbattlefantasymod.item;

import net.chaotic.epicbattlefantasymod.EpicBattleFantasyMod;
import net.chaotic.epicbattlefantasymod.item.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Materials

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
    public static final Item HAND_BOMB  = registerItem("hand_bomb", new HandBomb(new Item.Settings()));
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
    public static final Item SHURIKEN  = registerItem("shuriken", new Shuriken(new Item.Settings()));
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

    //Food

    public static final Item PINEAPPLE  = registerItem("pineapple", new Item(new Item.Settings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item DRAGON_FRUIT  = registerItem("dragon_fruit", new Item(new Item.Settings().food(ModFoodComponents.DRAGON_FRUIT)));
    public static final Item RASPBERRIES  = registerItem("raspberries", new Item(new Item.Settings().food(ModFoodComponents.RASPBERRIES)));
    public static final Item BLUEBERRIES  = registerItem("blueberries", new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRIES)));
    public static final Item CLOUDBERRIES  = registerItem("cloudberries", new Item(new Item.Settings().food(ModFoodComponents.CLOUDBERRIES)));
    public static final Item GARLIC  = registerItem("garlic", new Garlic(new Item.Settings().food(ModFoodComponents.GARLIC)));
    public static final Item BANANA  = registerItem("banana", new Banana(new Item.Settings().food(ModFoodComponents.BANANA)));
    public static final Item PRETZEL  = registerItem("pretzel", new Pretzel(new Item.Settings().food(ModFoodComponents.PRETZEL)));
    public static final Item CUPCAKE  = registerItem("cupcake", new Item(new Item.Settings().food(ModFoodComponents.CUPCAKE)));
    public static final Item BEER  = registerItem("beer", new Item(new Item.Settings().food(ModFoodComponents.BEER)));
    public static final Item COLA  = registerItem("cola", new Item(new Item.Settings().food(ModFoodComponents.COLA)));
    public static final Item IRON_BREW  = registerItem("iron_brew", new Item(new Item.Settings().food(ModFoodComponents.IRON_BREW)));
    public static final Item ENERGY_DRINK  = registerItem("energy_drink", new Item(new Item.Settings().food(ModFoodComponents.ENERGY_DRINK)));
    public static final Item COFFEE = registerItem("coffee", new Item(new Item.Settings()));
    public static final Item ESPRESSO = registerItem("espresso", new Item(new Item.Settings()));
    public static final Item CHILI_PEPPER  = registerItem("chili_pepper", new Item(new Item.Settings().food(ModFoodComponents.CHILI_PEPPER)));
    public static final Item ORANGE_JUICE  = registerItem("orange_juice", new Item(new Item.Settings().food(ModFoodComponents.ORANGE_JUICE)));
    public static final Item CRISPS  = registerItem("crisps", new Item(new Item.Settings().food(ModFoodComponents.CRISPS)));
    public static final Item CHIPS  = registerItem("chips", new Item(new Item.Settings().food(ModFoodComponents.CHIPS)));
    public static final Item HAMBURGER  = registerItem("hamburger", new Item(new Item.Settings().food(ModFoodComponents.HAMBURGER)));
    public static final Item PIZZA  = registerItem("pizza", new Item(new Item.Settings().food(ModFoodComponents.PIZZA)));

    //Swords

    public static final Item HEAVENS_GATE = registerItem("heavens_gate", new HeavensGate(SteelToolMaterial.STEEL_PLATE, 3, -3.23f, new Item.Settings()));
    public static final Item BERZERKER = registerItem("berzerker", new Berzerker(BrickToolMaterial.BRICK, 6, -3.4f, new Item.Settings()));
    public static final Item INFERNO = registerItem("inferno", new Inferno(FireToolMaterial.FIRE, 5, -3f, new Item.Settings()));
    public static final Item ICE_NEEDLE = registerItem("ice_needle", new IceNeedle(IceToolMaterial.ICE, 2, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD = registerItem("lightning_shard", new SwordItem(TopazToolMaterial.TOPAZ, 2, -0.5f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT = registerItem("sapphire_saint", new SapphireSaint(SapphireToolMaterial.SAPPHIRE, 3, -3.0f, new Item.Settings()));
    public static final Item BLACK_FANG = registerItem("black_fang", new BlackFang(OpalToolMaterial.OPAL, 0, -3.0f, new Item.Settings()));
    public static final Item THE_CHOPPER = registerItem("the_chopper", new TheChopper(WoodToolMaterial.STEEL_PLATE, 1, -3.5f, new Item.Settings()));
    public static final Item GIANT_SLAYER = registerItem("giant_slayer", new GiantSlayer(SteelToolMaterial.IRON_PLATE, 11, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL = registerItem("hyper_drill", new PickaxeItem(DrillToolMaterial.STEEL_PLATE, 2, -3.0f, new Item.Settings()));
    public static final Item EMERALD_SMASHER = registerItem("emerald_smasher", new EmeraldSmasher(EmeraldToolMaterial.EMERALD, 4, -3.2f, new Item.Settings()));
    public static final Item DEVILS_FORK = registerItem("devils_fork", new DevilsFork(FireToolMaterial.IRON_PLATE, 3, -3.2f, new Item.Settings()));
    public static final Item ULTRA_PRO = registerItem("ultra_pro", new SwordItem(WoodToolMaterial.SOFT_WOOD, 0, 0.0f, new Item.Settings()));
    public static final Item CLUB_OF_WITHERING = registerItem("club_of_withering", new ClubOfWithering(BoneToolMaterial.BONE, 0, -3.0f, new Item.Settings()));
    public static final Item CRIMSON_RAZORBACK = registerItem("crimson_razorback", new SwordItem(GuitarToolMaterial.GAME_CHILD, 0, -3.0f, new Item.Settings()));
    public static final Item DRAGONS_FEATHER = registerItem("dragons_feather", new DragonsFeather(FeatherToolMaterial.FEATHER, 3, -1.5f, new Item.Settings()));
    public static final Item GOLDEN_AXE = registerItem("golden_axe", new GoldenAxe(GoldPlateToolMaterial.GOLD_PLATE, 4, -2.0f, new Item.Settings()));
    public static final Item DARK_STALKER = registerItem("dark_stalker", new DarkStalker(RazorClawToolMaterial.RAZOR_CLAW, 1, -2.9f, new Item.Settings()));
    public static final Item FUSION_BLADE = registerItem("fusion_blade", new SwordItem(FusionToolMaterial.METAL_GEAR, 2, -2.5f, new Item.Settings()));
    public static final Item SOUL_EATER = registerItem("soul_eater", new SoulEater(RazorClawToolMaterial.IRON_PLATE, 1, -3.34f, new Item.Settings()));
    public static final Item LOVE_BLADE = registerItem("love_blade", new LoveBlade(JungleFlowerToolMaterial.JUNGLE_FLOWER, 0, -3.0f, new Item.Settings()));

    //Swords 2

    public static final Item HEAVENS_GATE2 = registerItem("heavens_gate2", new HeavensGate2(SteelToolMaterial.STEEL_PLATE, 4, -3.23f, new Item.Settings()));
    public static final Item BERZERKER2 = registerItem("berzerker2", new Berzerker(BrickToolMaterial.BRICK, 7, -3.4f, new Item.Settings()));
    public static final Item INFERNO2 = registerItem("inferno2", new Inferno(FireToolMaterial.FIRE, 6, -3f, new Item.Settings()));
    public static final Item ICE_NEEDLE2 = registerItem("ice_needle2", new IceNeedle(IceToolMaterial.ICE, 3, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD2 = registerItem("lightning_shard2", new SwordItem(TopazToolMaterial.TOPAZ, 3, 0.0f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT2 = registerItem("sapphire_saint2", new SapphireSaint2(SapphireToolMaterial.SAPPHIRE, 4, -3.0f, new Item.Settings()));
    public static final Item BLACK_FANG2 = registerItem("black_fang2", new BlackFang(OpalToolMaterial.OPAL, 1, -2.5f, new Item.Settings()));
    public static final Item THE_CHOPPER2 = registerItem("the_chopper2", new TheChopper2(WoodToolMaterial.STEEL_PLATE, 2, -3.5f, new Item.Settings()));
    public static final Item GIANT_SLAYER2 = registerItem("giant_slayer2", new GiantSlayer(SteelToolMaterial.IRON_PLATE, 13, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL2 = registerItem("hyper_drill2", new PickaxeItem(DrillToolMaterial.STEEL_PLATE, 3, -3.0f, new Item.Settings()));
    public static final Item EMERALD_SMASHER2 = registerItem("emerald_smasher2", new EmeraldSmasher(EmeraldToolMaterial.EMERALD, 5, -3.2f, new Item.Settings()));
    public static final Item DEVILS_FORK2 = registerItem("devils_fork2", new DevilsFork(FireToolMaterial.IRON_PLATE, 3, -3.2f, new Item.Settings()));
    public static final Item ULTRA_PRO2 = registerItem("ultra_pro2", new UltraPro2(WoodToolMaterial.SOFT_WOOD, 1, 0.5f, new Item.Settings()));
    public static final Item CLUB_OF_WITHERING2 = registerItem("club_of_withering2", new ClubOfWithering2(BoneToolMaterial.BONE, 1, -3.0f, new Item.Settings()));
    public static final Item CRIMSON_RAZORBACK2 = registerItem("crimson_razorback2", new SwordItem(GuitarToolMaterial.GAME_CHILD, 0, -3.0f, new Item.Settings()));
    public static final Item DRAGONS_FEATHER2 = registerItem("dragons_feather2", new DragonsFeather2(FeatherToolMaterial.FEATHER, 4, -1.0f, new Item.Settings()));
    public static final Item GOLDEN_AXE2 = registerItem("golden_axe2", new GoldenAxe(GoldPlateToolMaterial.GOLD_PLATE, 5, -2.0f, new Item.Settings()));
    public static final Item DARK_STALKER2 = registerItem("dark_stalker2", new DarkStalker(RazorClawToolMaterial.RAZOR_CLAW, 2, -2.9f, new Item.Settings()));
    public static final Item FUSION_BLADE2 = registerItem("fusion_blade2", new FusionBlade2(FusionToolMaterial.METAL_GEAR, 3, -2.5f, new Item.Settings()));
    public static final Item SOUL_EATER2 = registerItem("soul_eater2", new SoulEater(RazorClawToolMaterial.IRON_PLATE, 3, -3.34f, new Item.Settings()));
    public static final Item LOVE_BLADE2 = registerItem("love_blade2", new LoveBlade2(JungleFlowerToolMaterial.JUNGLE_FLOWER, 0, -3.0f, new Item.Settings()));

    //Swords 3

    public static final Item HEAVENS_GATE3 = registerItem("heavens_gate3", new HeavensGate2(SteelToolMaterial.STEEL_PLATE, 5, -3.23f, new Item.Settings()));
    public static final Item BERZERKER3 = registerItem("berzerker3", new Berzerker3(BrickToolMaterial.BRICK, 8, -3.4f, new Item.Settings()));
    public static final Item INFERNO3 = registerItem("inferno3", new Inferno3(FireToolMaterial.FIRE, 7, -2.5f, new Item.Settings()));
    public static final Item ICE_NEEDLE3 = registerItem("ice_needle3", new IceNeedle(IceToolMaterial.ICE, 4, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD3 = registerItem("lightning_shard3", new SwordItem(TopazToolMaterial.TOPAZ, 4, 0.5f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT3 = registerItem("sapphire_saint3", new SapphireSaint3(SapphireToolMaterial.SAPPHIRE, 5, -2.5f, new Item.Settings()));
    public static final Item BLACK_FANG3 = registerItem("black_fang3", new BlackFang(OpalToolMaterial.OPAL, 2, -2.0f, new Item.Settings()));
    public static final Item THE_CHOPPER3 = registerItem("the_chopper3", new TheChopper3(WoodToolMaterial.STEEL_PLATE, 3, -3.5f, new Item.Settings()));
    public static final Item GIANT_SLAYER3 = registerItem("giant_slayer3", new GiantSlayer(SteelToolMaterial.IRON_PLATE, 15, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL3 = registerItem("hyper_drill3", new PickaxeItem(DrillToolMaterial.STEEL_PLATE, 4, -3.0f, new Item.Settings()));
    public static final Item EMERALD_SMASHER3 = registerItem("emerald_smasher3", new EmeraldSmasher(EmeraldToolMaterial.EMERALD, 6, -3.2f, new Item.Settings()));
    public static final Item DEVILS_FORK3 = registerItem("devils_fork3", new DevilsFork(FireToolMaterial.IRON_PLATE, 4, -3.2f, new Item.Settings()));
    public static final Item ULTRA_PRO3 = registerItem("ultra_pro3", new UltraPro3(WoodToolMaterial.SOFT_WOOD, 2, 1.0f, new Item.Settings()));
    public static final Item CLUB_OF_WITHERING3 = registerItem("club_of_withering3", new ClubOfWithering2(BoneToolMaterial.BONE, 2, -3.0f, new Item.Settings()));
    public static final Item CRIMSON_RAZORBACK3 = registerItem("crimson_razorback3", new SwordItem(GuitarToolMaterial.GAME_CHILD, 1, -3.0f, new Item.Settings()));
    public static final Item DRAGONS_FEATHER3 = registerItem("dragons_feather3", new DragonsFeather3(FeatherToolMaterial.FEATHER, 5, -0.5f, new Item.Settings()));
    public static final Item GOLDEN_AXE3 = registerItem("golden_axe3", new GoldenAxe3(GoldPlateToolMaterial.GOLD_PLATE, 6, -2.0f, new Item.Settings()));
    public static final Item DARK_STALKER3 = registerItem("dark_stalker3", new DarkStalker(RazorClawToolMaterial.RAZOR_CLAW, 3, -2.9f, new Item.Settings()));
    public static final Item FUSION_BLADE3 = registerItem("fusion_blade3", new FusionBlade2(FusionToolMaterial.METAL_GEAR, 4, -2.5f, new Item.Settings()));
    public static final Item SOUL_EATER3 = registerItem("soul_eater3", new SoulEater(RazorClawToolMaterial.IRON_PLATE, 5, -3.34f, new Item.Settings()));
    public static final Item LOVE_BLADE3 = registerItem("love_blade3", new LoveBlade3(JungleFlowerToolMaterial.JUNGLE_FLOWER, 0, -3.0f, new Item.Settings()));

    //Swords 4

    public static final Item HEAVENS_GATE4 = registerItem("heavens_gate4", new HeavensGate3(SteelToolMaterial.STEEL_PLATE, 6, -3.23f, new Item.Settings()));
    public static final Item BERZERKER4 = registerItem("berzerker4", new Berzerker4(BrickToolMaterial.BRICK, 10, -3.4f, new Item.Settings()));
    public static final Item INFERNO4 = registerItem("inferno4", new Inferno4(FireToolMaterial.FIRE, 1, -2.0f, new Item.Settings()));
    public static final Item ICE_NEEDLE4 = registerItem("ice_needle4", new IceNeedle(IceToolMaterial.ICE, 6, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD4 = registerItem("lightning_shard4", new SwordItem(TopazToolMaterial.TOPAZ, 5, 1.0f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT4 = registerItem("sapphire_saint4", new SapphireSaint4(SapphireToolMaterial.SAPPHIRE, 7, -2.5f, new Item.Settings()));
    public static final Item BLACK_FANG4 = registerItem("black_fang4", new BlackFang(OpalToolMaterial.OPAL, 3, -1.5f, new Item.Settings()));
    public static final Item THE_CHOPPER4 = registerItem("the_chopper4", new TheChopper4(WoodToolMaterial.STEEL_PLATE, 4, -3.5f, new Item.Settings()));
    public static final Item GIANT_SLAYER4 = registerItem("giant_slayer4", new GiantSlayer(SteelToolMaterial.IRON_PLATE, 17, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL4 = registerItem("hyper_drill4", new HyperDrill4(DrillToolMaterial.STEEL_PLATE, 6, -3.0f, new Item.Settings()));
    public static final Item EMERALD_SMASHER4 = registerItem("emerald_smasher4", new EmeraldSmasher(EmeraldToolMaterial.EMERALD, 8, -3.2f, new Item.Settings()));
    public static final Item DEVILS_FORK4 = registerItem("devils_fork4", new DevilsFork4(FireToolMaterial.IRON_PLATE, 5, -3.2f, new Item.Settings()));
    public static final Item ULTRA_PRO4 = registerItem("ultra_pro4", new UltraPro4(WoodToolMaterial.SOFT_WOOD, 3, 1.5f, new Item.Settings()));
    public static final Item CLUB_OF_WITHERING4 = registerItem("club_of_withering4", new ClubOfWithering4(BoneToolMaterial.BONE, 3, -3.0f, new Item.Settings()));
    public static final Item CRIMSON_RAZORBACK4 = registerItem("crimson_razorback4", new SwordItem(GuitarToolMaterial.GAME_CHILD, 2, -3.0f, new Item.Settings()));
    public static final Item DRAGONS_FEATHER4 = registerItem("dragons_feather4", new DragonsFeather4(FeatherToolMaterial.FEATHER, 7, 0.5f, new Item.Settings()));
    public static final Item GOLDEN_AXE4 = registerItem("golden_axe4", new GoldenAxe3(GoldPlateToolMaterial.GOLD_PLATE, 7, -2.0f, new Item.Settings()));
    public static final Item DARK_STALKER4 = registerItem("dark_stalker4", new DarkStalker(RazorClawToolMaterial.RAZOR_CLAW, 4, -2.9f, new Item.Settings()));
    public static final Item FUSION_BLADE4 = registerItem("fusion_blade4", new FusionBlade4(FusionToolMaterial.METAL_GEAR, 5, -2.5f, new Item.Settings()));
    public static final Item SOUL_EATER4 = registerItem("soul_eater4", new SoulEater(RazorClawToolMaterial.IRON_PLATE, 7, -3.34f, new Item.Settings()));
    public static final Item LOVE_BLADE4 = registerItem("love_blade4", new LoveBlade4(JungleFlowerToolMaterial.JUNGLE_FLOWER, 0, -3.0f, new Item.Settings()));

    //Swords 5

    public static final Item HEAVENS_GATE5 = registerItem("heavens_gate5", new HeavensGate3(SteelToolMaterial.STEEL_PLATE, 8, -3.23f, new Item.Settings()));
    public static final Item BERZERKER5 = registerItem("berzerker5", new Berzerker5(BrickToolMaterial.BRICK, 12, -3.4f, new Item.Settings()));
    public static final Item INFERNO5 = registerItem("inferno5", new Inferno5(FireToolMaterial.FIRE, 3, -1.5f, new Item.Settings()));
    public static final Item ICE_NEEDLE5 = registerItem("ice_needle5", new IceNeedle(IceToolMaterial.ICE, 8, -3.1f, new Item.Settings()));
    public static final Item LIGHTNING_SHARD5 = registerItem("lightning_shard5", new SwordItem(TopazToolMaterial.TOPAZ, 6, 1.5f, new Item.Settings()));
    public static final Item SAPPHIRE_SAINT5 = registerItem("sapphire_saint5", new SapphireSaint5(SapphireToolMaterial.SAPPHIRE, 8, -2.5f, new Item.Settings()));
    public static final Item BLACK_FANG5 = registerItem("black_fang5", new BlackFang(OpalToolMaterial.OPAL, 4, -1.0f, new Item.Settings()));
    public static final Item THE_CHOPPER5 = registerItem("the_chopper5", new TheChopper5(WoodToolMaterial.STEEL_PLATE, 5, -3.5f, new Item.Settings()));
    public static final Item GIANT_SLAYER5 = registerItem("giant_slayer5", new GiantSlayer(SteelToolMaterial.IRON_PLATE, 19, -3.6f, new Item.Settings()));
    public static final Item HYPER_DRILL5 = registerItem("hyper_drill5", new HyperDrill5(DrillToolMaterial.STEEL_PLATE, 7, -3.0f, new Item.Settings()));
    public static final Item EMERALD_SMASHER5 = registerItem("emerald_smasher5", new EmeraldSmasher(EmeraldToolMaterial.EMERALD, 9, -3.2f, new Item.Settings()));
    public static final Item DEVILS_FORK5 = registerItem("devils_fork5", new DevilsFork5(FireToolMaterial.IRON_PLATE, 6, -3.2f, new Item.Settings()));
    public static final Item ULTRA_PRO5 = registerItem("ultra_pro5", new UltraPro5(WoodToolMaterial.SOFT_WOOD, 4, 2.0f, new Item.Settings()));
    public static final Item CLUB_OF_WITHERING5 = registerItem("club_of_withering5", new ClubOfWithering4(BoneToolMaterial.BONE, 5, -3.0f, new Item.Settings()));
    public static final Item CRIMSON_RAZORBACK5 = registerItem("crimson_razorback5", new SwordItem(GuitarToolMaterial.GAME_CHILD, 3, -3.0f, new Item.Settings()));
    public static final Item DRAGONS_FEATHER5 = registerItem("dragons_feather5", new DragonsFeather5(FeatherToolMaterial.FEATHER, 8, 1.0f, new Item.Settings()));
    public static final Item GOLDEN_AXE5 = registerItem("golden_axe5", new GoldenAxe5(GoldPlateToolMaterial.GOLD_PLATE, 8, -2.0f, new Item.Settings()));
    public static final Item DARK_STALKER5 = registerItem("dark_stalker5", new DarkStalker(RazorClawToolMaterial.RAZOR_CLAW, 5, -2.9f, new Item.Settings()));
    public static final Item FUSION_BLADE5 = registerItem("fusion_blade5", new FusionBlade4(FusionToolMaterial.METAL_GEAR, 7, -2.5f, new Item.Settings()));
    public static final Item SOUL_EATER5 = registerItem("soul_eater5", new SoulEater(RazorClawToolMaterial.IRON_PLATE, 9, -3.34f, new Item.Settings()));
    public static final Item LOVE_BLADE5 = registerItem("love_blade5", new LoveBlade5(JungleFlowerToolMaterial.JUNGLE_FLOWER, 0, -3.0f, new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(EARTH_BALL);
        entries.add(SEA_SHELL);
        entries.add(IRON_PLATE);
        entries.add(SHURIKEN);
        entries.add(JUNGLE_FLOWER);
        entries.add(SPRING);
        entries.add(SOFT_WOOD);
        entries.add(HAND_BOMB);
        entries.add(AN_HERB);
        entries.add(COPPER_PIPE);
        entries.add(SUPER_TAPE);
        entries.add(GEODE);
        entries.add(GASH_ROOT);
        entries.add(GLASS_SHARDS);
        entries.add(FINE_FUR);
        entries.add(BUTTERFLY_WING);
        entries.add(RAINBOW_ORE);
        entries.add(LIQUID_ICE);
        entries.add(SOLID_WATER);
        entries.add(BELT_BUCKLE);
        entries.add(STEEL_PLATE);
        entries.add(MAGMA_CHUNK);
        entries.add(FLOPPY);
        entries.add(SILK);
        entries.add(METAL_GEAR);
        entries.add(PLASTIC);
        entries.add(AMBER);
        entries.add(BIO_VIRUS);
        entries.add(RAZOR_CLAW);
        entries.add(SACRED_RUNE);
        entries.add(BONE_SPIKE);
        entries.add(SILVER_PLATE);
        entries.add(SATIN);
        entries.add(RUBY);
        entries.add(TOPAZ);
        entries.add(SAPPHIRE);
        entries.add(GOLD_PLATE);
        entries.add(DARK_RUNE);
        entries.add(P2_PROCESSOR);
        entries.add(NANO_FIBRE);
        entries.add(OPAL);
        entries.add(LECKO_BRICK);
        entries.add(MOON_PEARL);
        entries.add(DRAGON_SCALES);
        entries.add(GAME_CHILD);
        entries.add(TITANIUM);
        entries.add(DARK_MATTER);
        entries.add(PLUTONIUM_CORE);
        entries.add(THE_HOLY_GRAIL);
        entries.add(MYTHRIL_SHARDS);
        entries.add(STAR_FRAGMENT);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(PINEAPPLE);
        entries.add(DRAGON_FRUIT);
        entries.add(RASPBERRIES);
        entries.add(BLUEBERRIES);
        entries.add(CLOUDBERRIES);
        entries.add(GARLIC);
        entries.add(BANANA);
        entries.add(PRETZEL);
        entries.add(CUPCAKE);
        entries.add(BEER);
        entries.add(COLA);
        entries.add(IRON_BREW);
        entries.add(ENERGY_DRINK);
        entries.add(COFFEE);
        entries.add(ESPRESSO);
        entries.add(CHILI_PEPPER);
        entries.add(ORANGE_JUICE);
        entries.add(CRISPS);
        entries.add(CHIPS);
        entries.add(HAMBURGER);
        entries.add(PIZZA);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(HEAVENS_GATE);
        entries.add(HEAVENS_GATE2);
        entries.add(HEAVENS_GATE3);
        entries.add(HEAVENS_GATE4);
        entries.add(HEAVENS_GATE5);
        entries.add(BERZERKER);
        entries.add(BERZERKER2);
        entries.add(BERZERKER3);
        entries.add(BERZERKER4);
        entries.add(BERZERKER5);
        entries.add(INFERNO);
        entries.add(INFERNO2);
        entries.add(INFERNO3);
        entries.add(INFERNO4);
        entries.add(INFERNO5);
        entries.add(ICE_NEEDLE);
        entries.add(ICE_NEEDLE2);
        entries.add(ICE_NEEDLE3);
        entries.add(ICE_NEEDLE4);
        entries.add(ICE_NEEDLE5);
        entries.add(LIGHTNING_SHARD);
        entries.add(LIGHTNING_SHARD2);
        entries.add(LIGHTNING_SHARD3);
        entries.add(LIGHTNING_SHARD4);
        entries.add(LIGHTNING_SHARD5);
        entries.add(SAPPHIRE_SAINT);
        entries.add(SAPPHIRE_SAINT2);
        entries.add(SAPPHIRE_SAINT3);
        entries.add(SAPPHIRE_SAINT4);
        entries.add(SAPPHIRE_SAINT5);
        entries.add(BLACK_FANG);
        entries.add(BLACK_FANG2);
        entries.add(BLACK_FANG3);
        entries.add(BLACK_FANG4);
        entries.add(BLACK_FANG5);
        entries.add(THE_CHOPPER);
        entries.add(THE_CHOPPER2);
        entries.add(THE_CHOPPER3);
        entries.add(THE_CHOPPER4);
        entries.add(THE_CHOPPER5);
        entries.add(GIANT_SLAYER);
        entries.add(GIANT_SLAYER2);
        entries.add(GIANT_SLAYER3);
        entries.add(GIANT_SLAYER4);
        entries.add(GIANT_SLAYER5);
        entries.add(HYPER_DRILL);
        entries.add(HYPER_DRILL2);
        entries.add(HYPER_DRILL3);
        entries.add(HYPER_DRILL4);
        entries.add(HYPER_DRILL5);
        entries.add(EMERALD_SMASHER);
        entries.add(EMERALD_SMASHER2);
        entries.add(EMERALD_SMASHER3);
        entries.add(EMERALD_SMASHER4);
        entries.add(EMERALD_SMASHER5);
        entries.add(DEVILS_FORK);
        entries.add(DEVILS_FORK2);
        entries.add(DEVILS_FORK3);
        entries.add(DEVILS_FORK4);
        entries.add(DEVILS_FORK5);
        entries.add(ULTRA_PRO);
        entries.add(ULTRA_PRO2);
        entries.add(ULTRA_PRO3);
        entries.add(ULTRA_PRO4);
        entries.add(ULTRA_PRO5);
        entries.add(CLUB_OF_WITHERING);
        entries.add(CLUB_OF_WITHERING2);
        entries.add(CLUB_OF_WITHERING3);
        entries.add(CLUB_OF_WITHERING4);
        entries.add(CLUB_OF_WITHERING5);
        entries.add(CRIMSON_RAZORBACK);
        entries.add(CRIMSON_RAZORBACK2);
        entries.add(CRIMSON_RAZORBACK3);
        entries.add(CRIMSON_RAZORBACK4);
        entries.add(CRIMSON_RAZORBACK5);
        entries.add(DRAGONS_FEATHER);
        entries.add(DRAGONS_FEATHER2);
        entries.add(DRAGONS_FEATHER3);
        entries.add(DRAGONS_FEATHER4);
        entries.add(DRAGONS_FEATHER5);
        entries.add(GOLDEN_AXE);
        entries.add(GOLDEN_AXE2);
        entries.add(GOLDEN_AXE3);
        entries.add(GOLDEN_AXE4);
        entries.add(GOLDEN_AXE5);
        entries.add(DARK_STALKER);
        entries.add(DARK_STALKER2);
        entries.add(DARK_STALKER3);
        entries.add(DARK_STALKER4);
        entries.add(DARK_STALKER5);
        entries.add(FUSION_BLADE);
        entries.add(FUSION_BLADE2);
        entries.add(FUSION_BLADE3);
        entries.add(FUSION_BLADE4);
        entries.add(FUSION_BLADE5);
        entries.add(SOUL_EATER);
        entries.add(SOUL_EATER2);
        entries.add(SOUL_EATER3);
        entries.add(SOUL_EATER4);
        entries.add(SOUL_EATER5);
        entries.add(LOVE_BLADE);
        entries.add(LOVE_BLADE2);
        entries.add(LOVE_BLADE3);
        entries.add(LOVE_BLADE4);
        entries.add(LOVE_BLADE5);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EpicBattleFantasyMod.MOD_ID, name), item);
    }

    public static  void registerModItems(){
        EpicBattleFantasyMod.LOGGER.info("Registering Mod Items for " + EpicBattleFantasyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
