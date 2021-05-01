package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killarexe.negative_n.register.NegativeNFluids;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class WaterN extends FluidBlock {

    public WaterN() {
        super(NegativeNFluids.STILL_WATER_N, FabricBlockSettings.copy(Blocks.WATER));
    }
}
