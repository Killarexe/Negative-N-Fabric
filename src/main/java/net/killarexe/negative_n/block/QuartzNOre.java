package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.killarexe.negative_n.register.NegativeNItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Collections;
import java.util.List;

public class QuartzNOre extends Block {

    public QuartzNOre() {
        super(FabricBlockSettings
                .of(Material.METAL)
                .strength(5, 19)
                .breakByHand(false)
                .sounds(BlockSoundGroup.NETHER_GOLD_ORE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 6));
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drop = super.getDroppedStacks(state, builder);
        if(!drop.isEmpty()){
            return drop;
        }
        return Collections.singletonList(new ItemStack(NegativeNItems.QUARTZ_N, 1));
    }
}
