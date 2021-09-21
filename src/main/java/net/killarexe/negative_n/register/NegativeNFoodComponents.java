package net.killarexe.negative_n.register;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class NegativeNFoodComponents extends NegativeNRegisterType{
    public static final FoodComponent BREAD_N = createDeafult(4, 2);
    public static final FoodComponent APPLE_N = createDeafult(4, 2);
    public static final FoodComponent GOLDEN_N_APPLE_N = createDeafult(4, 2);
    public static final FoodComponent ENCHANTED_GOLDEN_N_APPLE_N = createDeafult(4, 2);
    public static final FoodComponent BEETROOT_N = createDeafult(4, 2);
    public static final FoodComponent CARROT_N = createDeafult(4, 2);
    public static final FoodComponent POTATO_N = createDeafult(4, 2);
    public static final FoodComponent BAKED_POTATO_N = createDeafult(4, 2);
    public static final FoodComponent POISONOUS_POTATO_N = createDeafult(4, 2, new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.6F);
    public static final FoodComponent CHORUS_FRUT_N = createDeafult(4, 2);
    public static final FoodComponent BEEF_N = createMeat(4, 2);
    public static final FoodComponent COOKED_BEEF_N = createMeat(4, 2);
    public static final FoodComponent PORKCHOP_N = createMeat(4, 2);
    public static final FoodComponent COOKED_PORKCHOP_N = createMeat(4, 2);
    public static final FoodComponent CHIKEN_N = createMeat(4, 2);
    public static final FoodComponent COOKED_CHIKEN_N = createMeat(4, 2);
    public static final FoodComponent MUTTON_N = createMeat(4, 2);
    public static final FoodComponent MUTTON_CHIKEN_N = createMeat(4, 2);

    private static FoodComponent createDeafult(int hunger, float saturationModifer){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).build();
        return component;
    };

    private static FoodComponent createDeafult(int hunger, float saturationModifer, StatusEffectInstance instance, float chance){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).statusEffect(instance, chance).build();
        return component;
    };

    private static FoodComponent createMeat(int hunger, float saturationModifer){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).meat().build();
        return component;
    };

    private static FoodComponent createMeat(int hunger, float saturationModifer, StatusEffectInstance instance, float chance){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).statusEffect(instance, chance).meat().build();
        return component;
    };

    private static FoodComponent createAlwaysEatable(int hunger, float saturationModifer){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).alwaysEdible().build();
        return component;
    };

    private static FoodComponent createAlwaysEatable(int hunger, float saturationModifer, StatusEffectInstance instance, float chance){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).statusEffect(instance, chance).alwaysEdible().build();
        return component;
    };

    private static FoodComponent createMeatAlwaysEatable(int hunger, float saturationModifer){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).alwaysEdible().meat().build();
        return component;
    };

    private static FoodComponent createMeatAlwaysEatable(int hunger, float saturationModifer, StatusEffectInstance instance, float chance){
        FoodComponent component;
        component = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifer).statusEffect(instance, chance).alwaysEdible().meat().build();
        return component;
    };
}
