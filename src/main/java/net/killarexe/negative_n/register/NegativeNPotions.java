package net.killarexe.negative_n.register;

import net.killarexe.negative_n.util.entity.effects.RemoteStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NegativeNPotions extends NegativeNRegisterType{

    public static final StatusEffect REMOTE_EFFECT = new RemoteStatusEffect();

    public static final Potion REMOTE = createPotion(REMOTE_EFFECT);

    public static void register(){
        registerStatusEffect(REMOTE_EFFECT, "remote");
        registerPotion(REMOTE, "remote");
    }

    private static Potion createPotion(StatusEffect effect){
        Potion potion;
        potion = new Potion(new StatusEffectInstance[]{new StatusEffectInstance(effect, 3600)});
        return potion;
    }

    private static Potion createLongPotion(StatusEffect effect, String id){
        Potion longPotion;
        longPotion = new Potion(id, new StatusEffectInstance[]{new StatusEffectInstance(effect, 9600)});
        return longPotion;
    }

    private static Potion createStrongPotion(StatusEffect effect, String id){
        Potion strongPotion;
        strongPotion = new Potion(id, new StatusEffectInstance[]{new StatusEffectInstance(effect, 1800, 1)});
        return strongPotion;
    }

    private static void registerPotion(Potion potion, String id){
        Registry.register(Registry.POTION, new Identifier(MODID, id), potion);
    }

    private static void registerStatusEffect(StatusEffect effect, String id){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(MODID, id), effect);
    }

}
