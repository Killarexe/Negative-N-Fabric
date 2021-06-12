package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NegativeNItemGroups {

    static String MODID = "negative_n";

    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.build(
      new Identifier(MODID, "blocks"), () -> new ItemStack(NegativeNBlocks.DIAMOND_N_BLOCK));

    public static final ItemGroup DECO = FabricItemGroupBuilder.build(
            new Identifier(MODID, "deco"), () -> new ItemStack(NegativeNBlocks.OAK_LEAVES_N));

    public static final ItemGroup MISC = FabricItemGroupBuilder.build(
            new Identifier(MODID, "misc"), () -> new ItemStack(NegativeNItems.DIAMOND_N));

    public static final ItemGroup COMBAT = FabricItemGroupBuilder.build(
            new Identifier(MODID, "combat"), () -> new ItemStack(NegativeNItems.DIAMOND_N_SWORD));

    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
            new Identifier(MODID, "tools"), () -> new ItemStack(NegativeNItems.DIAMOND_N_PICKAXE));
}
