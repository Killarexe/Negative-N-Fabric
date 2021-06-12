package net.killarexe.negative_n.util.material.tool;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.register.NegativeNItemGroups;
import net.minecraft.item.*;

public class BaseTool {

    public SwordItem SWORD(ToolMaterial material){
        return new SwordItem(material, 3, -2.4F, new FabricItemSettings().group(NegativeNItemGroups.COMBAT));
    }

    public PickaxeItem PICKAXE(ToolMaterial material){
        return new CustomPickaxeItem(material, 1, -2.8F, new FabricItemSettings().group(NegativeNItemGroups.TOOLS));
    }

    public AxeItem AXE(ToolMaterial material){
        return new CustomAxeItem(material, 7.0F, -3.2F, new FabricItemSettings().group(NegativeNItemGroups.TOOLS));
    }

    public ShovelItem SHOVEL(ToolMaterial material){
        return new ShovelItem(material, 1, -3.0F, new FabricItemSettings().group(NegativeNItemGroups.TOOLS));
    }

    public HoeItem HOE(ToolMaterial material){
        return new CustomHoeItem(material, 7, -3.2F, new FabricItemSettings().group(NegativeNItemGroups.TOOLS));
    }
}
