package pixelmon.Pokemon;

import pixelmon.entities.BaseEntityPixelmon;
import pixelmon.entities.EntityWaterPixelmon;
import pixelmon.entities.IHaveHelper;
import net.minecraft.src.*;



public class EntityOmanyte extends EntityWaterPixelmon
{
	
	public EntityOmanyte(World world)
	{
		super(world);
		depthRangeStart = 5;
		depthRangeEnd = 10;
		init();
	}

	public void init() 
	{
		name = "Omanyte";
		isImmuneToFire = false;
		super.init();
	}

	public float getMoveSpeed() 
	{
		return 2F;
	}

	public void evolve() 
	{
		IHaveHelper entity = new EntityOmastar(worldObj);
		helper.evolve(entity.getHelper());
	}
}