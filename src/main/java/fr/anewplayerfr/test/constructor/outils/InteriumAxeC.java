package fr.anewplayerfr.test.constructor.outils;

import fr.anewplayerfr.test.Main;
import net.minecraft.item.ItemAxe;

public class InteriumAxeC extends ItemAxe
{

	public InteriumAxeC(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, damage, speed);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		// TODO Auto-generated constructor stub
		
		this.setCreativeTab(Main.interTabs);
	}
	
}
