// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.chaotic.epicbattlefantasymod.entity.client;

import net.chaotic.epicbattlefantasymod.entity.custom.ChocolateSlimeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class ChocolateSlimeModel <T extends ChocolateSlimeEntity>extends SinglePartEntityModel<T> {
	private final ModelPart bone;
	private final ModelPart face;
	public ChocolateSlimeModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.face = root.getChild("face");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -7.0F, -6.0F, 12.0F, 7.0F, 12.0F, new Dilation(0.0F))
		.uv(6, 4).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData face = bone.addChild("face", ModelPartBuilder.create().uv(1, 1).cuboid(-4.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(1.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-3.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(2, 1).cuboid(0.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(ChocolateSlimeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay);
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}