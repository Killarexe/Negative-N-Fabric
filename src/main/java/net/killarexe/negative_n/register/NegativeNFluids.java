package net.killarexe.negative_n.register;

import net.killarexe.negative_n.fluid.WaterNFluid;
import net.killarexe.negative_n.item.BucketN;
import net.killarexe.negative_n.util.CustomFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NegativeNFluids extends NegativeNRegisterType{

    public static FlowableFluid STILL_WATER_N;
    public static FlowableFluid FLOWING_WATER_N;
    public static final BucketN BUCKET_N = new BucketN(STILL_WATER_N);

    public static void register(){
        LOGGER.info("Register Fluids...");
        registerFluid(STILL_WATER_N, "water_n", FLOWING_WATER_N, "flowing_water_n", BUCKET_N, "bucket_n");
        LOGGER.info("Register Fluids Complete!");
    }

    private static void registerFluid(FlowableFluid stillFluid, String stillFluidId, FlowableFluid flowingFluid, String flowingFluidId, BucketItem item, String itemId){
        stillFluid = Registry.register(Registry.FLUID, new Identifier(MODID, stillFluidId), new WaterNFluid.Still());
        flowingFluid = Registry.register(Registry.FLUID, new Identifier(MODID, flowingFluidId), new WaterNFluid.Flowing());
        Registry.register(Registry.ITEM, new Identifier(MODID, itemId), item);
    }
}
