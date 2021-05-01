package net.killarexe.negative_n.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.register.NegativeNItemGroups;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class BucketN extends BucketItem {

    public BucketN(Fluid fluid) {
        super(fluid, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    }

}
