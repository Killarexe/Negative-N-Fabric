package net.killarexe.negative_n.register;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.killarexe.negative_n.NegativeNMod;
import net.killarexe.negative_n.tileEntity.RawFilterEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.*;

public class NegativeNTileEnitys {

    private static String MODID = NegativeNMod.MODID;
    private static Logger LOGGER = LogManager.getLogger();

    public static BlockEntityType<RawFilterEntity> RAW_FILTER_ENTITY_ENTITY;

    public static void register(){
        LOGGER.info("Registering tile entitys...");
        registerTileEntitys();
        LOGGER.info("Tile Entitys Registering Complete!");
    }

    private static void registerTileEntitys(){
        RAW_FILTER_ENTITY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MODID, "raw_filter_entity"),
                FabricBlockEntityTypeBuilder.create(RawFilterEntity::new, NegativeNBlocks.RAW_FILTER).build(null));
    }
}
