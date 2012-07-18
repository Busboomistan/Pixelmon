// Date: 5/10/2012 12:08:11 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMankey extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Leftear;
    ModelRenderer Rightear;
    ModelRenderer leftnose;
    ModelRenderer rightnose;
    ModelRenderer Tail;
    ModelRenderer Rightupperarm;
    ModelRenderer Rightlowerarm;
    ModelRenderer Rightfist;
    ModelRenderer finger2;
    ModelRenderer finger4;
    ModelRenderer Leftupperarm;
    ModelRenderer Leftlowerarm;
    ModelRenderer Leftfist;
    ModelRenderer finger1;
    ModelRenderer finger3;
    ModelRenderer Leftupperleg;
    ModelRenderer Leftlowerleg;
    ModelRenderer leftfoot;
    ModelRenderer lefttoe1;
    ModelRenderer lefttoe2;
    ModelRenderer lefttoe3;
    ModelRenderer Rightupperleg;
    ModelRenderer Rightlowerleg;
    ModelRenderer rightfoot;
    ModelRenderer righttoe1;
    ModelRenderer righttoe2;
    ModelRenderer righttoe3;
    ModelRenderer BODY;
    ModelRenderer LEFTLEG;
    ModelRenderer RIGHTLEG;
    ModelRenderer LEFTARM;
    ModelRenderer RIGHTARM;
  
  public ModelMankey()
  {
    textureWidth = 64;
    textureHeight = 32;
    
    BODY = new ModelRenderer(this, "BODY");
    BODY.setRotationPoint(0F, 16F, 0F);
    setRotation(BODY, 0F, 0F, 0F);
    BODY.mirror = true;
      ModelRenderer leftnose = new ModelRenderer(this, 0, 0);
      leftnose = new ModelRenderer(this, 0, 0);
      leftnose.addBox(0F, -1.9F, -2.6F, 0, 1, 1);
      leftnose.setRotationPoint(0F, 0F, 0F);
      leftnose.setTextureSize(64, 32);
      leftnose.mirror = true;
      setRotation(leftnose, 0.7853982F, -0.122173F, 0F);
      ModelRenderer rightnose = new ModelRenderer(this, 0, 0);
      rightnose = new ModelRenderer(this, 0, 0);
      rightnose.addBox(0F, -1.9F, -2.6F, 0, 1, 1);
      rightnose.setRotationPoint(0F, 0F, 0F);
      rightnose.setTextureSize(64, 32);
      rightnose.mirror = true;
      setRotation(rightnose, 0.7853982F, 0.122173F, 0F);
      ModelRenderer Tail = new ModelRenderer(this, 0, 18);
      Tail = new ModelRenderer(this, 0, 18);
      Tail.addBox(0F, -7F, 0F, 0, 7, 7);
      Tail.setRotationPoint(0F, 3.5F, 2F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      ModelRenderer Rightear = new ModelRenderer(this, 23, 0);
      Rightear = new ModelRenderer(this, 23, 0);
      Rightear.addBox(-4.5F, -4.5F, 1F, 2, 2, 0);
      Rightear.setRotationPoint(0F, 0F, 0F);
      Rightear.setTextureSize(64, 32);
      Rightear.mirror = true;
      setRotation(Rightear, 0F, 0F, 0.1570796F);
      ModelRenderer Leftear = new ModelRenderer(this, 23, 2);
      Leftear = new ModelRenderer(this, 23, 2);
      Leftear.addBox(2.5F, -4.5F, 1F, 2, 2, 0);
      Leftear.setRotationPoint(0F, 0F, 0F);
      Leftear.setTextureSize(64, 32);
      Leftear.mirror = true;
      setRotation(Leftear, 0F, 0F, -0.1570796F);
      ModelRenderer Body = new ModelRenderer(this, 0, 0);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-3F, -3F, -3F, 6, 6, 6);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      ModelRenderer Body2 = new ModelRenderer(this, 0, 12);
      Body2 = new ModelRenderer(this, 0, 12);
      Body2.addBox(-2.5F, -3.5F, -2.5F, 5, 7, 5);
      Body2.setRotationPoint(0F, 0F, 0F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      ModelRenderer Body1 = new ModelRenderer(this, 24, 0);
      Body1 = new ModelRenderer(this, 24, 0);
      Body1.addBox(-3.5F, -2.5F, -2.25F, 7, 5, 5);
      Body1.setRotationPoint(0F, 0F, 0F);
      Body1.setTextureSize(64, 32);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      
      BODY.addChild(Body);
      BODY.addChild(Body1);
      BODY.addChild(Body2);
      BODY.addChild(Leftear);
      BODY.addChild(Rightear);
      BODY.addChild(Tail);
      BODY.addChild(leftnose);
      BODY.addChild(rightnose);
      
      RIGHTARM = new ModelRenderer(this, "RIGHTARM");
      RIGHTARM.setRotationPoint(-3F, 0F, 0F);
      setRotation(RIGHTARM, 0F, 0F, 0F);
      RIGHTARM.mirror = true;
        ModelRenderer finger4 = new ModelRenderer(this, 62, 0);
        finger4 = new ModelRenderer(this, 62, 0);
        finger4.addBox(0F, 0F, -0.5F, 0, 1, 1);
        finger4.setRotationPoint(-1.6F, 4.1F, 0.1F);
        finger4.setTextureSize(64, 32);
        finger4.mirror = true;
        setRotation(finger4, 0F, 0F, 0F);
        ModelRenderer finger2 = new ModelRenderer(this, 62, 0);
        finger2 = new ModelRenderer(this, 62, 0);
        finger2.addBox(0F, 0F, -0.5F, 0, 1, 1);
        finger2.setRotationPoint(-2.4F, 4.1F, 0.1F);
        finger2.setTextureSize(64, 32);
        finger2.mirror = true;
        setRotation(finger2, 0F, 0F, 0F);
        ModelRenderer Rightfist = new ModelRenderer(this, 56, 0);
        Rightfist = new ModelRenderer(this, 56, 0);
        Rightfist.addBox(-1F, 0F, -0.5F, 2, 2, 1);
        Rightfist.setRotationPoint(-2F, 3F, 0F);
        Rightfist.setTextureSize(64, 32);
        Rightfist.mirror = true;
        setRotation(Rightfist, 0F, 0F, 0F);
        ModelRenderer Rightlowerarm = new ModelRenderer(this, 52, 0);
        Rightlowerarm = new ModelRenderer(this, 52, 0);
        Rightlowerarm.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
        Rightlowerarm.setRotationPoint(-2F, 1F, 0F);
        Rightlowerarm.setTextureSize(64, 32);
        Rightlowerarm.mirror = true;
        setRotation(Rightlowerarm, 0F, 0F, 0F);
        ModelRenderer Rightupperarm = new ModelRenderer(this, 48, 0);
        Rightupperarm = new ModelRenderer(this, 48, 0);
        Rightupperarm.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
        Rightupperarm.setRotationPoint(0F, 0F, 0F);
        Rightupperarm.setTextureSize(64, 32);
        Rightupperarm.mirror = true;
        setRotation(Rightupperarm, 0F, 0F, 1.117011F);
        
        BODY.addChild(RIGHTARM);
        RIGHTARM.addChild(Rightupperarm);
        RIGHTARM.addChild(Rightlowerarm);
        RIGHTARM.addChild(Rightfist);
        RIGHTARM.addChild(finger2);
        RIGHTARM.addChild(finger4);
        
    LEFTARM = new ModelRenderer(this, "LEFTARM");
    LEFTARM.setRotationPoint(3F, 0F, 0F);
    setRotation(LEFTARM, 0F, 0F, 0F);
    LEFTARM.mirror = true;
      ModelRenderer finger3 = new ModelRenderer(this, 62, 0);
      finger3 = new ModelRenderer(this, 62, 0);
      finger3.addBox(0F, 0F, -0.5F, 0, 1, 1);
      finger3.setRotationPoint(1.6F, 4.1F, 0.1F);
      finger3.setTextureSize(64, 32);
      finger3.mirror = true;
      setRotation(finger3, 0F, 0F, 0F);
      ModelRenderer finger1 = new ModelRenderer(this, 62, 0);
      finger1 = new ModelRenderer(this, 62, 0);
      finger1.addBox(0F, 0F, -0.5F, 0, 1, 1);
      finger1.setRotationPoint(2.4F, 4.1F, 0.1F);
      finger1.setTextureSize(64, 32);
      finger1.mirror = true;
      setRotation(finger1, 0F, 0F, 0F);
      ModelRenderer Leftfist = new ModelRenderer(this, 56, 0);
      Leftfist = new ModelRenderer(this, 56, 0);
      Leftfist.addBox(-1F, 0F, -0.5F, 2, 2, 1);
      Leftfist.setRotationPoint(2F, 3F, 0F);
      Leftfist.setTextureSize(64, 32);
      Leftfist.mirror = true;
      setRotation(Leftfist, 0F, 0F, 0F);
      ModelRenderer Leftlowerarm = new ModelRenderer(this, 52, 0);
      Leftlowerarm = new ModelRenderer(this, 52, 0);
      Leftlowerarm.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      Leftlowerarm.setRotationPoint(2F, 1F, 0F);
      Leftlowerarm.setTextureSize(64, 32);
      Leftlowerarm.mirror = true;
      setRotation(Leftlowerarm, 0F, 0F, 0F);
      ModelRenderer Leftupperarm = new ModelRenderer(this, 48, 0);
      Leftupperarm = new ModelRenderer(this, 48, 0);
      Leftupperarm.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Leftupperarm.setRotationPoint(0F, 0F, 0F);
      Leftupperarm.setTextureSize(64, 32);
      Leftupperarm.mirror = true;
      setRotation(Leftupperarm, 0F, 0F, -1.117011F);
      
      BODY.addChild(LEFTARM);
      LEFTARM.addChild(Leftupperarm);
      LEFTARM.addChild(Leftlowerarm);
      LEFTARM.addChild(Leftfist);
      LEFTARM.addChild(finger1);
      LEFTARM.addChild(finger3);
      
    LEFTLEG = new ModelRenderer(this, "LEFTLEG");
    LEFTLEG.setRotationPoint(2F, 19F, 0F);
    setRotation(LEFTLEG, 0F, 0F, 0F);
    LEFTLEG.mirror = true;
      ModelRenderer lefttoe3 = new ModelRenderer(this, 52, 8);
      lefttoe3 = new ModelRenderer(this, 52, 8);
      lefttoe3.addBox(-0.5F, 1F, 0F, 1, 1, 1);
      lefttoe3.setRotationPoint(0F, 3.6F, 0F);
      lefttoe3.setTextureSize(64, 32);
      lefttoe3.mirror = true;
      setRotation(lefttoe3, -1.37881F, 2.792527F, 0F);
      ModelRenderer lefttoe2 = new ModelRenderer(this, 48, 8);
      lefttoe2 = new ModelRenderer(this, 48, 8);
      lefttoe2.addBox(-0.5F, 1F, 0F, 1, 2, 1);
      lefttoe2.setRotationPoint(0F, 3.6F, 0F);
      lefttoe2.setTextureSize(64, 32);
      lefttoe2.mirror = true;
      setRotation(lefttoe2, -1.43117F, -0.837758F, 0F);
      ModelRenderer lefttoe1 = new ModelRenderer(this, 48, 8);
      lefttoe1 = new ModelRenderer(this, 48, 8);
      lefttoe1.addBox(-0.5F, 1F, 0F, 1, 2, 1);
      lefttoe1.setRotationPoint(0F, 3.6F, 0F);
      lefttoe1.setTextureSize(64, 32);
      lefttoe1.mirror = true;
      setRotation(lefttoe1, -1.43117F, 0.0872665F, 0F);
      ModelRenderer leftfoot = new ModelRenderer(this, 56, 4);
      leftfoot = new ModelRenderer(this, 56, 4);
      leftfoot.addBox(-0.5F, 0F, -1.5F, 1, 1, 3);
      leftfoot.setRotationPoint(0F, 3.6F, 0F);
      leftfoot.setTextureSize(64, 32);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0.1047198F, -0.3490659F, 0F);
      ModelRenderer Leftlowerleg = new ModelRenderer(this, 52, 4);
      Leftlowerleg = new ModelRenderer(this, 52, 4);
      Leftlowerleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Leftlowerleg.setRotationPoint(0.4F, 2F, -1.2F);
      Leftlowerleg.setTextureSize(64, 32);
      Leftlowerleg.mirror = true;
      setRotation(Leftlowerleg, 0.7504916F, -0.3490659F, 0F);
      ModelRenderer Leftupperleg = new ModelRenderer(this, 48, 4);
      Leftupperleg = new ModelRenderer(this, 48, 4);
      Leftupperleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Leftupperleg.setRotationPoint(0F, 0F, 0F);
      Leftupperleg.setTextureSize(64, 32);
      Leftupperleg.mirror = true;
      setRotation(Leftupperleg, -0.5061455F, -0.3490659F, 0F);
      
      LEFTLEG.addChild(Leftupperleg);
      LEFTLEG.addChild(Leftlowerleg);
      LEFTLEG.addChild(leftfoot);
      LEFTLEG.addChild(lefttoe1);
      LEFTLEG.addChild(lefttoe2);
      LEFTLEG.addChild(lefttoe3);
      
    RIGHTLEG = new ModelRenderer(this, "RIGHTLEG");
    RIGHTLEG.setRotationPoint(-2F, 19F, 0F);
    setRotation(RIGHTLEG, 0F, 0F, 0F);
    RIGHTLEG.mirror = true;
      ModelRenderer righttoe3 = new ModelRenderer(this, 52, 8);
      righttoe3 = new ModelRenderer(this, 52, 8);
      righttoe3.addBox(-0.5F, 1F, 0F, 1, 1, 1);
      righttoe3.setRotationPoint(0F, 3.6F, 0F);
      righttoe3.setTextureSize(64, 32);
      righttoe3.mirror = true;
      setRotation(righttoe3, -1.37881F, -2.792527F, 0F);
      ModelRenderer Rightupperleg = new ModelRenderer(this, 48, 4);
      Rightupperleg = new ModelRenderer(this, 48, 4);
      Rightupperleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Rightupperleg.setRotationPoint(0F, 0F, 0F);
      Rightupperleg.setTextureSize(64, 32);
      Rightupperleg.mirror = true;
      setRotation(Rightupperleg, -0.5061455F, 0.3490659F, 0F);
      ModelRenderer righttoe2 = new ModelRenderer(this, 48, 8);
      righttoe2 = new ModelRenderer(this, 48, 8);
      righttoe2.addBox(-0.5F, 1F, 0F, 1, 2, 1);
      righttoe2.setRotationPoint(0F, 3.6F, 0F);
      righttoe2.setTextureSize(64, 32);
      righttoe2.mirror = true;
      setRotation(righttoe2, -1.43117F, -0.0872665F, 0F);
      ModelRenderer righttoe1 = new ModelRenderer(this, 48, 8);
      righttoe1 = new ModelRenderer(this, 48, 8);
      righttoe1.addBox(-0.5F, 1F, 0F, 1, 2, 1);
      righttoe1.setRotationPoint(0F, 3.6F, 0F);
      righttoe1.setTextureSize(64, 32);
      righttoe1.mirror = true;
      setRotation(righttoe1, -1.43117F, 0.837758F, 0F);
      ModelRenderer rightfoot = new ModelRenderer(this, 56, 4);
      rightfoot = new ModelRenderer(this, 56, 4);
      rightfoot.addBox(-0.5F, 0F, -1.5F, 1, 1, 3);
      rightfoot.setRotationPoint(0F, 3.6F, 0F);
      rightfoot.setTextureSize(64, 32);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0.1047198F, 0.3490659F, 0F);
      ModelRenderer Rightlowerleg = new ModelRenderer(this, 52, 4);
      Rightlowerleg = new ModelRenderer(this, 52, 4);
      Rightlowerleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Rightlowerleg.setRotationPoint(-0.4F, 2F, -1.2F);
      Rightlowerleg.setTextureSize(64, 32);
      Rightlowerleg.mirror = true;
      setRotation(Rightlowerleg, 0.7504916F, 0.3490659F, 0F);
      
      RIGHTLEG.addChild(Rightupperleg);
      RIGHTLEG.addChild(Rightlowerleg);
      RIGHTLEG.addChild(rightfoot);
      RIGHTLEG.addChild(righttoe1);
      RIGHTLEG.addChild(righttoe2);
      RIGHTLEG.addChild(righttoe3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    BODY.render(f5);
    LEFTLEG.render(f5);
    RIGHTLEG.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
