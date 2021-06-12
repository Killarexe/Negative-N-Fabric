package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Collections;
import java.util.List;

public class CopperNBlock extends OxidizableBlock {

    public CopperNBlock() {
        super(OxidizationLevel.UNAFFECTED, FabricBlockSettings
                .of(Material.STONE)
                .strength(3, 10)
                .breakByHand(false)
                .sounds(BlockSoundGroup.COPPER)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 2));
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drop = super.getDroppedStacks(state, builder);
        if(!drop.isEmpty()){
            return drop;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
