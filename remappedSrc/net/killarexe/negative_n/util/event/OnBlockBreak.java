package net.killarexe.negative_n.util.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.base.event.EventFactoryImpl;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public interface OnBlockBreak {
    public enum Reason
    {
        ITEM_CANNOT_MINE,
        CREATIVE_BLOCK,
        PLAYER_CANNOT_MINE,
        SUCCESS_CREATIVE,
        SUCCESS_SURVIVAL_EFFECIVE_TOOL,
        SUCCESS_SURVIVAL,
        ;

        public boolean isCreative()
        {
            return this == SUCCESS_CREATIVE;
        }
        public boolean isSuccessful()
        {
            return this == SUCCESS_SURVIVAL || this == SUCCESS_SURVIVAL_EFFECIVE_TOOL;
        }
        public boolean isSuccessfulAndEffective()
        {
            return this == SUCCESS_SURVIVAL_EFFECIVE_TOOL;
        }
        public boolean isFailure()
        {
            return !isSuccessful() && this != SUCCESS_CREATIVE;
        }
    }

    Event<OnBlockBreak> EVENT = EventFactoryImpl.createArrayBacked(OnBlockBreak.class, (listeners)->
            (manager,pos,reason)->
            {
                for(OnBlockBreak callback : listeners)
                {
                    ActionResult result = callback.onBreak(manager, pos, reason);
                    if(!result.isAccepted() && reason.isSuccessful()) return ActionResult.FAIL;
                    else if(result.isAccepted() && reason.isFailure()) return ActionResult.SUCCESS;
                }
                return ActionResult.PASS;
            });

    ActionResult onBreak(ServerPlayerInteractionManager manager, BlockPos pos, Reason reason);

}
