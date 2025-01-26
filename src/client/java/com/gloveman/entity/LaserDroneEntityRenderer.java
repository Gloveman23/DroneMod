package com.gloveman.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class LaserDroneEntityRenderer extends MobEntityRenderer<LaserDroneEntity, ,LaserDroneModel> {
    public LaserDroneEntityRenderer(EntityRendererFactory.Context context, EntityModel entityModel, float f) {
        super(context, entityModel, f);
    }

    @Override
    public Identifier getTexture(LivingEntityRenderState state) {
        return null;
    }

    @Override
    public EntityRenderState createRenderState() {
        return null;
    }
}
