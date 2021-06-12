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
import net.minecraft.util.BlockRotation;
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
        //setDefaultState(getStateManager().getDefaultState().with(Properties.FACING, Direction.UP));
    }

    /*@Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        if (rotation == BlockRotation.CLOCKWISE_90 || rotation == BlockRotation.COUNTERCLOCKWISE_90) {
            if ((Direction) state.get(Properties.FACING) == Direction.WEST || (Direction) state.get(Properties.FACING) == Direction.EAST) {
                return state.with(Properties.FACING, Direction.UP);
            } else if ((Direction) state.get(Properties.FACING) == Direction.UP || (Direction) state.get(Properties.FACING) == Direction.DOWN) {
                return state.with(Properties.FACING, Direction.WEST);
            }
        }
        return state;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction facing = ctx.getPlayerFacing();
        if (facing == Direction.WEST || facing == Direction.EAST)
            facing = Direction.UP;
        else if (facing == Direction.NORTH || facing == Direction.SOUTH)
            facing = Direction.EAST;
        else
            facing = Direction.SOUTH;;
        return this.getDefaultState().with(Properties.FACING, facing);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING);
    }*/

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drop = super.getDroppedStacks(state, builder);
        if(!drop.isEmpty()){
            return drop;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
