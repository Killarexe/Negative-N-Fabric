package net.killarexe.negative_n.util.material.tool;

import net.killarexe.negative_n.register.NegativeNItems;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum CustomToolMaterial implements ToolMaterial {
    WOODEN_N(1, 64, 3.0F, 1.0F, 10, () -> {
        return Ingredient.ofItems(NegativeNItems.IRON_N_INGOT);
    }),

    COBBLESTONE_N(2, 250, 6.0F, 2.0F, 18, () -> {
        return Ingredient.ofItems(NegativeNItems.IRON_N_INGOT);
    }),

    GOLD_N(4, 128, 18.0F, 2.0F, 36, () -> {
        return Ingredient.ofItems(NegativeNItems.IRON_N_INGOT);
    }),

    IRON_N(4, 500, 12.0F, 4.0F, 28, () -> {
        return Ingredient.ofItems(NegativeNItems.IRON_N_INGOT);
    }),
    DIAMOND_N(6, 1561*2, 16.0F, 6.0F, 20, () -> {
        return Ingredient.ofItems(NegativeNItems.DIAMOND_N);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private CustomToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
