package net.killarexe.negative_n.util.entity.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.math.Vec3d;

public class RemoteStatusEffect extends StatusEffect {

    private Vec3d pos;

    public RemoteStatusEffect() {
        super(StatusEffectType.NEUTRAL, 3145024);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        pos = entity.getPos();
        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        entity.setPosition(pos);
    }
}
