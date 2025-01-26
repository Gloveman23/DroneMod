package com.gloveman.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LaserDroneItem extends AbstractDroneItem{
    public LaserDroneItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if(world.isClient){
            user.getStackInHand(hand).decrementUnlessCreative(1, user);
            return ActionResult.CONSUME;
        }

    }
}
