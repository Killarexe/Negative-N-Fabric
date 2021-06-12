package net.killarexe.negative_n.fluid;

import net.killarexe.negative_n.block.WaterN;
import net.killarexe.negative_n.register.NegativeNBlocks;
import net.killarexe.negative_n.register.NegativeNFluids;
import net.killarexe.negative_n.register.NegativeNItems;
import net.killarexe.negative_n.util.CustomFluid;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class WaterNFluid extends CustomFluid {

    @Override
    public Fluid getStill() {
        return NegativeNFluids.STILL_WATER_N;
    }

    @Override
    public Fluid getFlowing() {
        return NegativeNFluids.FLOWING_WATER_N;
    }

    @Override
    public Item getBucketItem() {
        return NegativeNFluids.BUCKET_N;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 converts the LEVEL_1_8 of the fluid state to the LEVEL_15 the fluid block uses
        return NegativeNBlocks.WATER_N.getDefaultState().with(Properties.LEVEL_15, getLevel(fluidState));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    public static class Flowing extends WaterNFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends WaterNFluid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
