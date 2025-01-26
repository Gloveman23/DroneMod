package com.gloveman.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Arm;
import net.minecraft.world.World;

import java.util.List;

public abstract class AbstractDroneEntity extends MobEntity {
    private LivingEntity owner;
    protected AbstractDroneEntity(EntityType<? extends AbstractDroneEntity> entityType, World world) {
        super(entityType, world);
    }

    abstract ItemStack asItem();

    @Override
    public void tick() {
        if(!this.getWorld().isClient && (owner == null || owner.isDead())){
            this.kill((ServerWorld)this.getWorld());
        }
        super.tick();
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return List.of(ItemStack.EMPTY);
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {}

    @Override
    public Arm getMainArm() {
        return Arm.RIGHT;
    }
    @Override
    public boolean shouldDropExperience() {
        return false;
    }
    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        return false;
    }


}
