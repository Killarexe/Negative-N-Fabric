package net.killarexe.negative_n.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.register.NegativeNBlocks;
import net.killarexe.negative_n.register.NegativeNItemGroups;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PowderN extends Item {

    public PowderN() {
        super(new FabricItemSettings().group(NegativeNItemGroups.MISC).fireproof());
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity entity = context.getPlayer();
        Hand hand = context.getHand();
        Direction direction = context.getSide();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        ItemStack itemstack = context.getPlayer().getActiveItem();
        if(world.getBlockState(new BlockPos(x, y, z)) == Blocks.DIRT.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), NegativeNBlocks.DIRT_N.getDefaultState());
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else if(world.getBlockState(new BlockPos(x, y, z)) == Blocks.GRASS_BLOCK.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), NegativeNBlocks.GRASS_BLOCK_N.getDefaultState());
            entity.getStackInHand(hand).decrement(1);
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else if(world.getBlockState(new BlockPos(x, y, z)) == NegativeNBlocks.DIRT_N.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), Blocks.DIRT.getDefaultState());
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else if(world.getBlockState(new BlockPos(x, y, z)) == NegativeNBlocks.GRASS_BLOCK_N.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), Blocks.GRASS_BLOCK.getDefaultState());
            entity.getStackInHand(hand).decrement(1);
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else if(world.getBlockState(new BlockPos(x, y, z)) == NegativeNBlocks.OAK_LOG_N.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), Blocks.OAK_LOG.getDefaultState());
            entity.getStackInHand(hand).decrement(1);
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else if(world.getBlockState(new BlockPos(x, y, z)) == Blocks.OAK_LOG.getDefaultState()){
            entity.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED, 1,1);
            world.setBlockState(new BlockPos(x, y, z), NegativeNBlocks.OAK_LOG_N.getDefaultState());
            entity.getStackInHand(hand).decrement(1);
            entity.inventory.main.remove(hand);
            return ActionResult.SUCCESS;
        }else
            return ActionResult.PASS;
        }
}
