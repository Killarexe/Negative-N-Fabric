package net.killarexe.negative_n.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killarexe.negative_n.sapling.OakNSaplingGenerator;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;

public class OakNSapling extends SaplingBlock {
    public OakNSapling() {
        super(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));
    }
}
