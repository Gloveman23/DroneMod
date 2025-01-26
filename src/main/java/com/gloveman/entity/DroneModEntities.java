package com.gloveman.entity;

import com.gloveman.DronesMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public abstract class DroneModEntities {
    public static final EntityType<LaserDroneEntity> LASER_DRONE_ENTITY_TYPE = EntityType.Builder.<LaserDroneEntity>create(LaserDroneEntity::new, SpawnGroup.MISC).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, DronesMod.id("laser")));

    public static void register(){
        Registry.register(Registries.ENTITY_TYPE, DronesMod.id("laser_drone"), LASER_DRONE_ENTITY_TYPE);


    }
    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(LASER_DRONE_ENTITY_TYPE, LaserDroneEntity.createMobAttributes());
    }

}
