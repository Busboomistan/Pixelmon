package pixelmon.Pokemon;

import pixelmon.entities.BaseEntityPixelmon;
import pixelmon.entities.EntityGroundPixelmon;
import net.minecraft.src.*;

public class EntityIvysaur extends EntityGroundPixelmon
{
	
	public EntityIvysaur(World world)
	{
		super(world);
		init();
	}

	public void init()
	{
		name = "Ivysaur";
		isImmuneToFire = false;
		super.init();
	}

	public void evolve() 
	{
		BaseEntityPixelmon entity = new EntityVenusaur(worldObj);
		helper.evolve(entity.helper);
	}
}
