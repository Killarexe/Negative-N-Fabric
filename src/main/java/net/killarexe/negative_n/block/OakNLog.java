package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.killarexe.negative_n.register.NegativeNBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class OakNLog extends PillarBlock {

    public OakNLog() {
        super(FabricBlockSettings
                .of(Material.WOOD)
                .strength(5, 19)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .requiresTool()
                .breakByTool(FabricToolTags.AXES, 0));
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
