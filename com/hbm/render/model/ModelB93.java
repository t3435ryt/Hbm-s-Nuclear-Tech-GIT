// Date: 26.04.2018 22:13:08
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.hbm.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelB93 extends ModelBase {
	// fields
	ModelRenderer Muzzle1;
	ModelRenderer Barrel1;
	ModelRenderer Barrel2;
	ModelRenderer Grip;
	ModelRenderer Front1;
	ModelRenderer Front2;
	ModelRenderer Body;
	ModelRenderer Top;
	ModelRenderer GripBottom;
	ModelRenderer Handle;
	ModelRenderer HandleBack;
	ModelRenderer Frame1;
	ModelRenderer Frame2;
	ModelRenderer Frame3;
	ModelRenderer Trigger;
	ModelRenderer BackPlate1;
	ModelRenderer Back;
	ModelRenderer BackPlate2;
	ModelRenderer Pump1;
	ModelRenderer Pump2;
	ModelRenderer BodyPlate;
	ModelRenderer Muz1;
	ModelRenderer Muz2;
	ModelRenderer Muz3;
	ModelRenderer Damp1;
	ModelRenderer Damp2;
	ModelRenderer Damp3;
	ModelRenderer DampFront;
	ModelRenderer EmitterRod;
	ModelRenderer EmitterCrystal;
	ModelRenderer EmitterClamp1;
	ModelRenderer EmitterClamp2;
	ModelRenderer EmitterClamp3;
	ModelRenderer EmitterClamp4;
	ModelRenderer EmitterClamp5;
	ModelRenderer EmitterClamp6;
	ModelRenderer EmitterClamp7;
	ModelRenderer EmitterClamp8;
	ModelRenderer PowBox;
	ModelRenderer PowPanel;
	ModelRenderer Nix1;
	ModelRenderer Nix2;
	ModelRenderer Nix3;
	ModelRenderer Nix11;
	ModelRenderer Nix21;
	ModelRenderer Nix31;
	ModelRenderer Nix12;
	ModelRenderer Nix22;
	ModelRenderer Nix32;
	ModelRenderer Pylon;
	ModelRenderer Wire1;
	ModelRenderer Wire2;
	ModelRenderer Wire3;
	ModelRenderer PowPylon;

	public ModelB93() {
		textureWidth = 128;
		textureHeight = 64;

		Muzzle1 = new ModelRenderer(this, 22, 36);
		Muzzle1.addBox(0F, 0F, 0F, 2, 3, 2);
		Muzzle1.setRotationPoint(-24F, 0.5F, -1F);
		Muzzle1.setTextureSize(64, 32);
		Muzzle1.mirror = true;
		setRotation(Muzzle1, 0F, 0F, 0F);
		Barrel1 = new ModelRenderer(this, 0, 0);
		Barrel1.addBox(0F, 0F, 0F, 24, 2, 3);
		Barrel1.setRotationPoint(-24F, 1F, -1.5F);
		Barrel1.setTextureSize(64, 32);
		Barrel1.mirror = true;
		setRotation(Barrel1, 0F, 0F, 0F);
		Barrel2 = new ModelRenderer(this, 0, 5);
		Barrel2.addBox(0F, 0F, 0F, 22, 1, 2);
		Barrel2.setRotationPoint(-22F, 0.5F, -1F);
		Barrel2.setTextureSize(64, 32);
		Barrel2.mirror = true;
		setRotation(Barrel2, 0F, 0F, 0F);
		Grip = new ModelRenderer(this, 0, 8);
		Grip.addBox(0F, 0F, 0F, 20, 3, 4);
		Grip.setRotationPoint(-20F, 3F, -2F);
		Grip.setTextureSize(64, 32);
		Grip.mirror = true;
		setRotation(Grip, 0F, 0F, 0F);
		Front1 = new ModelRenderer(this, 10, 36);
		Front1.addBox(0F, 0F, 0F, 2, 4, 4);
		Front1.setRotationPoint(-22F, 0.5F, -2F);
		Front1.setTextureSize(64, 32);
		Front1.mirror = true;
		setRotation(Front1, 0F, 0F, 0F);
		Front2 = new ModelRenderer(this, 0, 36);
		Front2.addBox(0F, 0F, 0F, 2, 6, 3);
		Front2.setRotationPoint(-22F, 0F, -1.5F);
		Front2.setTextureSize(64, 32);
		Front2.mirror = true;
		setRotation(Front2, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 0, 15);
		Body.addBox(0F, 0F, 0F, 15, 7, 4);
		Body.setRotationPoint(0F, 0.5F, -2F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Top = new ModelRenderer(this, 28, 60);
		Top.addBox(0F, 0F, 0F, 15, 1, 3);
		Top.setRotationPoint(0F, 0F, -1.5F);
		Top.setTextureSize(64, 32);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		GripBottom = new ModelRenderer(this, 24, 43);
		GripBottom.addBox(0F, 0F, 0F, 18, 1, 2);
		GripBottom.setRotationPoint(-18F, 5.5F, -1F);
		GripBottom.setTextureSize(64, 32);
		GripBottom.mirror = true;
		setRotation(GripBottom, 0F, 0F, 0F);
		Handle = new ModelRenderer(this, 0, 45);
		Handle.addBox(0F, 0F, 0F, 6, 15, 4);
		Handle.setRotationPoint(6F, 7F, -2F);
		Handle.setTextureSize(64, 32);
		Handle.mirror = true;
		setRotation(Handle, 0F, 0F, -0.2268928F);
		HandleBack = new ModelRenderer(this, 20, 46);
		HandleBack.addBox(5.5F, 0F, 0F, 1, 15, 3);
		HandleBack.setRotationPoint(6F, 7F, -1.5F);
		HandleBack.setTextureSize(64, 32);
		HandleBack.mirror = true;
		setRotation(HandleBack, 0F, 0F, -0.2268928F);
		Frame1 = new ModelRenderer(this, 28, 57);
		Frame1.addBox(0F, 0F, 0F, 7, 1, 2);
		Frame1.setRotationPoint(0.5F, 11F, -1F);
		Frame1.setTextureSize(64, 32);
		Frame1.mirror = true;
		setRotation(Frame1, 0F, 0F, 0F);
		Frame2 = new ModelRenderer(this, 28, 51);
		Frame2.addBox(0F, 0F, 0F, 2, 4, 2);
		Frame2.setRotationPoint(-2F, 6.5F, -1F);
		Frame2.setTextureSize(64, 32);
		Frame2.mirror = true;
		setRotation(Frame2, 0F, 0F, 0F);
		Frame3 = new ModelRenderer(this, 46, 57);
		Frame3.addBox(0F, -1F, 0F, 3, 1, 2);
		Frame3.setRotationPoint(-2F, 10.5F, -1F);
		Frame3.setTextureSize(64, 32);
		Frame3.mirror = true;
		setRotation(Frame3, 0F, 0F, 0.5235988F);
		Trigger = new ModelRenderer(this, 36, 53);
		Trigger.addBox(0F, 0F, 0F, 2, 3, 1);
		Trigger.setRotationPoint(4F, 7F, -0.5F);
		Trigger.setTextureSize(64, 32);
		Trigger.mirror = true;
		setRotation(Trigger, 0F, 0F, 0.1919862F);
		BackPlate1 = new ModelRenderer(this, 56, 53);
		BackPlate1.addBox(-1F, 0F, 0F, 1, 4, 3);
		BackPlate1.setRotationPoint(15F, 0F, -1.5F);
		BackPlate1.setTextureSize(64, 32);
		BackPlate1.mirror = true;
		setRotation(BackPlate1, 0F, 0F, -0.5235988F);
		Back = new ModelRenderer(this, 42, 49);
		Back.addBox(0F, 0F, 0F, 2, 4, 4);
		Back.setRotationPoint(15F, 3.5F, -2F);
		Back.setTextureSize(64, 32);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		BackPlate2 = new ModelRenderer(this, 48, 5);
		BackPlate2.addBox(-2F, 0F, 0F, 2, 4, 4);
		BackPlate2.setRotationPoint(15F, 0.5F, -2F);
		BackPlate2.setTextureSize(64, 32);
		BackPlate2.mirror = true;
		setRotation(BackPlate2, 0F, 0F, -0.4886922F);
		Pump1 = new ModelRenderer(this, 46, 29);
		Pump1.addBox(0F, 0F, 0F, 7, 2, 2);
		Pump1.setRotationPoint(10F, 1F, -1F);
		Pump1.setTextureSize(64, 32);
		Pump1.mirror = true;
		setRotation(Pump1, 0F, 0F, 0F);
		Pump2 = new ModelRenderer(this, 44, 33);
		Pump2.addBox(0F, 0F, 0F, 3, 3, 7);
		Pump2.setRotationPoint(17F, 0.5F, -3.5F);
		Pump2.setTextureSize(64, 32);
		Pump2.mirror = true;
		setRotation(Pump2, 0F, 0F, 0F);
		BodyPlate = new ModelRenderer(this, 0, 26);
		BodyPlate.addBox(0F, 0F, 0F, 14, 5, 5);
		BodyPlate.setRotationPoint(1.5F, 2F, -2.5F);
		BodyPlate.setTextureSize(64, 32);
		BodyPlate.mirror = true;
		setRotation(BodyPlate, 0F, 0F, 0F);
		Muz1 = new ModelRenderer(this, 90, 3);
		Muz1.addBox(0F, 0F, 0F, 2, 5, 3);
		Muz1.setRotationPoint(-26F, -0.5F, -1.5F);
		Muz1.setTextureSize(64, 32);
		Muz1.mirror = true;
		setRotation(Muz1, 0F, 0F, 0F);
		Muz2 = new ModelRenderer(this, 64, 2);
		Muz2.addBox(0F, 0F, 0F, 2, 3, 5);
		Muz2.setRotationPoint(-26F, 0.5F, -2.5F);
		Muz2.setTextureSize(64, 32);
		Muz2.mirror = true;
		setRotation(Muz2, 0F, 0F, 0F);
		Muz3 = new ModelRenderer(this, 78, 3);
		Muz3.addBox(0F, 0F, 0F, 2, 4, 4);
		Muz3.setRotationPoint(-26F, 0F, -2F);
		Muz3.setTextureSize(64, 32);
		Muz3.mirror = true;
		setRotation(Muz3, 0F, 0F, 0F);
		Damp1 = new ModelRenderer(this, 64, 53);
		Damp1.addBox(0F, 0F, 0F, 24, 7, 4);
		Damp1.setRotationPoint(-50F, -1.5F, -2F);
		Damp1.setTextureSize(64, 32);
		Damp1.mirror = true;
		setRotation(Damp1, 0F, 0F, 0F);
		Damp2 = new ModelRenderer(this, 64, 42);
		Damp2.addBox(0F, 0F, 0F, 24, 4, 7);
		Damp2.setRotationPoint(-50F, 0F, -3.5F);
		Damp2.setTextureSize(64, 32);
		Damp2.mirror = true;
		setRotation(Damp2, 0F, 0F, 0F);
		Damp3 = new ModelRenderer(this, 64, 30);
		Damp3.addBox(0F, 0F, 0F, 24, 6, 6);
		Damp3.setRotationPoint(-50F, -1F, -3F);
		Damp3.setTextureSize(64, 32);
		Damp3.mirror = true;
		setRotation(Damp3, 0F, 0F, 0F);
		DampFront = new ModelRenderer(this, 64, 22);
		DampFront.addBox(0F, 0F, 0F, 2, 4, 4);
		DampFront.setRotationPoint(-51.1F, 0F, -2F);
		DampFront.setTextureSize(64, 32);
		DampFront.mirror = true;
		setRotation(DampFront, 0F, 0F, 0F);
		EmitterRod = new ModelRenderer(this, 64, 18);
		EmitterRod.addBox(0F, 0F, 0F, 4, 2, 2);
		EmitterRod.setRotationPoint(-55F, 1F, -1F);
		EmitterRod.setTextureSize(64, 32);
		EmitterRod.mirror = true;
		setRotation(EmitterRod, 0F, 0F, 0F);
		EmitterCrystal = new ModelRenderer(this, 76, 24);
		EmitterCrystal.addBox(0F, -1.5F, -1.5F, 3, 3, 3);
		EmitterCrystal.setRotationPoint(-57F, 2F, 0F);
		EmitterCrystal.setTextureSize(64, 32);
		EmitterCrystal.mirror = true;
		setRotation(EmitterCrystal, 0.7853982F, 0F, 0F);
		EmitterClamp1 = new ModelRenderer(this, 88, 27);
		EmitterClamp1.addBox(-5F, 0F, 0F, 5, 2, 1);
		EmitterClamp1.setRotationPoint(-50F, 1F, -0.5F);
		EmitterClamp1.setTextureSize(64, 32);
		EmitterClamp1.mirror = true;
		setRotation(EmitterClamp1, 0F, 0F, 1.047198F);
		EmitterClamp2 = new ModelRenderer(this, 88, 24);
		EmitterClamp2.addBox(-5F, -2F, 0F, 5, 2, 1);
		EmitterClamp2.setRotationPoint(-50F, 3F, -0.5F);
		EmitterClamp2.setTextureSize(64, 32);
		EmitterClamp2.mirror = true;
		setRotation(EmitterClamp2, 0F, 0F, -1.047198F);
		EmitterClamp3 = new ModelRenderer(this, 100, 27);
		EmitterClamp3.addBox(-5F, 0F, 0F, 5, 1, 2);
		EmitterClamp3.setRotationPoint(-50F, 1.5F, -1F);
		EmitterClamp3.setTextureSize(64, 32);
		EmitterClamp3.mirror = true;
		setRotation(EmitterClamp3, 0F, -1.047198F, 0F);
		EmitterClamp4 = new ModelRenderer(this, 100, 24);
		EmitterClamp4.addBox(-5F, 0F, -2F, 5, 1, 2);
		EmitterClamp4.setRotationPoint(-50F, 1.5F, 1F);
		EmitterClamp4.setTextureSize(64, 32);
		EmitterClamp4.mirror = true;
		setRotation(EmitterClamp4, 0F, 1.047198F, 0F);
		EmitterClamp5 = new ModelRenderer(this, 76, 22);
		EmitterClamp5.addBox(-6F, 0F, 0F, 7, 1, 1);
		EmitterClamp5.setRotationPoint(-53F, -4F, -0.5F);
		EmitterClamp5.setTextureSize(64, 32);
		EmitterClamp5.mirror = true;
		setRotation(EmitterClamp5, 0F, 0F, -0.5235988F);
		EmitterClamp6 = new ModelRenderer(this, 76, 20);
		EmitterClamp6.addBox(-6F, -1F, 0F, 7, 1, 1);
		EmitterClamp6.setRotationPoint(-53F, 8F, -0.5F);
		EmitterClamp6.setTextureSize(64, 32);
		EmitterClamp6.mirror = true;
		setRotation(EmitterClamp6, 0F, 0F, 0.5235988F);
		EmitterClamp7 = new ModelRenderer(this, 92, 22);
		EmitterClamp7.addBox(-6F, 0F, 0F, 7, 1, 1);
		EmitterClamp7.setRotationPoint(-53F, 1.5F, -6F);
		EmitterClamp7.setTextureSize(64, 32);
		EmitterClamp7.mirror = true;
		setRotation(EmitterClamp7, 0F, 0.5235988F, 0F);
		EmitterClamp8 = new ModelRenderer(this, 92, 20);
		EmitterClamp8.addBox(-6F, 0F, -1F, 7, 1, 1);
		EmitterClamp8.setRotationPoint(-53F, 1.5F, 6F);
		EmitterClamp8.setTextureSize(64, 32);
		EmitterClamp8.mirror = true;
		setRotation(EmitterClamp8, 0F, -0.5235988F, 0F);
		PowBox = new ModelRenderer(this, 76, 11);
		PowBox.addBox(0F, 0F, 0F, 10, 5, 4);
		PowBox.setRotationPoint(4F, 2F, 2.5F);
		PowBox.setTextureSize(64, 32);
		PowBox.mirror = true;
		setRotation(PowBox, 0F, 0F, 0F);
		PowPanel = new ModelRenderer(this, 44, 24);
		PowPanel.addBox(0F, 0F, 0F, 9, 4, 1);
		PowPanel.setRotationPoint(4.5F, 2.5F, 6F);
		PowPanel.setTextureSize(64, 32);
		PowPanel.mirror = true;
		setRotation(PowPanel, 0F, 0F, 0F);
		Nix1 = new ModelRenderer(this, 56, 17);
		Nix1.addBox(0F, 0F, 0F, 2, 5, 2);
		Nix1.setRotationPoint(11F, -3F, 4F);
		Nix1.setTextureSize(64, 32);
		Nix1.mirror = true;
		setRotation(Nix1, 0F, 0F, 0F);
		Nix2 = new ModelRenderer(this, 48, 17);
		Nix2.addBox(0F, 0F, 0F, 2, 5, 2);
		Nix2.setRotationPoint(8F, -3F, 4F);
		Nix2.setTextureSize(64, 32);
		Nix2.mirror = true;
		setRotation(Nix2, 0F, 0F, 0F);
		Nix3 = new ModelRenderer(this, 40, 17);
		Nix3.addBox(0F, 0F, 0F, 2, 5, 2);
		Nix3.setRotationPoint(5F, -3F, 4F);
		Nix3.setTextureSize(64, 32);
		Nix3.mirror = true;
		setRotation(Nix3, 0F, 0F, 0F);
		Nix11 = new ModelRenderer(this, 72, 15);
		Nix11.addBox(0F, 0F, 0F, 1, 2, 1);
		Nix11.setRotationPoint(11.5F, -5F, 4.5F);
		Nix11.setTextureSize(64, 32);
		Nix11.mirror = true;
		setRotation(Nix11, 0F, 0F, 0F);
		Nix21 = new ModelRenderer(this, 68, 15);
		Nix21.addBox(0F, 0F, 0F, 1, 2, 1);
		Nix21.setRotationPoint(8.5F, -5F, 4.5F);
		Nix21.setTextureSize(64, 32);
		Nix21.mirror = true;
		setRotation(Nix21, 0F, 0F, 0F);
		Nix31 = new ModelRenderer(this, 64, 15);
		Nix31.addBox(0F, 0F, 0F, 1, 2, 1);
		Nix31.setRotationPoint(5.5F, -5F, 4.5F);
		Nix31.setTextureSize(64, 32);
		Nix31.mirror = true;
		setRotation(Nix31, 0F, 0F, 0F);
		Nix12 = new ModelRenderer(this, 72, 10);
		Nix12.addBox(0F, 0F, 0F, 1, 4, 1);
		Nix12.setRotationPoint(11.5F, -1.5F, 4.5F);
		Nix12.setTextureSize(64, 32);
		Nix12.mirror = true;
		setRotation(Nix12, 0F, 0F, 0F);
		Nix22 = new ModelRenderer(this, 68, 10);
		Nix22.addBox(0F, 0F, 0F, 1, 4, 1);
		Nix22.setRotationPoint(8.5F, -1.5F, 4.5F);
		Nix22.setTextureSize(64, 32);
		Nix22.mirror = true;
		setRotation(Nix22, 0F, 0F, 0F);
		Nix32 = new ModelRenderer(this, 64, 10);
		Nix32.addBox(0F, 0F, 0F, 1, 4, 1);
		Nix32.setRotationPoint(5.5F, -1.5F, 4.5F);
		Nix32.setTextureSize(64, 32);
		Nix32.mirror = true;
		setRotation(Nix32, 0F, 0F, 0F);
		Pylon = new ModelRenderer(this, 114, 24);
		Pylon.addBox(0F, 0F, 0F, 2, 2, 4);
		Pylon.setRotationPoint(-35F, 1F, 3.5F);
		Pylon.setTextureSize(64, 32);
		Pylon.mirror = true;
		setRotation(Pylon, 0F, 0F, 0F);
		Wire1 = new ModelRenderer(this, 82, 0);
		Wire1.addBox(0F, 0F, 0F, 20, 0, 3);
		Wire1.setRotationPoint(-24F, 7F, 4F);
		Wire1.setTextureSize(64, 32);
		Wire1.mirror = true;
		setRotation(Wire1, 0F, 0F, 0F);
		Wire2 = new ModelRenderer(this, 104, 3);
		Wire2.addBox(0F, 0F, 0F, 9, 0, 3);
		Wire2.setRotationPoint(-4F, 7F, 4F);
		Wire2.setTextureSize(64, 32);
		Wire2.mirror = true;
		setRotation(Wire2, 0F, 0F, -0.4363323F);
		Wire3 = new ModelRenderer(this, 100, 6);
		Wire3.addBox(-11F, 0F, 0F, 11, 0, 3);
		Wire3.setRotationPoint(-24F, 7F, 4F);
		Wire3.setTextureSize(64, 32);
		Wire3.mirror = true;
		setRotation(Wire3, 0F, 0F, 0.4363323F);
		PowPylon = new ModelRenderer(this, 108, 17);
		PowPylon.addBox(0F, 0F, 0F, 2, 2, 5);
		PowPylon.setRotationPoint(2.5F, 3F, 2.5F);
		PowPylon.setTextureSize(64, 32);
		PowPylon.mirror = true;
		setRotation(PowPylon, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Muzzle1.render(f5);
		Barrel1.render(f5);
		Barrel2.render(f5);
		Grip.render(f5);
		Front1.render(f5);
		Front2.render(f5);
		Body.render(f5);
		Top.render(f5);
		GripBottom.render(f5);
		Handle.render(f5);
		HandleBack.render(f5);
		Frame1.render(f5);
		Frame2.render(f5);
		Frame3.render(f5);
		Trigger.render(f5);
		BackPlate1.render(f5);
		Back.render(f5);
		BackPlate2.render(f5);
		Pump1.render(f5);
		Pump2.render(f5);
		BodyPlate.render(f5);
		Muz1.render(f5);
		Muz2.render(f5);
		Muz3.render(f5);
		Damp1.render(f5);
		Damp2.render(f5);
		Damp3.render(f5);
		DampFront.render(f5);
		EmitterRod.render(f5);
		EmitterCrystal.render(f5);
		EmitterClamp1.render(f5);
		EmitterClamp2.render(f5);
		EmitterClamp3.render(f5);
		EmitterClamp4.render(f5);
		EmitterClamp5.render(f5);
		EmitterClamp6.render(f5);
		EmitterClamp7.render(f5);
		EmitterClamp8.render(f5);
		PowBox.render(f5);
		PowPanel.render(f5);
		Nix1.render(f5);
		Nix2.render(f5);
		Nix3.render(f5);
		Nix11.render(f5);
		Nix21.render(f5);
		Nix31.render(f5);
		Nix12.render(f5);
		Nix22.render(f5);
		Nix32.render(f5);
		Pylon.render(f5);
		Wire1.render(f5);
		Wire2.render(f5);
		Wire3.render(f5);
		PowPylon.render(f5);
	}

	public void renderAnim(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float tran) {

		Pump1.offsetX += tran;
		Pump2.offsetX += tran;
		
		render(entity, f, f1, f2, f3, f4, f5);
		
		Pump1.offsetX -= tran;
		Pump2.offsetX -= tran;
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
