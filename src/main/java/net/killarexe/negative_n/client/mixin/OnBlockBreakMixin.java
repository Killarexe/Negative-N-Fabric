package net.killarexe.negative_n.client.mixin;

import net.killarexe.negative_n.util.event.OnBlockBreak;
import net.killarexe.negative_n.util.event.OnBlockBreak.Reason;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

@Mixin(ServerPlayerInteractionManager.class)
public abstract class OnBlockBreakMixin {

    @Inject(at = @At(value = "RETURN",ordinal = 0),method = "tryBreakBlock",cancellable = true)
    public void onBreakBlockEvent_ItemCantMine(BlockPos pos, CallbackInfoReturnable<Boolean> ci)
    {
        if(OnBlockBreak.EVENT.invoker().onBreak((ServerPlayerInteractionManager)(Object)this, pos, Reason.ITEM_CANNOT_MINE) == ActionResult.SUCCESS)
        {
            ci.setReturnValue(true);
        }
    }
    @Inject(at = @At(value = "RETURN",ordinal = 1),method = "tryBreakBlock",cancellable = true)
    public void onBreakBlockEvent_CreativeBlock(BlockPos pos, CallbackInfoReturnable<Boolean> ci)
    {
        if(OnBlockBreak.EVENT.invoker().onBreak((ServerPlayerInteractionManager)(Object)this, pos, Reason.CREATIVE_BLOCK) == ActionResult.SUCCESS)
        {
            ci.setReturnValue(true);
        }
    }
    @Inject(at = @At(value = "RETURN",ordinal = 2),method = "tryBreakBlock",cancellable = true)
    public void onBreakBlockEvent_PlayerCantMine(BlockPos pos, CallbackInfoReturnable<Boolean> ci)
    {
        // ShulkerBoxBlock
        if(OnBlockBreak.EVENT.invoker().onBreak((ServerPlayerInteractionManager)(Object)this, pos, Reason.PLAYER_CANNOT_MINE) == ActionResult.SUCCESS)
        {
            ci.setReturnValue(true);
        }
    }

    @Shadow protected abstract boolean isCreative();

    @Shadow private ServerPlayerEntity player;
    @Inject(
            at = @At(
                    value="INVOKE",
                    target="net/minecraft/block/Block.onBreak(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/entity/player/PlayerEntity;)V",
                    ordinal = 0,
                    shift = Shift.BEFORE),
            method = "tryBreakBlock",
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void OnBreakBlock_SuccessSurvival(BlockPos pos, CallbackInfoReturnable<Boolean> ci, BlockState state, BlockEntity be, Block block)
    {
        if(this.isCreative() && OnBlockBreak.EVENT.invoker().onBreak((ServerPlayerInteractionManager)(Object)this, pos, Reason.SUCCESS_CREATIVE) == ActionResult.FAIL)
        {
            ci.setReturnValue(false);
        }
        boolean usingEffeciveTool = this.player.isUsingEffectiveTool(state);
        ActionResult result = OnBlockBreak.EVENT.invoker().onBreak((ServerPlayerInteractionManager)(Object)this, pos, usingEffeciveTool ? Reason.SUCCESS_SURVIVAL_EFFECIVE_TOOL : Reason.SUCCESS_SURVIVAL);
        if(result == ActionResult.FAIL)
        {
            ci.setReturnValue(false);
        }
    }

}
