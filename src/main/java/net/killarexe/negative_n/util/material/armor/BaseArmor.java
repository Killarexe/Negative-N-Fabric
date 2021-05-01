package net.killarexe.negative_n.util.material.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.register.NegativeNItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class BaseArmor extends ArmorItem {
    public BaseArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(NegativeNItemGroups.COMBAT));
    }
}
