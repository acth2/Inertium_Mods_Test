package fr.anewplayerfr.test.constructor.item;

import fr.anewplayerfr.test.Main;
import net.minecraft.item.Item;

public class InteriumTest extends Item
{
	public InteriumTest(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		
		this.setCreativeTab(Main.interTabs);
	}
}
