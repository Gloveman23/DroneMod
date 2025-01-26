package com.gloveman.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LaserDroneEntity extends AbstractDroneEntity{
    protected LaserDroneEntity(EntityType<? extends AbstractDroneEntity> entityType, World world) {
        super(entityType, world);
    }
    public LaserDroneEntity(World world){
        this(DroneModEntities.LASER_DRONE_ENTITY_TYPE, world);
    }

    @Override
    ItemStack asItem() {
        return null;
    }
}
