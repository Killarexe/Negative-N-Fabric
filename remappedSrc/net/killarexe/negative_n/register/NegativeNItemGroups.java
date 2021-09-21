package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.killarexe.negative_n.NegativeNMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NegativeNItemGroups {

    private static String MODID = NegativeNMod.MODID;

    public static final ItemGroup BLOCKS = createItemGroup(MODID, "blocks", new ItemStack(NegativeNBlocks.DIAMOND_N_BLOCK));

    public static final ItemGroup DECO = createItemGroup(MODID, "deco", new ItemStack(NegativeNBlocks.OAK_LEAVES_N));

    public static final ItemGroup MISC = createItemGroup(MODID, "misc", new ItemStack(NegativeNItems.DIAMOND_N));

    public static final ItemGroup COMBAT = createItemGroup(MODID, "combat", new ItemStack(NegativeNItems.GOLD_N_SWORD));

    public static final ItemGroup TOOLS = createItemGroup(MODID, "tools", new ItemStack(NegativeNItems.IRON_N_AXE));

    private static final ItemGroup createItemGroup(String MODID, String id, ItemStack icon){
        ItemGroup group = FabricItemGroupBuilder.build(new Identifier(MODID, id), () -> icon);
        return group;
    }
}
